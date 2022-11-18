package com.sportingcomplex.controller.web;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportingcomlex.service.ICategoryService;
import com.sportingcomlex.service.ISportGroundService;
import com.sportingcomplex.model.SportGroundModel;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = -6228568442953779633L;
	
	@Inject
	private ICategoryService categoryservice;
	
	@Inject
	private ISportGroundService sportGroundService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Long category = 2L;
//		String name = "cầu lông";
//		Float price = 250f;
//		Boolean status = true;
//		SportGroundModel groundModel = new SportGroundModel();
//		groundModel.setId(8L);
//		groundModel.setCategoryId(category);
//		groundModel.setName(name);
//		groundModel.setPrice(price);
//		groundModel.setStatus(status);
//		sportGroundService.update(groundModel);
//		sportGroundService.save(groundModel);
//		request.setAttribute("categories", categoryservice.findAll());
//		sportGroundService.delete(groundModel);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/ground/edit.jsp");
		rd.forward(request, response);
	}
}          
