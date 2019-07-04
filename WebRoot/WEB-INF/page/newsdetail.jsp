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
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/main.js"></script>
		<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/archenav.js"></script>
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
					<h1>关于摩力克</h1>
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
						<div class="brand_detit">
							<h3>${newsBean.newstitle}</h3>
							<p>发布时间：${newsBean.newsdate}  </p>
						</div>
						<div class="brand_detxt">
							<p>${newsBean.newsdigest} </p> 
							<p>
								<span></span>
							</p>
							<p>${newsBean.newscontent} </p> 
							<p style="text-indent:26.25pt;">
								<span style="font-family:宋体;"></span>&nbsp;
							</p>
						</div>
						
						<div class="shareto">
						   <!-- Baidu Button BEGIN -->
							<div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare">
								<span class="bds_more">分享到：</span>
								<a class="bds_qzone"></a>
								<a class="bds_tsina"></a>
								<a class="bds_tqq"></a>
								<a class="bds_renren"></a>
								<a class="bds_t163"></a>
								<a class="shareCount"></a>
							</div>
							<script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6750440" ></script>
							<script type="text/javascript" id="bdshell_js"></script>
							<script type="text/javascript">
							document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
							</script>
							<!-- Baidu Button END -->
						</div>
						
						<div class="pagebox">
							<ul>
								<li class="prevli">&nbsp;&nbsp;</li>
								<li class="middleli"><a href="/news_loadNews">返回列表</a></li>			
							</ul>
						</div>
						
					</div>
				</div>
			</div>
		</div>

		<!-- 引入脚部分 -->
		<jsp:include page="../../foot.jsp"/>

	</body>
</html>
