<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- Site made with Mobirise Website Builder v4.8.7, https://mobirise.com -->
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="generator" content="Mobirise v4.8.7, mobirise.com">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1">
<link rel="shortcut icon"
	href="/Project1WebApplication/resources/assets/images/4606293-1-122x132.jpg"
	type="image/x-icon">
<meta name="description" content="Site Creator Description">
<title>Admin-Add-InputEvent</title>
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/web/assets/mobirise-icons/mobirise-icons.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/tether/tether.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/dropdown/css/style.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/animatecss/animate.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/theme/css/style.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/mobirise/css/mbr-additional.css"
	type="text/css">



</head>
<body>
	<section class="menu cid-rcvopefRAh" once="menu" id="menu1-16">



		<nav
			class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<div class="hamburger">
					<span></span> <span></span> <span></span> <span></span>
				</div>
			</button>
			<div class="menu-logo">
				<div class="navbar-brand">
					<span class="navbar-logo"> <a
						href="/Project1WebApplication/index"> <img
							src="/Project1WebApplication/resources/assets/images/4606293-1-122x132.jpg"
							alt="Mobirise" title="" style="height: 3.8rem;">
					</a>
					</span> <span class="navbar-caption-wrap"><a
						class="navbar-caption text-white display-4"
						href="/Project1WebApplication/index"> MangaWorld</a></span>
				</div>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown nav-right"
					data-app-modern-menu="true">
					<li class="nav-item"><a
						class="nav-link link text-white display-7"
						href="/Project1WebApplication/admin/book/" target="_blank">

							Book</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-7"
						href="/Project1WebApplication/admin/user/" target="_blank">

							User</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-7"
						href="/Project1WebApplication/admin/bill/" target="_blank">

							Bill</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-7"
						href="/Project1WebApplication/admin/book_SaleEvent/"
						target="_blank"> Sale</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-7"
						href="/Project1WebApplication/admin/book_InputEvent/"
						target="_blank"> Input</a></li>
					<li class="nav-item dropdown open"><a
						class="nav-link link text-white dropdown-toggle display-7"
						href="https://mobirise.co" data-toggle="dropdown-submenu"
						aria-expanded="true"> More</a>
						<div class="dropdown-menu">
							<a class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/author/"
								aria-expanded="false">Author</a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/category/"
								aria-expanded="false">Category</a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/creation/"
								aria-expanded="false">Creation<br></a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/type/" aria-expanded="true"
								>Type</a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/publisher/" aria-expanded="true">Publisher<br></a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/saleEvent/"
								aria-expanded="true" >SaleEvent</a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/inputEvent/"
								aria-expanded="false">InputEvent</a><a
								class="text-white dropdown-item display-7"
								href="/Project1WebApplication/admin/billDetail/"
								aria-expanded="true">BillDetail</a>
						</div></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="engine">
		<a href="https://mobirise.info/f">easy website creator</a>
	</section>
	<section class="mbr-section form1 cid-rcvmZ5s3zB" id="form1-10">




		<div class="container">
			<div class="row justify-content-center">
				<div class="title col-12 col-lg-8">
					<h2
						class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
						Add InputEvent</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
						Easily add subscribe and contact forms without any server-side
						integration.</h3>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row justify-content-center">
				<div class="media-container-column col-lg-8"
					data-form-type="formoid">

		<form:form method="POST"
		action="/Project1WebApplication/admin/inputEvent/add"
		modelAttribute="inputEvent">
						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal" data-for="name">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="inputdate">inputdate</form:label>
									<form:input path="inputdate" class="form-control" type="date" />
								</div>
							</div>
						</div>
						<span class="input-group-btn"><input type="submit"
							value="Submit" class="btn btn-primary btn-form display-4" /> <br>
						</span>
					</form:form>
				</div>
			</div>
		</div>
	</section>


	<script
		src="/Project1WebApplication/resources/assets/web/assets/jquery/jquery.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/popper/popper.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/tether/tether.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/smoothscroll/smooth-scroll.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/dropdown/js/script.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/theme/js/script.js"></script>
	<!--   <script src="/Project1WebApplication/resources/assets/formoid/formoid.min.js"></script> -->


	<input name="animation" type="hidden">
</body>
</html>