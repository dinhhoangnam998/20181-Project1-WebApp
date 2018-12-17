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
	href="<%=request.getContextPath()%>/resources/assets/images/4606293-1-122x132.jpg"
	type="image/x-icon">
<meta name="description" content="Web Page Builder Description">
<title>Sign Up</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/web/assets/mobirise-icons/mobirise-icons.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/tether/tether.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/socicon/css/styles.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/dropdown/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/theme/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/mobirise/css/mbr-additional.css"
	type="text/css">



</head>
<body>
	<section class="menu cid-rcpkMvgBew" once="menu" id="menu1-1x">



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
							src="<%=request.getContextPath()%>/resources/assets/images/4606293-1-122x132.jpg"
							alt="Mobirise" title="" style="height: 3.8rem;">
					</a>
					</span> <span class="navbar-caption-wrap"><a
						class="navbar-caption text-white display-4"
						href="/Project1WebApplication/index">MangaWorld</a></span>
				</div>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown nav-right"
					data-app-modern-menu="true">
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/signIn">Sign In</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4"
						href="/Project1WebApplication/user/signUp">Sign Up</a></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="engine">
		<a href="https://mobirise.info/u">bootstrap html templates</a>
	</section>
	<section class="mbr-section form1 cid-rb5oVrnQg6" id="form1-j">




		<div class="container">
			<div class="row justify-content-center">
				<div class="title col-12 col-lg-8">
					<h2
						class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
						Sign up</h2>
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




					<form:form class="mbr-form" method="POST"
						action="/Project1WebApplication/user/signUp" modelAttribute="user">



						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="username">Username</form:label>
									<form:input type="text" class="form-control" path="username" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="password">Password</form:label>
									<form:input type="password" class="form-control"
										path="password" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="confirmpassword">Confirm Password</form:label>
									<form:input type="password" class="form-control"
										path="confirmpassword" />
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="email">Email</form:label>
									<form:input type="email" class="form-control" path="email" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="fullname">Full Name</form:label>
									<form:input type="text" class="form-control" path="fullname" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="gender">Gender</form:label>
									<form:input type="number" class="form-control" path="gender"
										min="1" max="3" />
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="birthday">Birth Day</form:label>
									<form:input type="date" class="form-control" path="birthday" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="address">Address</form:label>
									<form:input type="text" class="form-control" path="address" />
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<form:label
										class="form-control-label mbr-fonts-style display-7"
										path="phone">Phone</form:label>
									<form:input type="text" class="form-control" path="phone" />
								</div>
							</div>
						</div>

						<span class="input-group-btn"><input type="submit"
							value="Sign Up" class="btn btn-primary btn-form display-4" /> <br>
							</button></span>
					</form:form>
				</div>
			</div>
		</div>
	</section>

	<section class="counters1 counters cid-rb5pgQtO13" id="counters1-l">





		<div class="container">
			<h2
				class="mbr-section-title pb-3 align-center mbr-fonts-style display-2">
				Counters</h2>
			<h3 class="mbr-section-subtitle mbr-fonts-style display-5">
				Mobirise is a beautiful site constructor</h3>

			<div class="container pt-4 mt-2">
				<div class="media-container-row">
					<div class="card p-3 align-center col-12 col-md-6 col-lg-4">
						<div class="panel-item p-3">
							<div class="card-img pb-3">
								<span class="mbri-mobirise mbr-iconfont"></span>
							</div>

							<div class="card-text">
								<h3 class="count pt-3 pb-3 mbr-fonts-style display-2">100</h3>
								<h4 class="mbr-content-title mbr-bold mbr-fonts-style display-7">
									Unlimited websites</h4>
								<p class="mbr-content-text mbr-fonts-style display-7">
									Mobirise give you the freedom to develop as many websites as
									you like given the fact that it is desktop app. Mobirise is the
									perfect gide.</p>
							</div>
						</div>
					</div>


					<div class="card p-3 align-center col-12 col-md-6 col-lg-4">
						<div class="panel-item p-3">
							<div class="card-img pb-3">
								<span class="mbri-touch-swipe mbr-iconfont"></span>
							</div>
							<div class="card-text">
								<h3 class="count pt-3 pb-3 mbr-fonts-style display-2">200</h3>
								<h4 class="mbr-content-title mbr-bold mbr-fonts-style display-7">
									Trendy websites blocks</h4>
								<p class="mbr-content-text mbr-fonts-style display-7">
									Choose from the large selection of latest pre-made blocks -
									jumbotrons, hero images, parallax scrolling, video backgrounds,
									hamburger menu, sticky header and more.</p>
							</div>
						</div>
					</div>

					<div class="card p-3 align-center col-12 col-md-6 col-lg-4">
						<div class="panel-item p-3">
							<div class="card-img pb-3">
								<span class="mbri-responsive mbr-iconfont"></span>
							</div>
							<div class="card-text">
								<h3 class="count pt-3 pb-3 mbr-fonts-style display-2">300</h3>
								<h4 class="mbr-content-title mbr-bold mbr-fonts-style display-7">
									Bootstrap</h4>
								<p class="mbr-content-text mbr-fonts-style display-7">One of
									Bootstrap's big point is responsiveness and obirise male
									effective use of this by genereating highly responsive website
									for you.</p>
							</div>
						</div>
					</div>



				</div>
			</div>
		</div>
	</section>

	<section class="cid-rcp9C04enm" id="footer1-1s">





		<div class="container">
			<div class="media-container-row content text-white">
				<div class="col-12 col-md-3">
					<div class="media-wrap">
						<a href="/Project1WebApplication/index"> <img
							src="<%=request.getContextPath()%>/resources/assets/images/4606293-1-192x207.jpg"
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
		src="<%=request.getContextPath()%>/resources/assets/web/assets/jquery/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/popper/popper.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/tether/tether.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/dropdown/js/script.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/smoothscroll/smooth-scroll.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/theme/js/script.js"></script>


</body>
</html>