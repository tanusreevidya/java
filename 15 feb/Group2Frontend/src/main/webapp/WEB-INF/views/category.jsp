<%@ include file="header.jsp"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Enter Category Details</h2>
<c:url var="categoryUrl" value="/category/save" />

<div class="container p-5">
	<form:form action="${categoryUrl }" modelAttribute="category">

		<c:if test="${!empty category.categoryName}">
			<div class="form-group">
				<form:label path="categoryId">CategoryID</form:label>
				<form:input path="categoryId" class="form-control" readonly="true"
					disabled="true"></form:input>
				<form:hidden path="categoryId"/>
			</div>
		</c:if>


			<div class="form-group ">
				<form:label path="categoryName">CategoryName</form:label>
				<form:input path="categoryName" class="form-control "></form:input>
			</div>
			
		

		<div class="text-center">
			<c:if test="${empty user.username }">
				<input type="submit" value="Register" class="btn btn-success w-25">
			</c:if>
			<c:if test="${!empty user.username }">
				<input type="submit" value="update" class="btn btn-success w-25">
			</c:if>
		</div>
		
	</form:form>
</div>



<h2 class="display-4 text-center">CategoryDetails</h2>
<div class="container p-5">

	<table class="table table-light table-hover table-striped">
		<tr>
			<th>CategoryID</th>
			<th>Category Name</th>
			<th>Actions</th>
			
		</tr>
		<tbody>
			<c:forEach var="category" items="${list }">
				<tr>
					<td>${category.categoryId }</td>
					<td>${category.categoryName }</td>
			
					
					<td><a href="<c:url value='/removecategory/${category.categoryId }' />" class="btn btn-sm btn-danger">Remove</a>
						| <a href="<c:url value='/updatecategory/${category.categoryId }' />" class="btn btn-sm btn-warning">Update</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="footer.jsp"%>