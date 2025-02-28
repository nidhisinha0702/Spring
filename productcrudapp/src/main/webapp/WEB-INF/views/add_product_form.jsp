<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="col-md-6 offset-md-3">
			<h1> class="text-center mb-3">Fill the product detail</h1>
				<form action="handle-product" method="post">
				  <div class="form-group">
				    <label for="name">Product Name</label>
				    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter the product name here" name="name">
				  </div>
				  <div class="form-group">
				    <label for="description">Product Description</label>
				    <textarea class="form-control" id="description" name="description" rows="5" placeholder="Enter the product description" ></textarea>
				  </div>
				  <div class="form-check">
				  	<label class="form-check-label" for="price">Product Price</label>
				    <input type="text" class="form-check-input" id="price" name="price" placeholder="Enter Product Price" >
				  </div>
				  <div class="container text-center">
				  	<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
				  	<button type="submit" class="btn btn-primary">Add</button>
				  </div>
				</form>
		</div>
	</div>
</body>
</html>