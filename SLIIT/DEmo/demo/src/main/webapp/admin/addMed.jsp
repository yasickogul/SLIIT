<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin : Add Medicine</title>

</head>
<body style="background-color: #f0f2f2">
	<%@include file="navBar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Add details</h4>

						<form action="../add_Medicine" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label for="formGroupExampleInput">Medicine name:</label> <input
									type="text" class="form-control" id="formGroupExampleInput">
							</div>
							<div class="form-group">
								<label for="formGroupExampleInput2">Select category</label> <select
									class="form-control">
									<option selected>---Select---</option>
									<option>Antibiotics</option>
									<option>Painkillers</option>
									<option>Vitamins</option>
									<option>Other</option>
								</select>
							</div>



							<div class="form-group">
								<label for="formGroupExampleInput">Price :</label> <input
									type="text" class="form-control" id="formGroupExampleInput">
							</div>



							<div class="form-group">
								<label for="exampleFormControlTextarea1">Discription :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3"></textarea>
							</div>




							<div class="form-group">
								<label for="formGroupExampleInput">Book status :</label>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										name="inlineRadioOptions" id="inlineRadio2" value="inStock">
									<label class="form-check-label" for="inlineRadio2">In Stock</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										name="inlineRadioOptions" id="inlineRadio2" value="outOfStock">
									<label class="form-check-label" for="inlineRadio2">Out of stock</label>
								</div>
							</div>






							<div class="form-group">
								<label for="formGroupExampleInput">Enter manufacturer:</label> <input
									type="text" class="form-control" id="formGroupExampleInput">
							</div>

							<div class="form-group">
								<label for="formGroupExampleInput">Expiary date:</label> <input
									type="text" class="form-control" id="formGroupExampleInput">
							</div>


							<div class="form-group">
								<label for="formGroupExampleInput">Add image :</label> <input
									type="file" class="form-control" id="formGroupExampleInput"
									placeholder="Example input">
							</div>

							<button type="submit" class="btn btn-primary">Submit</button>

						</form>


					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>