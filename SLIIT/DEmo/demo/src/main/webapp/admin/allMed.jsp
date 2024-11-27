<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<th scope="col">DrugName</th>
				<th scope="col">Category</th>
				<th scope="col">Dosage</th>
				<th scope="col">Expiary date</th>
				<th scope="col">price</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>Mark</td>
				<td>Otto</td>
				<td><button type="button" class="btn btn-success">Edit</button>
				<button type="button" class="btn btn-danger">Delete</button>
				</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td>Mark</td>
				<td>Otto</td>
				<td><button type="button" class="btn btn-success">Edit</button>
				<button type="button" class="btn btn-danger">Delete</button></td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>Larry</td>
				<td>the Bird</td>
				<td>@twitter</td>
				<td>Mark</td>
				<td>Otto</td>
				<td><button type="button" class="btn btn-success">Edit</button>
				<button type="button" class="btn btn-danger">Delete</button></td>
			</tr>
		</tbody>
	</table>



</body>
</html>