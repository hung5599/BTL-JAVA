package com.sportingcomplex.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.model.UsModel;
import com.sportingcomplex.model.UserModel;
import com.sportingcomplex.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-user"})

public class UserAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4048532077759170788L;
	
	@Inject
	private IUserService userService;
	
	// thêm tk user
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		UserModel user = HttpUtil.of(request.getReader()).toModel(UserModel.class);
		user = userService.save(user);
		mapper.writeValue(response.getOutputStream(), user);
	}

}







