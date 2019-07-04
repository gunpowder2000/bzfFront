<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="x-ua-compatible" content="ie=7" />
		

		<link href="css/reset.css" type="text/css" rel="stylesheet" />
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<link href="css/archenav.css" rel="stylesheet" />
		<link href="css/archenav.css" rel="stylesheet" />
		<script type="text/javascript" src="js/modernizr.custom.46884.js"></script>
		<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    	<script type="text/javascript" src="js/archenav.js"></script>

  </head>
  
  <body>
  
    	<div id="foot_wrap">
		    <div class="foot">
		       <div class="fnav">
		           <a href="/join_loadJoin?sta=JMFA">如何加盟</a><a href="/about_loadAbout?sta=GSJJ">关于公司</a><a href="/about_loadAbout?sta=LXWM">联系我们</a><a href="/work_loadWork">人才招聘</a>&nbsp;&nbsp;&nbsp;鄂ICP备12064241号 <!--<a href="#">网站地图</a>-->             
		       </div>
		       <div class="copyright">
		          Copyright © 2015 buzhifeng co.Ltd. All rights reserved. Power by Hulk 
		       </div>
		    </div>
		</div>
		
  </body>
</html>
