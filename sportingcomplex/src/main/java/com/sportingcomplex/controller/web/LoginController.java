package com.sportingcomplex.controller.web;

import java.io.IOException;

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


@WebServlet(urlPatterns = {"/dang-nhap","/thoat"})
public class LoginController extends HttpServlet{
	
	@Inject
	private IUserService userService;
	private static final long serialVersionUID = -6228568442953779633L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			response.sendRedirect(request.getContextPath()+"/trang-chu");
		} 

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUserNameAndPassword(model.getUserName(), model.getPassWord());
			if(model!=null) {
				SessionUtil.getInstance().putValue(request,"UserModel", model);
				if(model.getRole().getCode().equals("user")) {
					response.sendRedirect(request.getContextPath()+"/trang-chu");
				}
				else if(model.getRole().getCode().equals("admin")){
					response.sendRedirect(request.getContextPath()+"/admin-home");
				}
				else {
					response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
				}
			}
		}
	}
}          
