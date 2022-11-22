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

@WebServlet(urlPatterns = {"/sign-up"})
public class SignUpController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	IUserService userService;
	ResourceBundle resourceBundle = ResourceBundle.getBundle("mess");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String alert = request.getParameter("alert");
		String mess = request.getParameter("mess");
		if (mess != null && alert != null) {
			request.setAttribute("mess", resourceBundle.getString(mess));
			request.setAttribute("alert", alert);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/signup.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel model = FormUtil.toModel(UserModel.class,request);
		UserModel model1 = userService.findByUserName(model.getUserName());
		if(model1!=null) {
			response.sendRedirect(request.getContextPath()+"/sign-up?mess=taikhoandatontai&alert=danger");
		}
		else {
			String pass = request.getParameter("passWord");
			String repass = request.getParameter("repassWord");
			if(!pass.equals(repass)) {
				response.sendRedirect(request.getContextPath()+"/sign-up?mess=xacnhanmatkhaukhongdung&alert=danger");
			}
			else {
				userService.save(model);
				response.sendRedirect(request.getContextPath()+"/log-in?action=login&mess=dangkythanhcong&alert=primary");
			}
			
		}
	}
}