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
			<title>加盟方式</title>
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
						
						if (getQueryString('sta') == 'JMFA'){
							addressSpan.innerHTML = '加盟方案';
							addressI.innerHTML = '加盟方案';
						} else if (getQueryString('sta') == 'JMTJ'){
							addressSpan.innerHTML = '加盟条件';
							addressI.innerHTML = '加盟条件';
						} else if (getQueryString('sta') == 'JMYS'){
							addressSpan.innerHTML = '加盟优势';
							addressI.innerHTML = '加盟优势';
						} else if (getQueryString('sta') == 'JMLC'){
							addressSpan.innerHTML = '加盟流程';
							addressI.innerHTML = '加盟流程';
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
				<h1 >加盟方式</h1>
				<ul class="sidemenu">
					<li><a href="/join_loadJoin?sta=JMFA" class="main_a">加盟方案</a></li>
					<li><a href="/join_loadJoin?sta=JMTJ" class="main_a ">加盟条件</a></li>
					<li><a href="/join_loadJoin?sta=JMYS" class="main_a ">加盟优势</a></li>
					<li><a href="/join_loadJoin?sta=JMLC" class="main_a">加盟流程</a></li>
		      	</ul>
			</div>
			<div id="right">
				<div class="title">
		        	<h3><i id = 'addressI'>加盟方式</i></h3>
		        	<div class="guide">
		        		<img src="images/hic.gif" />您当前的位置：加盟方式 &gt; <span id ='addressSpan'></span>
		        	</div>
				</div>
				
				<div class="eidtbox about">
					${joinBean.joincontent}
			  
				</div>
			</div>
		</div>
		</div>

		<!-- 引入脚部分 -->
		<jsp:include page="../../foot.jsp"/>

	</body>
</html>
