<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <!-- Site made with Mobirise Website Builder v4.8.7, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v4.8.7, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <link rel="shortcut icon" href="/Project1WebApplication/resources/assets/images/4606293-1-122x132.jpg" type="image/x-icon">
  <meta name="description" content="">
  <title>MangaWorld</title>
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/web/assets/mobirise-icons/mobirise-icons.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/tether/tether.min.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/socicon/css/styles.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/animatecss/animate.min.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/dropdown/css/style.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/theme/css/style.css">
  <link rel="stylesheet" href="/Project1WebApplication/resources/assets/mobirise/css/mbr-additional.css" type="text/css">
  
  
  
</head>
<body>
  <section class="menu cid-rcAkZnCOQ8" once="menu" id="menu1-2">

    

    <nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-toggleable-sm">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <div class="hamburger">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
            </div>
        </button>
        <div class="menu-logo">
            <div class="navbar-brand">
                <span class="navbar-logo">
                    <a href="/Project1WebApplication/index">
                         <img src="/Project1WebApplication/resources/assets/images/4606293-1-122x132.jpg" alt="Mobirise" title="" style="height: 3.8rem;">
                    </a>
                </span>
                <span class="navbar-caption-wrap"><a class="navbar-caption text-white display-4" href="/Project1WebApplication/index">MangaWorld</a></span>
            </div>
        </div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav nav-dropdown" data-app-modern-menu="true"><li class="nav-item">
                    <a class="nav-link link text-white display-4" href="/Project1WebApplication/user/signIn">Sign In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link link text-white display-4" href="/Project1WebApplication/user/signUp">Sign Up</a>
                </li></ul>
            <div class="navbar-buttons mbr-section-btn"><a class="btn btn-sm btn-danger display-4" href="https://mobirise.co"><span class="mbri-search mbr-iconfont mbr-iconfont-btn"></span>Search</a></div>
        </div>
    </nav>
</section>

<section class="engine"><a href="https://mobirise.info/m">free site design templates</a></section><section class="mbr-section content5 cid-rcvfufkFDD" id="content5-2">

    

    <div class="mbr-overlay" style="opacity: 0.4; background-color: rgb(35, 35, 35);">
    </div>

    <div class="container">
        <div class="media-container-row">
            <div class="title col-12 col-md-8">
                <h2 class="align-center mbr-bold mbr-white pb-3 mbr-fonts-style display-1">MangaWorld<br></h2>
                <h3 class="mbr-section-subtitle align-center mbr-light mbr-white pb-3 mbr-fonts-style display-5">The world of Manga and Anime<br></h3>
                
                
            </div>
        </div>
    </div>
</section>

<section class="features2 cid-rcvfHKpJhu" id="features2-3">

    

    
    
    <div class="container">
        <div class="media-container-row">
            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(0).id}"><img src="${list.get(0).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            ${list.get(0).creation.name}</h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(0).creation.description}</p>
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(1).id}"><img src="${list.get(1).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box ">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            ${list.get(1).creation.name}
                        </h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(1).creation.description}</p>
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(2).id}"><img src="${list.get(2).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            ${list.get(2).creation.name}
                        </h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(2).creation.description}</p>
                    </div>
                </div>
            </div>

            
        </div>
    </div>
</section>

<section class="features2 cid-rcvfIrtb5B" id="features2-4">

    

    
    
    <div class="container">
        <div class="media-container-row">
            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(3).id}"><img src="${list.get(3).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">${list.get(3).creation.name}</h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(3).creation.description}</p>
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(4).id}"><img src="${list.get(4).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box ">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            ${list.get(4).creation.name}
                        </h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(4).creation.description}</p>
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(5).id}"><img src="${list.get(5).imageurl}" alt="BookImage" title="moreinfo" height="469" width="670"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            ${list.get(5).creation.name}
                        </h4>
                        <p class="mbr-text mbr-fonts-style display-7">${list.get(5).creation.description}</p>
                    </div>
                </div>
            </div>

            
        </div>
    </div>
</section>

<section class="features16 cid-rcy4QXmzvS" id="features16-2">
    
    
    
    <div class="container align-center">
        <h2 class="pb-3 mbr-fonts-style mbr-section-title display-2">
            OUR AWESOME TEAM
        </h2>
        
        <div class="row media-row">
            
        <div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(6).id}"><img src="${list.get(6).imageurl}" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           ${list.get(6).creation.name}
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>${list.get(6).creation.author.name}</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(7).id}"><img src="${list.get(7).imageurl}" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           ${list.get(7).creation.name}
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>${list.get(7).creation.author.name}</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(8).id}"><img src="${list.get(8).imageurl}" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           ${list.get(8).creation.name}
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>${list.get(8).creation.author.name}</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(9).id}"><img src="${list.get(9).imageurl}" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           ${list.get(9).creation.name}
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>${list.get(9).creation.author.name}</p>
                    </div>
                    
                </div>
            </div></div>    
    </div>
</section>

<section class="features16 cid-rcy602kxR5" id="features16-6">
    
    
    
    <div class="container align-center">
        <h2 class="pb-3 mbr-fonts-style mbr-section-title display-2">
            OUR AWESOME TEAM
        </h2>
        
        <div class="row media-row">
            
        <div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(10).id}"><img src="/Project1WebApplication/resources/assets/images/6-1-308x431.jpg" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           book.creation.name
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>book.creation.author.name</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(11).id}"><img src="/Project1WebApplication/resources/assets/images/7-1-313x445.jpg" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           book.creation.name
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>book.creation.author.name</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(12).id}"><img src="/Project1WebApplication/resources/assets/images/8-208x350.jpg" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           book.creation.name
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>book.creation.author.name</p>
                    </div>
                    
                </div>
            </div><div class="team-item col-lg-3 col-md-6">
                <div class="item-image">
                    <a href="/Project1WebApplication/book/info?id=${list.get(13).id}"><img src="/Project1WebApplication/resources/assets/images/12-1-400x543.jpg" alt="BookImage" title="moreinfo" height="357" width="509"></a>
                </div>
                <div class="item-caption py-3">
                    <div class="item-name px-2">
                        <p class="mbr-fonts-style display-5">
                           book.creation.name
                        </p>
                    </div>
                    <div class="item-role px-2">
                        <p>book.creation.author.name</p>
                    </div>
                    
                </div>
            </div></div>    
    </div>
</section>

<section class="features17 cid-rcviGsauIU" id="features17-c">
    
    

    
    <div class="container-fluid">
        <div class="media-container-row">
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(14).id}"><img src="/Project1WebApplication/resources/assets/images/2-432x536.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(15).id}"><img src="/Project1WebApplication/resources/assets/images/5-432x614.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(16).id}"><img src="/Project1WebApplication/resources/assets/images/2-432x648.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(17).id}"><img src="/Project1WebApplication/resources/assets/images/1-432x679.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(1).id}"><img src="/Project1WebApplication/resources/assets/images/1-432x694.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(2).id}"><img src="/Project1WebApplication/resources/assets/images/2-432x631.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="features17 cid-rcvfJVNJiy" id="features17-6">
    
    

    
    <div class="container-fluid">
        <div class="media-container-row">
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(3).id}"><img src="/Project1WebApplication/resources/assets/images/3-432x620.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(4).id}"><img src="/Project1WebApplication/resources/assets/images/2-349x499.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <img src="/Project1WebApplication/resources/assets/images/3-333x500.jpg" alt="BookImage" title="moreinfo" height="273" width="420">
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(5).id}"><img src="/Project1WebApplication/resources/assets/images/15-432x826.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(6).id}"><img src="/Project1WebApplication/resources/assets/images/2-432x618.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
            <div class="card p-3 col-12 col-md-6 col-lg-2">
                <div class="card-wrapper">
                    <div class="card-img">
                        <a href="/Project1WebApplication/book/info?id=${list.get(7).id}"><img src="/Project1WebApplication/resources/assets/images/11-432x576.jpg" alt="BookImage" title="moreinfo" height="273" width="420"></a>
                    </div>
                    <div class="card-box">
                        <h4 class="card-title pb-3 mbr-fonts-style display-7">
                            book.creation.name
                        </h4>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="features10 cid-rcvipGr5nf" id="features10-b">

    

    
    <div class="container">
        <div class="row justify-content-center">
            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="media mb-3">
                    <div class="card-img align-self-center">
                        <span class="mbri-bootstrap mbr-iconfont"></span>
                    </div>
                    <h4 class="card-title media-body py-3 mbr-fonts-style display-7">
                        Feature1</h4>
                </div>
                <div class="card-box">
                    <p class="mbr-text mbr-fonts-style display-7">
                       Mobirise is an easy website builder - just drop site elements to your page, add content and style it to look the way you like. <a href="https://mobirise.co">Learn more...</a>
                    </p>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="media mb-3">
                    <div class="card-img align-self-center">
                        <span class="mbri-touch mbr-iconfont"></span>
                    </div>
                    <h4 class="card-title media-body py-3 mbr-fonts-style display-7">
                        Feature2</h4>
                </div>
                <div class="card-box">
                    <p class="mbr-text mbr-fonts-style display-7">
                       All sites you make with Mobirise are mobile-friendly. You don't have to create a special mobile version of your site. <a href="https://mobirise.co">Learn more...</a>
                    </p>
                </div>
            </div>

            <div class="card p-3 col-12 col-md-6 col-lg-4">
                <div class="media mb-3">
                    <div class="card-img align-self-center">
                        <span class="mbri-responsive mbr-iconfont"></span>
                    </div>
                    <h4 class="card-title media-body py-3 mbr-fonts-style display-7">
                        Feature3</h4>
                </div>
                <div class="card-box">
                    <p class="mbr-text mbr-fonts-style display-7">
                       Mobirise offers many site blocks in several themes, and though these blocks are pre-made, they are flexible. <a href="https://mobirise.co">Learn more...</a>
                    </p>
                </div>
            </div>

            
        </div>
    </div>
</section>

<section class="cid-rcvfbh676m" id="footer1-1">

    

    

    <div class="container">
        <div class="media-container-row content text-white">
            <div class="col-12 col-md-3">
                <div class="media-wrap">
                    <a href="/Project1WebApplication/index">
                        <img src="/Project1WebApplication/resources/assets/images/4606293-1-192x207.jpg" alt="Mobirise" title="">
                    </a>
                </div>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Address
                </h5>
                <p class="mbr-text">
                    1234 Street Name
                    <br>City, AA 99999
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Contacts
                </h5>
                <p class="mbr-text">
                    Email: support@mobirise.com
                    <br>Phone: +1 (0) 000 0000 001
                    <br>Fax: +1 (0) 000 0000 002
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Links
                </h5>
                <p class="mbr-text"><a href="https://www.manganetworks.co/anime/" target="_blank">Manga news</a><br><a href="https://tinanime.com/the-loai/de-cu-anime" target="_blank">Recomment Manga</a><br><a href="https://vuighe.net/" target="_blank">Anime movie</a></p>
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
                    <p class="mbr-text mbr-fonts-style display-7">
                        © Copyright 2018 - All Rights Reserved
                    </p>
                </div>
                <div class="col-md-6">
                    <div class="social-list align-right">
                        <div class="soc-item">
                            <a href="https://twitter.com/mobirise" target="_blank">
                                <span class="socicon-twitter socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.facebook.com/pages/Mobirise/1616226671953247" target="_blank">
                                <span class="socicon-facebook socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.youtube.com/c/mobirise" target="_blank">
                                <span class="socicon-youtube socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://instagram.com/mobirise" target="_blank">
                                <span class="socicon-instagram socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://plus.google.com/u/0/+Mobirise" target="_blank">
                                <span class="socicon-googleplus socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.behance.net/Mobirise" target="_blank">
                                <span class="socicon-behance socicon mbr-iconfont mbr-iconfont-social"></span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


  <script src="/Project1WebApplication/resources/assets/web/assets/jquery/jquery.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/popper/popper.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/tether/tether.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/smoothscroll/smooth-scroll.js"></script>
  <script src="/Project1WebApplication/resources/assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/viewportchecker/jquery.viewportchecker.js"></script>
  <script src="/Project1WebApplication/resources/assets/dropdown/js/script.min.js"></script>
  <script src="/Project1WebApplication/resources/assets/theme/js/script.js"></script>
  
  
  <input name="animation" type="hidden">
  </body>
</html>