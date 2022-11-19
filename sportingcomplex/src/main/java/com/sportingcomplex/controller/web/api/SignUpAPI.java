package com.sportingcomplex.controller.web.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportingcomlex.service.impl.UserService;
import com.sportingcomplex.model.UserModel;
import com.sportingcomplex.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-signup"})
public class SignUpAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserService userService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		UserModel userModel = HttpUtil.of(request.getReader()).toModel(UserModel.class);
		userModel = userService.save(userModel);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(response.getOutputStream(), userModel);
	}
}
