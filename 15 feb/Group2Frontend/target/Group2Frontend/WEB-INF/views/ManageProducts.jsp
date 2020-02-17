<%@ include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2 class="display-4 text-center">Enter product Details</h2>
	<c:url var="userUrl" value="/product/save"></c:url>
	<form:form action="${userUrl}" modelAttribute="product">
		
		<div class="container">
			<c:if test="${!empty product.productName}">
				<div class="form-group">
					<form:label path="productId">Id</form:label>
					<form:input path="productId" readonly="true"
							disabled="true"></form:input> <form:hidden path="productId" />
				</div>
			</c:if>
			<div class="row">
			  <div class="form-group col">
				<form:label path="productName">Product Name</form:label>
				<form:input path="productName" class="form-control"/>
			  </div>
			  <div class="form-group col">
				<form:label path="categoryName">Product Category</form:label>
				<form:input path="categoryName" class="form-control"/>
				</div>
			</div>
			 <div class="row">
			    <div class="form-group col">
				<form:label path="productPrice">Product Price</form:label>
				<form:input path="productPrice" class="form-control" />
			   </div>
			  <div class="form-group col">
				<form:label path="productQuantity">Product quantity</form:label>
				<form:input path="productQuantity" class="form-control"/>
			  </div>
			</div>
			<div class="form-group">
				<form:label path="productBrief">Product Price</form:label>
				<form:input path="productBrief" class="form-control"/>
			</div>
				
			<div class="text-center">
				<c:if test="${empty product.productName }">
						<input type="submit" value="Register" class="btn btn-success">
					</c:if> <c:if test="${!empty product.productName }">
						<input type="submit" value="Update" class="btn btn-warning">
					</c:if>
		  </div>
			
		</div>
	</form:form>
	<br>
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
					<td><a
						href="<c:url value='/remove-product/${pro.productId}'/>" class="btn btn-sm btn-danger">Remove</a>
					<a
						href="<c:url value='/update-product/${pro.productId}'/>" class="btn btn-sm btn-warning">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
<%@ include file="footer.jsp"%>