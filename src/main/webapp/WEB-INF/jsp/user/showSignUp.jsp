<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>singup</title>
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
	href="<%=request.getContextPath()%>/resources/assets/dropdown/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/socicon/css/styles.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/theme/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/mobirise/css/mbr-additional.css"
	type="text/css">



</head>
<body>
	<section class="menu cid-rbKh79BGop" once="menu" id="menu1-1a">



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
					<span class="navbar-logo"> <a href="index"> <img
							src="<%=request.getContextPath()%>/resources/assets/images/4606293-1-122x132.jpg"
							alt="Mobirise" title="" style="height: 3.8rem;">
					</a>
					</span> <span class="navbar-caption-wrap"><a
						class="navbar-caption text-white display-4" href="index">
							BookShop</a></span>
				</div>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown nav-right"
					data-app-modern-menu="true">
					<li class="nav-item"><a
						class="nav-link link text-white display-4" href="showsignin">Sign
							In</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4" href="showsignup">Sign
							Up</a></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="engine">
		<a href="https://mobirise.info/p">website templates free download</a>
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


					<form class="mbr-form" action="signup" method="post">
						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7"">Username</label>
									<input type="text" class="form-control" name="username">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Password</label>
									<input type="password" class="form-control" name="password">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Confirm
										Password</label> <input type="password" class="form-control"
										name="confirmpassword">
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Email</label>
									<input type="email" class="form-control" name="email">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Full
										Name</label> <input type="text" class="form-control" name="fullname">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Gender</label>
									<input type="number" class="form-control" name="gender" min="1"
										max="3">
								</div>
							</div>
						</div>

						<div class="row row-sm-offset">
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Birth
										Day</label> <input type="date" class="form-control" name="birthday">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Address</label>
									<input type="text" class="form-control" name="address">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7">Phone</label>
									<input type="text" class="form-control" name="phonenumber">
								</div>
							</div>
						</div>

						<span class="input-group-btn"><input type="submit"
							class="btn btn-primary btn-form display-4"></span>
					</form>
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

	<section class="footer4 cid-rbKh9C5Jrd" id="footer4-1b">





		<div class="container">
			<div class="media-container-row content mbr-white">
				<div class="col-md-3 col-sm-4">
					<div class="mb-3 img-logo">
						<a href="https://mobirise.co/"> <img
							src="<%=request.getContextPath()%>/resources/assets/images/logo2.png"
							alt="Mobirise">
						</a>
					</div>
					<p class="mb-3 mbr-fonts-style foot-title display-7">MOBIRISE</p>
					<p class="mbr-text mbr-fonts-style mbr-links-column display-7">
						<a href="#" class="text-white">About Us</a> <br>
						<a href="#" class="text-white">Services</a> <br>
						<a href="#" class="text-white">Selected Work</a> <br>
						<a href="#" class="text-white">Get In Touch</a>
					</p>
				</div>
				<div class="col-md-4 col-sm-8">
					<p class="mb-4 foot-title mbr-fonts-style display-7">RECENT
						NEWS</p>
					<p class="mbr-text mbr-fonts-style foot-text display-7">
						Footer with solid color background and a contact form, Easily add
						subscribe and contact forms without any server-side integration. <br>
						<br>Mobirise helps you cut down development time by providing
						you with a flexible website editor with a drag and drop interface.
					</p>
				</div>
				<div class="col-md-4 offset-md-1 col-sm-12">
					<p class="mb-4 foot-title mbr-fonts-style display-7">SUBSCRIBE
					</p>
					<p class="mbr-text mbr-fonts-style form-text display-7">Get
						monthly updates and free resources.</p>
					<div class="media-container-column" data-form-type="formoid">
						<div data-form-alert="" hidden="" class="align-center">
							Thanks for filling out the form!</div>

						<form class="form-inline" action="https://mobirise.com/"
							method="post" data-form-title="Mobirise Form">
							<input type="hidden"
								value="xAItz46Y9RFSIRqs1oSqeA8IfIcU+5Puui6A4+jY+VH6PJ2NPRuhIgj4sV9qFFNkjEU0WvpdYCJGeRnIPSgbIE4XiV7MADI1e3w6uHMF/GZW5tvABE0qCwnpX2+RiLFF"
								data-form-email="true">
							<div class="form-group">
								<input type="email"
									class="form-control input-sm input-inverse my-2" name="email"
									required="" data-form-field="Email" placeholder="Email"
									id="email-footer4-1b">
							</div>
							<div class="input-group-btn m-2">
								<button href="" class="btn btn-primary display-4" type="submit"
									role="button">Subscribe</button>
							</div>
						</form>
					</div>
					<p class="mb-4 mbr-fonts-style foot-title display-7">CONNECT
						WITH US</p>
					<div class="social-list pl-0 mb-0">
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
							<a href="https://www.behance.net/Mobirise" target="_blank"> <span
								class="socicon-behance socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="footer-lower">
				<div class="media-container-row">
					<div class="col-sm-12">
						<hr>
					</div>
				</div>
				<div class="media-container-row mbr-white">
					<div class="col-sm-12 copyright">
						<p class="mbr-text mbr-fonts-style display-7">© Copyright 2017
							Mobirise - All Rights Reserved</p>
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
		src="<%=request.getContextPath()%>/resources/assets/smoothscroll/smooth-scroll.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/dropdown/js/script.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/theme/js/script.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/formoid/formoid.min.js"></script>


</body>
</html>