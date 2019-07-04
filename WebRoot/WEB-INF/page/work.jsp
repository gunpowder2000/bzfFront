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
	<title>人才招聘</title>
	<link href="css/reset.css" type="text/css" rel="stylesheet" />
	<link href="css/style.css" type="text/css" rel="stylesheet" />
	<link href="css/archenav.css" rel="stylesheet" />
	<link rel="stylesheet" type="text/css" href="css/page.css" />
	
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/archenav.js"></script>
	<script type="text/javascript" src="js/page.js"></script>
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
					<h1>关于布之峰</h1>
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
		        		<h3><i>人才招聘</i></h3>
				        <div class="guide">
				            <img src="images/hic.gif" /> 您当前的位置：关于布之峰 &gt; <span>人才招聘</span>
				        </div>
		    		</div>
					<div class="ad">
			           <img src="images/about.jpg" />
					</div>
					<div class="eidtbox">
						<div class="works">
							<div class="workslist">
								<ul>
									<s:iterator value="workList">
										<li>
											<div class="tit">
												<h3><s:property value="worktitle"/></h3><span>发布时间:<s:property value="workdate"/></span>
											</div>
											<div class="txt">
												<h3><s:property value="worktitle"/> </h3>
												<p>
													<s:property value="workdigest"/>
												</p>
											</div>
											<a href="/work_loadWorkDetail?workid=<s:property value="workid"/>">查看详细</a>
									   	</li>
									 </s:iterator>
								</ul>
							</div>
						
			                <div class="page">
								<script>
									var pg = new showPages('pg');						
									pg.pageCount =${worktotal};
		              				pg.printHtml(0);
		           				</script>
							</div>
						</div>
				
	      			</div>
				</div>
			</div>
		</div>

		<!-- 引入脚部分 -->
		<jsp:include page="../../foot.jsp"/>

	</body>
</html>
