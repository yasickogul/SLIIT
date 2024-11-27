<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin : Home</title>
<%@include file="../allComp/allComp.jsp"%>




<style type="text/css">
.card{
text-decoration: none;
color: black;
}


.card:hover{
background-color: black;
color: white;
transition: transform 0.6s ease;
transform: scale(1.2);
}
</style>




</head>
<body>
<%@include file="navBar.jsp" %>
	<div class="container">
		<div class="row p-5">
			<div class="col-md-3">
				<a href="../addMed.jsp">
					<div class="card">
						<div class="card-body text-center">
							<i
								class="fa-solid fa-prescription-bottle-medical fa-3x text-primary"></i><br>
							<h4>Add Medicine</h4>
							------------
						</div>
					</div>
				</a>
			</div>



			<div class="col-md-3">
				<a href="allMed.jsp">
					<div class="card">
						<div class="card-body text-center">
							<i class="fa-solid fa-capsules fa-3x text-danger"></i><br>
							<h4>All medicines</h4>
							------------
						</div>
					</div>
				</a>
			</div>





			<div class="col-md-3">
				<a href="orders.jsp">
					<div class="card">
						<div class="card-body text-center">
							<i class="fa-solid fa-box fa-3x text-warning"></i><br>
							<h4>Orders</h4>
							------------
						</div>
					</div>
				</a>
			</div>



			<div class="col-md-3">
				<a href="#">
					<div class="card">
						<div class="card-body text-center">
							<i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br>
							<h4>Logout</h4>
							------------
						</div>
					</div>
				</a>
			</div>



		</div>

	</div>




</body>
</html>