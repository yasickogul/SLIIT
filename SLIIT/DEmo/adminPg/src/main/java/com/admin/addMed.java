package com.admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class addMed
 */
@WebServlet("/addMed")
public class addMed extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addMed() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String medicineName = req.getParameter("mName");
			String category = req.getParameter("category");
			double price = Double.parseDouble(req.getParameter("price"));
			String description = req.getParameter("Discription");
			String status = req.getParameter("Status");
			String manufacturer = req.getParameter("manuFac");
			String date = req.getParameter("exp");
			Part imgPart = req.getPart("img");
			String imgName = imgPart.getSubmittedFileName();
			
			medDtls MD = new medDtls(medicineName,category,price,description,status,manufacturer,date,imgName);
			System.out.println(MD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
