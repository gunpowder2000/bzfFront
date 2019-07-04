<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib  uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<title>企业简介</title>
			<link href="css/reset.css" type="text/css" rel="stylesheet" />
			<link href="css/style.css" type="text/css" rel="stylesheet" />
			<link href="css/archenav.css" rel="stylesheet" />
			<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
			<link type="image/x-icon" rel="shortcut icon" href="favicon.ico" />
			
			<script type="text/javascript" src="js/jquery.js"></script>
			<script type="text/javascript" src="js/main.js"></script>
			<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
			<script type="text/javascript" src="js/archenav.js"></script>
			<script type="text/javascript" src="js/util.js"></script>
			
			<script type="text/javascript">
					window.onload=function(){
						var addressSpan=document.getElementById ("addressSpan");
						var addressI=document.getElementById ("addressI");
						
						if (getQueryString('sta') == 'GSJJ'){
							addressSpan.innerHTML = '公司简介';
							addressI.innerHTML = '公司简介';
						} else if (getQueryString('sta') == 'CZLC'){
							addressSpan.innerHTML = '成长历程';
							addressI.innerHTML = '成长历程';
						} else if (getQueryString('sta') == 'PPLN'){
							addressSpan.innerHTML = '品牌理念';
							addressI.innerHTML = '品牌理念';
						} else if (getQueryString('sta') == 'LXWM'){
							addressSpan.innerHTML = '联系我们';
							addressI.innerHTML = '联系我们';
						}
					};
			</script>
			
			<script type="text/javascript" >
				$(function(){
					$("#top").load("/top_loadTop");
				});
			</script>

	</head>
	<body>
		<!-- 引入头部分 -->
		<span id="top"></span>

		<div id="c_wrap">
		<div id="content">
			<div id="left">
				<h1 >关于布之峰</h1>
				<ul class="sidemenu">
					<li><a href="/about_loadAbout?sta=GSJJ" class="main_a">企业简介</a></li>
					<li><a href="/about_loadAbout?sta=CZLC" class="main_a ">成长历程</a></li>
					<li><a href="/about_loadAbout?sta=PPLN" class="main_a ">品牌理念</a></li>
					<li><a href="/news_loadNews" class="main_a">品牌新闻</a></li>
					<li><a href="/work_loadWork" class="main_a">人才招聘</a></li>
					<li><a href="/about_loadAbout?sta=LXWM" class="main_a">联系我们</a></li>
		      	</ul>
			</div>
			<div id="right">
				<div class="title">
		        	<h3><i id = 'addressI'>企业简介</i></h3>
		        	<div class="guide">
		        		<img src="images/hic.gif" />您当前的位置：关于布之峰 &gt; <span id ='addressSpan'></span>
		        	</div>
				</div>
				
				<div class="eidtbox about">
					${aboutBean.aboutcontent}
			  
				</div>
			</div>
		</div>
		</div>

		<!-- 引入脚部分 -->
		<jsp:include page="../../foot.jsp"/>

	</body>
</html>
