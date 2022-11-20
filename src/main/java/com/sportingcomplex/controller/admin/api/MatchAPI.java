package com.sportingcomplex.controller.admin.api;

import java.io.IOException;
import java.util.*;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportingcomlex.service.IMatchservice;
import com.sportingcomplex.model.BillModel;
import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-match"})
public class MatchAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5958354489580400882L;
	
	@Inject
	private IMatchservice matchService;
	
	// lay ra danh sach cac tran dau cho admin
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		List<MatchModel> list = matchService.findAllByUserName();
		mapper.writeValue(response.getOutputStream(), list);
	}
	
	// thêm 
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("application/json");
//		ObjectMapper mapper = new ObjectMapper();
//		MatchModel matchModel = HttpUtil.of(request.getReader()).toModel(MatchModel.class);
//		matchModel = matchService.save(matchModel);
//		if(matchModel == null) {
//			mapper.writeValue(response.getOutputStream(), "{title: khung giờ đã được đặt}");
//		}
//		else mapper.writeValue(response.getOutputStream(), matchModel);
////		mapper.writeValue(response.getOutputStream(), matchModel);
//		
//	}
	
	// xóa
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		MatchModel matchModel = HttpUtil.of(request.getReader()).toModel(MatchModel.class);
		matchModel = matchService.delete(matchModel);
		mapper.writeValue(response.getOutputStream(), "{title: xóa trận đấu thành công}");
	}
}
