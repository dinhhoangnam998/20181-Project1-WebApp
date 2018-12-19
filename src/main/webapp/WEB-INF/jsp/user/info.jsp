<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta name="description" content="Web Site Generator Description">
<title>User Info</title>
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
	href="/Project1WebApplication/resources/assets/socicon/css/styles.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/theme/css/style.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/mobirise/css/mbr-additional.css"
	type="text/css">



</head>
<body>
	<section class="menu cid-rcAl1mqHtK" once="menu" id="menu1-3">



		<nav
			class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-toggleable-sm">
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
						href="/Project1WebApplication/index">MangaWorld</a></span>
				</div>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown" data-app-modern-menu="true">
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/signIn">Sign In</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/signUp">Sign Up</a></li>
				</ul>
				<div class="navbar-buttons mbr-section-btn">
					<a class="btn btn-sm btn-danger display-4"
						href="https://mobirise.co"><span
						class="mbri-search mbr-iconfont mbr-iconfont-btn"></span>Search</a>
				</div>
			</div>
		</nav>
	</section>

	<section class="engine">
		<a href="https://mobirise.info">Mobirise</a>
	</section>
	<section class="mbr-section content5 cid-rcvjnhzhfo" id="content5-g">



		<div class="mbr-overlay"
			style="opacity: 0.4; background-color: rgb(35, 35, 35);"></div>

		<div class="container">
			<div class="media-container-row">
				<div class="title col-12 col-md-8">
					<h2
						class="align-center mbr-bold mbr-white pb-3 mbr-fonts-style display-1">MangaWorld</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light mbr-white pb-3 mbr-fonts-style display-5">
						The world of Manga and Anime<br>
					</h3>


				</div>
			</div>
		</div>
	</section>

	<section class="mbr-section form1 cid-rcviVlEu9f" id="form1-e">




		<div class="container">
			<div class="row justify-content-center">
				<div class="title col-12 col-lg-8">
					<h2
						class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
						User Info</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
						Your info</h3>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row justify-content-center">
				<div class="media-container-column col-lg-8"
					data-form-type="formoid">
					<form:form class="mbr-form" method="POST"
						action="/Project1WebApplication/user/signUp" modelAttribute="user">

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7" path="id">Id</form:label>
									<form:input readonly="true" type="text" class="form-control"
										path="id" />
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="username">Username</form:label>
									<form:input readonly="true" type="text" class="form-control"
										path="username" />
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="email">Email</form:label>
									<form:input readonly="true" type="email" class="form-control"
										path="email" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="fullname">Full Name</form:label>
									<form:input readonly="true" type="text" class="form-control"
										path="fullname" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="gender">Gender</form:label>
									<form:input readonly="true" type="number" class="form-control"
										path="gender" min="1" max="3" />
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="birthday">Birth Day</form:label>
									<form:input readonly="true" type="date" class="form-control"
										path="birthday" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="address">Address</form:label>
									<form:input readonly="true" type="text" class="form-control"
										path="address" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="phone">Phone</form:label>
									<form:input readonly="true" type="text" class="form-control"
										path="phone" />
								</div>
							</div>
						</div>

						<span class="input-group-btn"> <a
							href="/Project1WebApplication/user/edit?id=${user.id}"
							class="btn btn-primary btn-form display-4" role="button">Edit
								Info</a> <a href="/Project1WebApplication/user/signIn"
							class="btn btn-primary btn-form display-4">Sign In</a>
						</span>
					</form:form>
				</div>
			</div>
		</div>
	</section>

	<section class="tabs3 cid-rcvm629JkM" id="tabs3-w">





		<div class="container">
			<h2
				class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
				Sologan</h2>

		</div>
		<div class="container-fluid">
			<div class="row tabcont">
				<ul class="nav nav-tabs pt-3 mt-5" role="tablist">
					<li class="nav-item mbr-fonts-style"><a
						class="nav-link active show display-7" role="tab"
						data-toggle="tab" href="#tabs3-w_tab0" aria-selected="true">
							Responsive </a></li>
					<li class="nav-item mbr-fonts-style"><a
						class="nav-link  show active display-7" role="tab"
						data-toggle="tab" href="#tabs3-w_tab1" aria-selected="true">
							No coding </a></li>
					<li class="nav-item mbr-fonts-style"><a
						class="nav-link show active display-7" role="tab"
						data-toggle="tab" href="#tabs3-w_tab2" aria-selected="true">
							Unique Styles </a></li>



				</ul>
			</div>
		</div>

		<div class="container">
			<div class="row px-1">
				<div class="tab-content">
					<div id="tab1" class="tab-pane in active mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>


						</div>
					</div>

					<div id="tab2" class="tab-pane  mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>


						</div>
					</div>

					<div id="tab3" class="tab-pane  mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>


						</div>
					</div>

					<div id="tab4" class="tab-pane  mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-responsive mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									MOBILE FRIENDLY</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									No special actions required, all sites you make with Mobirise
									are mobile-friendly. You don't have to create a special mobile
									version of your site, it will adapt automagically.</p>
							</div>


						</div>
					</div>

					<div id="tab5" class="tab-pane  mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-bootstrap mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									IT'S EASY AND SIMPLE</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Cut down the development time with drag-and-drop website
									builder. Drop the blocks into the page, edit content inline and
									publish - no technical skills required.</p>
							</div>


						</div>
					</div>

					<div id="tab6" class="tab-pane  mbr-table" role="tabpanel">
						<div class="row tab-content-row">
							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>

							<div class="col-xs-12 col-md-6 col-lg-4">
								<div class="card-img ">
									<span class="mbri-extension mbr-iconfont"></span>
								</div>
								<h4
									class="mbr-element-title  align-center mbr-fonts-style pb-2 display-5">
									TRENDY WEBSITE BLOCKS</h4>
								<p
									class="mbr-section-text  align-center mbr-fonts-style display-7">
									Choose from the large selection pre-made blocks - full-screen
									intro, bootstrap carousel, slider, responsive image gallery
									with, parallax scrolling, sticky header and more.</p>
							</div>


						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="cid-rcvAasA5va" id="footer1-1c">





		<div class="container">
			<div class="media-container-row content text-white">
				<div class="col-12 col-md-3">
					<div class="media-wrap">
						<a href="/Project1WebApplication/index"> <img
							src="/Project1WebApplication/resources/assets/images/4606293-1-192x207.jpg"
							alt="Mobirise" title="">
						</a>
					</div>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3">Address</h5>
					<p class="mbr-text">
						1234 Street Name <br>City, AA 99999
					</p>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3">Contacts</h5>
					<p class="mbr-text">
						Email: support@mobirise.com <br>Phone: +1 (0) 000 0000 001 <br>Fax:
						+1 (0) 000 0000 002
					</p>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3">Links</h5>
					<p class="mbr-text">
						<a href="https://www.manganetworks.co/anime/" target="_blank">Manga
							news</a><br> <a href="https://tinanime.com/the-loai/de-cu-anime"
							target="_blank">Recomment Manga</a><br> <a
							href="https://vuighe.net/" target="_blank">Anime movie</a>
					</p>
				</div>
			</div>
			<div class="footer-lower">
				<div class="media-container-row">
					<div class="col-sm-12">
						<hr>
					</div>
				</div>
				<div class="media-container-row mbr-white">
					<div class="col-sm-6 copyright">
						<p class="mbr-text mbr-fonts-style display-7">© Copyright 2018
							- All Rights Reserved</p>
					</div>
					<div class="col-md-6">
						<div class="social-list align-right">
							<div class="soc-item">
								<a href="https://twitter.com/mobirise" target="_blank"> <span
									class="socicon-twitter socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
							<div class="soc-item">
								<a
									href="https://www.facebook.com/pages/Mobirise/1616226671953247"
									target="_blank"> <span
									class="socicon-facebook socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
							<div class="soc-item">
								<a href="https://www.youtube.com/c/mobirise" target="_blank">
									<span
									class="socicon-youtube socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
							<div class="soc-item">
								<a href="https://instagram.com/mobirise" target="_blank"> <span
									class="socicon-instagram socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
							<div class="soc-item">
								<a href="https://plus.google.com/u/0/+Mobirise" target="_blank">
									<span
									class="socicon-googleplus socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
							<div class="soc-item">
								<a href="https://www.behance.net/Mobirise" target="_blank">
									<span
									class="socicon-behance socicon mbr-iconfont mbr-iconfont-social"></span>
								</a>
							</div>
						</div>
					</div>
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
		src="/Project1WebApplication/resources/assets/mbr-tabs/mbr-tabs.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/theme/js/script.js"></script>
	<!--  <!--   <script src="/Project1WebApplication/resources/assets/formoid/formoid.min.js"></script> -->
	-->


	<input name="animation" type="hidden">
</body>
</html>