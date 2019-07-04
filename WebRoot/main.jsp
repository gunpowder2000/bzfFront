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
<title>首页</title>

		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="x-ua-compatible" content="ie=7" />
		

        <link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/slicebox.css" />
		<link rel="stylesheet" type="text/css" href="css/custom.css" />
		<link href="css/archenav.css" rel="stylesheet" />
		<script type="text/javascript" src="js/modernizr.custom.46884.js"></script>
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

		<div class="container">
			<div class="wrapper">
				<ul id="sb-slider" class="sb-slider">
					<s:iterator value="adList">
						<li>
							<a href="<s:property value="adurl"/>" target="_blank"><img src="<s:property value="adimage"/>" alt="image1"/></a>
							<div class="sb-description">
								<h3><s:property value="adtitle"/></h3>
							</div>
						</li>
					</s:iterator>
				</ul>

				<div id="shadow" class="shadow"></div>

				<div id="nav-arrows" class="nav-arrows">
					<a href="#">Next</a>
					<a href="#">Previous</a>
				</div>
			</div>
			

			<!-- /wrapper -->
			<p class="info"><strong>鄂ICP备12064241号</strong> Copyright © 2015 buzhifeng co.Ltd. All rights reserved.<br />Power by Hulk</p>
		</div>
		
		
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.slicebox.js"></script>
		<script type="text/javascript">
			$(function() {
				
				var Page = (function() {

					var $navArrows = $( '#nav-arrows' ).hide(),
						$shadow = $( '#shadow' ).hide(),
						slicebox = $( '#sb-slider' ).slicebox( {
							onReady : function() {

								$navArrows.show();
								$shadow.show();

							},
							orientation : 'r',
							cuboidsRandom : true,
							disperseFactor : 30
						} ),
						
						init = function() {

							initEvents();
							
						},
						initEvents = function() {

							// add navigation events
							$navArrows.children( ':first' ).on( 'click', function() {

								slicebox.next();
								return false;

							} );

							$navArrows.children( ':last' ).on( 'click', function() {
								
								slicebox.previous();
								return false;

							} );

						};

						return { init : init };

				})();

				Page.init();

			});
		</script>
	</body>
</html>	