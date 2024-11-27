package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static List<medicineDetails> getMedicineDetails() {
        List<medicineDetails> detail = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM medicine"; // No filtering by name, fetch all rows
            rs = stmt.executeQuery(sql);
           


            while (rs.next()) {
                int id = rs.getInt(1);
                String medicineName = rs.getString(2);
                String category = rs.getString(3);
                double price = rs.getDouble(4);
                String description = rs.getString(5);
                String status = rs.getString(6);
                String manufacturer = rs.getString(7);
                LocalDate expDate = rs.getDate(8).toLocalDate(); 
                byte[] image = rs.getBytes(9);

                System.out.println("Medicine Name: " + medicineName);
                System.out.println("Category: " + category);
            
                medicineDetails medicine = new medicineDetails(id, medicineName, category, price, description, status, manufacturer, expDate, image);
                detail.add(medicine);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources to prevent memory leaks
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return detail;
    }

    public static boolean insertMedicine(String name, String category, double price, String description, String status, String manufacturer, LocalDate expDate, byte[] image) {
        boolean isSuccess = false;
        PreparedStatement pstmt = null;

        try {
            con = DBConnect.getConnection(); 
            String sql = "INSERT INTO medicine (name, category, price, description, status, manufacturer, expDate, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Use PreparedStatement to insert data securely and prevent SQL injection
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, category);
            pstmt.setDouble(3, price);
            pstmt.setString(4, description);
            pstmt.setString(5, status);
            pstmt.setString(6, manufacturer);
            pstmt.setObject(7, expDate);  // Set LocalDate directly
            pstmt.setBytes(8, image);  // Set image data
            
            int rowsAffected = pstmt.executeUpdate();
            isSuccess = (rowsAffected > 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources to prevent memory leaks
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }

    // Other methods can be similarly corrected, following the structure of insertMedicine
}
