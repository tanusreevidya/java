<%@ include file="header.jsp"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 class="display-4 text-center">Admin</h2>
<div id="body" class="container mt-5">
<a href="#"></a>
    <div class="row mb-5">
        <div class="col-6 my-3">
        
            <div class="card my-card border border-curved text-center" onclick="location.href='user-home'">
                <div class="card-body">
                    <h4 class="card-title display-4">MANAGE USER</h4>
                </div>
            </div>
        </div>
        <div class="col-6 my-3">
            <div class="card my-card border border-curved text-center" onclick="location.href='category-home'">
                <div class="card-body">
                    <h4 class="card-title display-4">MANAGE CATEGORY</h4>
                </div>
            </div>
        </div>
        <div class="col-6 my-3">
            <div class="card my-card border border-curved text-center" onclick="location.href='supply-home'">
                <div class="card-body">
                    <h4 class="card-title display-4">MANAGE SUPPLY</h4>
                </div>
            </div>
        </div>
        <div class="col-6 my-3">
            <div class=" card my-card border border-curved text-center" onclick="location.href='product-home'">
                <div class="card-body">
                    <h4 class="card-title display-4">MANAGE PRODUCTS</h4>
                </div>
            </div>
        </div>
    </div>
</div>

