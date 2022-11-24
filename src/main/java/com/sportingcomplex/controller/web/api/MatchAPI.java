package com.sportingcomplex.controller.web.api;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportingcomlex.service.IBillService;
import com.sportingcomlex.service.IMatchservice;
import com.sportingcomplex.model.BillModel;
import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-web-match"})
public class MatchAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2021629187535210344L;
	
	@Inject
	private IMatchservice matchService;
	@Inject
	private IBillService billService;
	
	// lấy ra danh sách các trận đấu của userName
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		List<MatchModel> list = matchService.findAll();
		mapper.writeValue(response.getOutputStream(), list);
	}
	
	// thêm trận đấu
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		MatchModel matchModel = HttpUtil.of(request.getReader()).toModel(MatchModel.class);
		
		MatchModel match = matchService.save(matchModel);
		// khong dat duoc tran dau nay
		if(match == null) {
			mapper.writeValue(response.getOutputStream(), "{}");
		}
		// dat duoc (tao 1 hoa don)
		if(match != null) {
			BillModel bill = billService.save(match);
			mapper.writeValue(response.getOutputStream(), match);
		}
	}
	
	// hủy trận đấu
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ObjectMapper mapper = new ObjectMapper();
		// id_san, time, date, categoryId, 
		MatchModel match = HttpUtil.of(request.getReader()).toModel(MatchModel.class);
		matchService.update(match);
		mapper.writeValue(response.getOutputStream(), "{}");
	}
}