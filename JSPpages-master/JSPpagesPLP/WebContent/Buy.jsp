<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy the Product</title>
</head>
<body>
	<div class="header-container">
		<div class="site-name" style="color: Red; font-size: 50px">
			<b>CapStore</b>&nbsp; &nbsp; <img
				src="C:\Users\bsruthi\Desktop\capstore.png" width="125" height="125" />
		</div>
	</div>
	<br>
	<br>
	<br>
	
	<table>
			<tr>
				<td><b>Product Name</td>
				<td>:${product.productName}</td></tr>
			<tr>
				<td><b>Product Category</td>
				<td>:${product.category}</td></tr>
			<tr>
				<td><b>Product Price</td>
				<td>:${product.price}</td></tr>
				
			<tr>
				<td><b><b>Image:</b></td>
				<td>:${product.imageId}</td>
			</tr>
			<tr>
			<td><b>Quantity :</td><td><input type="text"></td>
			</tr>
			<tr>
				<label for="category"><td><b>Payment Method:</b></td></label>
				<td><select name="category">
						<option value="choose">Choose Payment Method</option>
						<option value="creditCard">Credit Card</option>
						<option value="debitCard">Debit card</option>
						<option value="netBanking">Net Banking</option>
						<option value="bhimupi">BHIM/UPI</option>
						<option value="cashOnDelivery">Cash On Delivery</option>
				</select></td>
			</tr>
			<tr><td><h3>Delivery Address:</h3></td></tr>
			<tr><td><b>Address:</td><td><textarea placeholder="Enter your Address here"
			style="height: 60px; width: 400px"></textarea>  </td></tr>
			<tr><td><button type="submit" >Pay</button><td></tr>
		</table>
		
		
	
</body>
</html>