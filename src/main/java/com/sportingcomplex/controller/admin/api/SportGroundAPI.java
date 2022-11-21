package com.sportingcomplex.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportingcomlex.service.ISportGroundService;
import com.sportingcomplex.model.SportGroundModel;
import com.sportingcomplex.utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-admin-ground" })
public class SportGroundAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7618492829730661456L;
	
	@Inject
	private ISportGroundService groundService;

	// cập nhật (sửa)
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// chuyển data từ String sang model
		SportGroundModel updateGround = HttpUtil.of(request.getReader()).toModel(SportGroundModel.class);
		updateGround = groundService.update(updateGround);
		mapper.writeValue(response.getOutputStream(), updateGround);
	}
	  
	
	// xóa
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		SportGroundModel updateGround =  HttpUtil.of(request.getReader()).toModel(SportGroundModel.class);
		groundService.delete(updateGround.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}

}















