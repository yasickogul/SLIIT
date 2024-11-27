package com.admin;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class addMedServlet
 */
@WebServlet("/addMedServlet")
@MultipartConfig
public class addMedServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("mName");
            String category = request.getParameter("category");
            double price = Double.parseDouble(request.getParameter("price"));
            String description = request.getParameter("Discription");
            String status = request.getParameter("status");
            String manufacturer = request.getParameter("manuFac");
            LocalDate expDate = LocalDate.parse(request.getParameter("exp"));

            // Handle image upload
            Part filePart = request.getPart("img");
            byte[] image = null;

            // Check if file part is null or empty
            if (filePart != null && filePart.getSize() > 0) {
                image = new byte[(int) filePart.getSize()];
                filePart.getInputStream().read(image);
            } else {
                // Handle case when no image is uploaded (optional)
                System.out.println("No image uploaded. Default behavior may be set here.");
                // You can either set image to null or use a default image byte array
            }

            // Insert medicine details into the database
            boolean isSuccess = AdminDBUtil.insertMedicine(name, category, price, description, status, manufacturer, expDate, image);
            
            if (isSuccess) {
                response.sendRedirect("admin/Success.jsp");
            } else {
         
                response.sendRedirect("admin/error.jsp");
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp?error=Invalid price format");
        } catch (Exception e) {
            response.sendRedirect("error.jsp?error=An error occurred: " + e.getMessage());
        }
    }
}
