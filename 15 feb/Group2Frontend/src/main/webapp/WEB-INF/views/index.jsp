<%@ include file="header.jsp"%>

<div class="container-fluid">
	<div id="carouselExampleControls" class="carousel slide"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="<c:url value='/resources/back1.jpg' />" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="<c:url value='/resources/back1.jpg' />" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="<c:url value='/resources/back1.jpg' />" class="d-block w-100" alt="...">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleControls"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleControls"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>


	<div class="row justify-content-center my-2">
		<div class="col-3 card">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary"><a href="product-view">view</a></button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
		<div class="col-3 card">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary">view</button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
		<div class="col-3 card">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary">view</button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
	</div>
	<div class="row justify-content-center  my-2">
		<div class="col-3 card">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary">view</button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
		<div class="col-3 card">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary">view</button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
		<div class="col-3 card ">
			<img class="card-img-top"
				src="<c:url value='/resources/back1.jpg' />">
			<div class="card-body">
				<p>Hello</p>
				<button class="btn btn-sm btn-danger">add to wishlist</button>
				<button class="btn btn-sm btn-primary">view</button>
				<button class="btn btn-sm btn-warning">add to bag</button>
			</div>
		</div>
	</div>

</div>
<%@include file="footer.jsp"%>

