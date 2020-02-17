<%@include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2 class="display-4 text-center">Enter Supplier Details</h2>
<c:url var="userUrl" value="/supply/save"></c:url>
<form:form action="${userUrl}" modelAttribute="supply">

	<div class="container">
		<c:if test="${!empty supply.supplierName}">
			<div class="form-group">
				<form:label path="supplierId">Id</form:label>
				<form:input path="supplierId" readonly="true" disabled="true"
					class="form-control"></form:input>
				<form:hidden path="supplierId" />
			</div>
		</c:if>
		<div class="row">
			<div class="form-group col">
			<form:label path="supplierName">Supplier Name</form:label>
			<form:input path="supplierName" class="form-control" />
		</div>
		<div class="form-group col">
			<form:label path="productName">Product Name</form:label>
			<form:input path="productName" class="form-control" />
		</div>
		</div>
		<div class="form-group">
			<form:label path="categoryName">Category Name</form:label>
			<form:input path="categoryName" class="form-control" />
		</div>


		<div class="text-center">

			<c:if test="${empty supply.supplierName }">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty supply.supplierName }">
				<input type="submit" value="Update class=" btn btn-successw-25"">
			</c:if>
		</div>


	</div>
</form:form>
<br>

<h2 class="display-4 text-center">Supplier Details</h2>
<div class="container">
	<table class="table table-striped table-hover table-light text-center">
		<tr>
			<th>Supplier Id</th>
			<th>Supplier Name</th>
			<th>Product Name</th>
			<th>Category Name</th>
			<th>Actions</th>

		</tr>
		<c:forEach var="sup" items="${list }">
			<tbody>
				<tr>

					<td>${sup.supplierId}</td>
					<td>${sup.supplierName}</td>
					<td>${sup.productName}</td>
					<td>${sup.categoryName}</td>
					<td><a href="<c:url value='/removesupply/${sup.supplierId}'/>" class="btn btn-sm btn-danger">Remove</a>|
						<a href="<c:url value='/updatesupply/${sup.supplierId}'/>" class="btn btn-sm btn-warning">Update</a></td>

				</tr>
			</tbody>


		</c:forEach>

	</table>
</div>

<%@include file="footer.jsp"%>