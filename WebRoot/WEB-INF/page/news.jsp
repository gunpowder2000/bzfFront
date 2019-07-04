<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
	<title>品牌新闻</title>
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
						<h3><i>品牌新闻</i></h3>
						<div class="guide">
						<img src="images/hic.gif" /> 您当前的位置：关于布之峰 &gt; <span>品牌新闻</span>
						</div>
					</div>
					
					<div class="eidtbox">
						<div class="brand">
							<ul>
								<s:iterator value="newsList">
									<li>
										<div class="bleft">
										   <a href="/news_loadNewsDetail?newsid=<s:property value="newsid"/>" target="_blank"><img src="<s:property value="newsdigestimage"/>" height=92px;   width=140px;/></a>
										</div>
										<div class="bright">
											<h3><a href="/news_loadNewsDetail?newsid=<s:property value="newsid"/>" target="_blank"><s:property value="newstitle"/></a></h3>
											<p><s:property value="newsdigest"/></p>
											<a href="/news_loadNewsDetail?newsid=<s:property value="newsid"/>" class="tomore" target="_blank">Learn More</a>
										</div>
									</li>
								</s:iterator>
							</ul>
						</div>
					</div>
					
					<div class="page">
						<script>
							var pg = new showPages('pg');						
							pg.pageCount =${newstotal};
              					pg.printHtml(0);
           				</script>
					</div>
					
				</div>
			</div>
		</div>
	
		<!-- 引入脚部分 -->
		<jsp:include page="../../foot.jsp"/>

	</body>
</html>
