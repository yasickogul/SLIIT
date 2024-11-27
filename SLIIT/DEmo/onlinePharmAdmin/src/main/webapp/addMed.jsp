<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin : Add Medicine</title>

</head>
<body style="background-color: #f0f2f2">
	<%@include file="admin/navBar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Add details</h4>


						<form action="insert" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label for="formGroupExampleInput">Medicine name:</label> <input
									type="text" class="form-control" id="formGroupExampleInput"
									name="mName">
							</div>
							<div class="form-group">
								<label for="formGroupExampleInput2">Select category</label> <select
									class="form-control" name="category" required>
									<option value="" disabled selected>---Select---</option>
									<option value="Antibiotics">Antibiotics</option>
									<option value="Painkillers">Painkillers</option>
									<option value="Vitamins">Vitamins</option>
									<option value="Other">Other</option>
								</select>
							</div>




							<div class="form-group">
								<label for="formGroupExampleInput">Price :</label> <input
									type="text" class="form-control" id="formGroupExampleInput"
									name="price">
							</div>



							<div class="form-group">
								<label for="exampleFormControlTextarea1">Discription :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3" name="Discription"></textarea>
							</div>




							<div class="form-group">
								<label for="formGroupExampleInput">Book status :</label>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="status"
										id="inlineRadio2" value="inStock" required> <label
										class="form-check-label" for="inlineRadio2">In Stock</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="status"
										id="inlineRadio2" value="outOfStock" required> <label
										class="form-check-label" for="inlineRadio2">Out of
										stock</label>
								</div>
							</div>






							<div class="form-group">
								<label for="formGroupExampleInput">Enter manufacturer:</label> <input
									type="text" class="form-control" id="formGroupExampleInput"
									name="manuFac">
							</div>

							<div class="form-group">
								<label for="formGroupExampleInput">Expiary date:</label> <input
									type="date" class="form-control" id="formGroupExampleInput"
									name="exp">
							</div>


							<div class="form-group">
								<label for="formGroupExampleInput">Add image
									:</label> <input type="file" class="form-control"
									id="formGroupExampleInput" placeholder="Example input" name="img">
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