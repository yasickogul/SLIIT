package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add_Medicine")
public class MedicineAdd extends HttpServlet{
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String MedName=req.getParameter("");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		
	
	}}
