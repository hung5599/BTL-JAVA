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
		UserModel userModel = HttpUtil.of(request.getReader()).toModel(UserModel.class);
		userModel = userService.save(userModel);
		mapper.writeValue(response.getOutputStream(), userModel);
		
	}
	
	// sửa trạng thái của user
	// status = 1: tk đang còn hoạt động
	// status = 0: tk khoản đã bị khóa 
	protected void doPut(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
		
	}

}







