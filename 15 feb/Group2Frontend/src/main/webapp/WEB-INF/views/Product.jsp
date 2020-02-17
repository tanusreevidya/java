<%@ include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


	<c:url var="userUrl" value="/product/save"></c:url>
	<h2 class="display-4 text-center">Products Details</h2>
	<div class="container">
	
		<table class="table table-striped table-hover table-light text-center">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Product Price</th>
				<th>Product Quantity</th>
				<th>Product Brief</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="pro" items="${list }">
				<tr>
					<td>${pro.productId}</td>
					<td>${pro.productName}</td>
					<td>${pro.categoryName}</td>
					<td>${pro.productPrice}</td>
					<td>${pro.productQuantity}</td>
					<td>${pro.productBrief}</td>
					</tr>
			</c:forEach>
		</table>
	</div>
	<%@ include file="footer.jsp"%>