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
<meta name="description" content="Web Creator Description">
<title>Admin-Show-Creation</title>
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



</head>
<body>
	<section class="menu cid-rcvE2sJa5N" once="menu" id="menu1-1q">



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
		<a href="https://mobirise.info/p">website templates free download</a>
	</section>
	<section class="section-table cid-rcvmeZRIw4" id="table1-x">



		<div class="container container-table">
			<h2
				class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">
				Creation</h2>

			<div class="table-wrapper">
				<div class="container">
					<div class="row search">
						<div class="col-md-6"></div>
						<div class="col-md-6">
							<div class="dataTables_filter">
								<label class="searchInfo mbr-fonts-style display-7">Search:</label>
								<input class="form-control input-sm" disabled="">
							</div>
						</div>
					</div>
				</div>

				<div class="container scroll">
					<table class="table isSearch" cellspacing="0">

						<thead>
							<tr class="table-heads ">
								<th class="head-item mbr-fonts-style display-7">Id</th>
								<th class="head-item mbr-fonts-style display-7">Name</th>
								<th class="head-item mbr-fonts-style display-7">Description</th>
								<th class="head-item mbr-fonts-style display-7">Release Date</th>
								<th class="head-item mbr-fonts-style display-7">Category Id</th>
								<th class="head-item mbr-fonts-style display-7">Author Id</th>
								<th class="head-item mbr-fonts-style display-7">....</th>
								
								<th class="head-item mbr-fonts-style display-7"><a href="/Project1WebApplication/admin/creation/add">Add</a></th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="listItem" items="${listCreation}">
								<tr>
									<td class="body-item mbr-fonts-style display-7">${listItem.id}</td>
									<td class="body-item mbr-fonts-style display-7">${listItem.name}</td>
									<td class="body-item mbr-fonts-style display-7">${listItem.description}</td>
									<td class="body-item mbr-fonts-style display-7">${listItem.releasedate}</td>
									<td class="body-item mbr-fonts-style display-7">${listItem.category.id}</td>
									<td class="body-item mbr-fonts-style display-7">${listItem.author.id}</td>
									<td class="body-item mbr-fonts-style display-7"><a href="/Project1WebApplication/admin/creation/edit?id=${listItem.id}">Edit</a></td>
									<td class="body-item mbr-fonts-style display-7"><a href="/Project1WebApplication/admin/creation/delete?id=${listItem.id}">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="container table-info-container">
					<div class="row info">
						<div class="col-md-6">
							<div class="dataTables_info mbr-fonts-style display-7">
								<span class="infoBefore">Showing</span> <span
									class="inactive infoRows"></span> <span class="infoAfter">entries</span>
								<span class="infoFilteredBefore">(filtered from</span> <span
									class="inactive infoRows"></span> <span
									class="infoFilteredAfter"> total entries)</span>
							</div>
						</div>
						<div class="col-md-6"></div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="cid-rcvE65ei5A" id="footer1-1r">





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