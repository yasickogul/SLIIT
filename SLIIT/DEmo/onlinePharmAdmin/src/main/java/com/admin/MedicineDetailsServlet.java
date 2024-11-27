package com.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MedicineDetailsServlet")
public class MedicineDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch all medicine details using the AdminDBUtil class
        List<medicineDetails> medDtl = AdminDBUtil.getMedicineDetails();

        // Set the medicine details list as a request attribute
        request.setAttribute("medDtl", medDtl);
        
        // Forward the request to the JSP page to display the data
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/addMed.jsp");
        dispatcher.forward(request, response);
      
        
    }
}
