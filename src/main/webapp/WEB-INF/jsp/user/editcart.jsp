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
<meta name="description" content="Web Site Generator Description">
<title>Edit Cart</title>
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
	href="/Project1WebApplication/resources/assets/socicon/css/styles.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/animatecss/animate.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/datatables/data-tables.bootstrap4.min.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/dropdown/css/style.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/theme/css/style.css">
<link rel="stylesheet"
	href="/Project1WebApplication/resources/assets/mobirise/css/mbr-additional.css"
	type="text/css">

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
	margin: auto;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>
	<section class="menu cid-rcAkZnCOQ8" once="menu" id="menu1-2">



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
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/userinfo">Your Profile</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/cart">Your Cart</a></li>

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
		<a href="https://mobirise.info/q">free responsive web templates</a>
	</section>
	<section class="mbr-section content5 cid-rcvDQ46LEe" id="content5-1p">



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

	<section class="features11 cid-rcvlpYtjne" id="features11-r">





		<div class="container">
			<div class="col-md-12">
				<div class="media-container-row">
					<div class="mbr-figure" style="width: 50%;">
						<img src="${book.imageurl}" alt="Mobirise" title="">
					</div>
					<div class=" align-left aside-content">
						<h2 class="mbr-title pt-2 mbr-fonts-style display-2">
							${book.creation.name}</h2>
						<div class="mbr-section-text">
							<p class="mbr-text mb-5 pt-3 mbr-light mbr-fonts-style display-4">
								${book.description}</p>
						</div>

						<div class="block-content">
							<div class="card p-3 pr-3">
								<div class="media">

									<div class="media-body"></div>
								</div>
								<div class="card-box">
									<p class="block-text mbr-fonts-style display-4">
										CoverPrice:<s> ${book.coverprice} &#8363;</s>
									</p>
								</div>

								<div class="card-box">
									<p class="block-text mbr-fonts-style display-4">Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
										${book.coverprice * 90 / 100} &#8363;</p>
								</div>
							</div>

							<div class="card p-3 pr-3">
								<div class="media">

									<div class="media-body"></div>
								</div>
								<div class="card-box">
									<p class="block-text mbr-fonts-style display-4">
										Status: In Stock </s>
									</p>
								</div>


							</div>

							<div class="card p-3 pr-3">
								<form class="mbr-form"
									action="/Project1WebApplication/user/order/edit" method="POST">
									<input type="hidden" name="billDetailId" value="${billDetailId}" />
									<div>
										<div class="form-group">
											 New quantity: <input type="number" class="form-control px-3"
												name="newQuantity" min="1" value="${quantity}" />
										</div>
									</div>

									<span class="input-group-btn"><input type="submit"
										value="Add to Cart" class="btn btn-primary btn-form display-4" /><br>
									</span>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="section-table cid-rcvlxFNhl9" id="table1-s">


		<h2 style="text-align: center;">Book Detail Info</h2>

		<div style="width: 75%; margin: auto">
			<table>

				<tr>
					<td style="width: 35%;">Author</td>
					<td>${book.creation.author.name}</td>
				</tr>
				<tr>
					<td>Category</td>
					<td>${book.creation.category.name}</td>
				</tr>
				<tr>
					<td>Publisher</td>
					<td>${book.publisher.name}</td>
				</tr>

				<tr>
					<td>Language</td>
					<td>${book.language}</td>
				</tr>
				<tr>
					<td>Page number</td>
					<td>${book.pagenumber}</td>
				</tr>

				<tr>
					<td>Size</td>
					<td>${book.height}*${book.width}</td>
				</tr>

			</table>

		</div>

	</section>

	<section class="mbr-section article content1 cid-rcvwU0GxC8"
		id="content2-1a">



		<div class="container">
			<div class="media-container-row">
				<div class="mbr-text col-12 col-md-8 mbr-fonts-style display-7">
					<blockquote>
						<strong>Book.comment</strong> Mobirise helps you cut down
						development time by providing you with a flexible website editor
						with a drag and drop interface. Mobirise Website Builder creates
						responsive, retina and <strong>mobile friendly websites</strong>
						in a few clicks. Mobirise is one of the easiest website
						development tools <a href="https://mobirise.co/">available</a>
						today. It also gives you the freedom to develop as many websites
						as you like given the fact that it is a desktop app.
					</blockquote>
				</div>
			</div>
		</div>
	</section>

	<section class="cid-rcvDPjrfbw" id="footer1-1o">





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
		src="/Project1WebApplication/resources/assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/datatables/jquery.data-tables.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/datatables/data-tables.bootstrap4.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/dropdown/js/script.min.js"></script>
	<script
		src="/Project1WebApplication/resources/assets/theme/js/script.js"></script>


	<input name="animation" type="hidden">
</body>
</html>