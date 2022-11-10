package com.sportingcomplex.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportingcomplex.model.UserModel;
import com.sportingcomplex.utils.FormUtil;

@WebServlet(urlPatterns = {"/dat-san"})
public class DatSanController extends HttpServlet{

	private static final long serialVersionUID = -6228568442953779633L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/datsan.jsp");
			rd.forward(request, response);
	}

}          
