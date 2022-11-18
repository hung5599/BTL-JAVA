package com.sportingcomplex.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportingcomlex.service.IMatchservice;
import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.utils.FromUtil;

@WebServlet(urlPatterns = {"/admin-match"})
public class MatchController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7095918987574103130L;
	
	@Inject
	private IMatchservice matchService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MatchModel model = FromUtil.toModel(MatchModel.class, request);
		
	}
}
