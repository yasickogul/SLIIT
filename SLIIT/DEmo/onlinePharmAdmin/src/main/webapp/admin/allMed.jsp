<%@page import="com.admin.AdminDBUtil"%>
<%@page import="com.admin.medicineDetails"%>
<%@ page import="java.util.List" %>
<%@page import="com.admin.MedicineDetailsServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="navBar.jsp"%>
	<h1 class="text-center">All Medicine</h1>


	<table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Drug Name</th>
                <th scope="col">Category</th>
                <th scope="col">Dosage</th>
                <th scope="col">Expiry Date</th>
                <th scope="col">Price</th>
                <th scope="col">Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<medicineDetails> detail = AdminDBUtil.getMedicineDetails();
                request.setAttribute("medDtl", detail); // Set the medicine list as a request attribute
            %>
            
            <c:forEach var="medicine" items="${medDtl}">
                <tr>
                    <th scope="row">${medicine.id}</th>
                    <td>${medicine.name}</td>
                    <td>${medicine.category}</td>
                    <td>${medicine.discription}</td>
                    <td>${medicine.expDate}</td>
                    <td>${medicine.price}</td>
                    <td>
                        <button type="button" class="btn btn-success">Edit</button>
                        <button type="button" class="btn btn-danger">Delete</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>




</body>
</html>