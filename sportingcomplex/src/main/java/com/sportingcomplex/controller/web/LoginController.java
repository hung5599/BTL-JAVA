package com.sportingcomplex.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.model.UserModel;
import com.sportingcomplex.utils.FormUtil;
import com.sportingcomplex.utils.SessionUtil;



@WebServlet(urlPatterns = {"/log-in","/log-out"})
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = -6228568442953779633L;
	
	@Inject
	private IUserService userService;
	
	ResourceBundle resourceBundle = ResourceBundle.getBundle("mess");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action!=null && action.equals("login")) {
			String alert = request.getParameter("alert");
			String mess = request.getParameter("mess");
			if (mess != null && alert != null) {
				request.setAttribute("mess", resourceBundle.getString(mess));
				request.setAttribute("alert", alert);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		}else if(action!=null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "usermod");
			response.sendRedirect(request.getContextPath()+"/trang-chu");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action!=null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class,request);
			model = userService.findByUserNameAndPassword(model.getUserName(), model.getPassWord());
			if(model!=null) {
				SessionUtil.getInstance().putValue(request, "usermod", model);
				if(model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath()+"/trang-chu");
				}
				else if(model.getRole().getCode().equals("ADMIN")){
					response.sendRedirect(request.getContextPath()+"/admin-home");
				}
			}
			else {
				response.sendRedirect(request.getContextPath()+"/log-in?action=login&mess=saitaikhoanmatkhau&alert=danger");
			}
		}
	}
}          
