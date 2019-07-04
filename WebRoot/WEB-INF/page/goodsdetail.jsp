<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<title>产品介绍</title>
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
					<h1>产品系列</h1>
					<div class="tabslide">
						<c:forEach items="${requestScope.catFirList}" var="m1">
							<h3><a href="/goods_loadGoods?catcode=${m1.catcode}">${m1.catname}</a></h3>
								<div class="subdiv">
									<c:forEach items="${requestScope.catSecList}" var="m2">
										<c:if  test= "${m2.catfathercode == m1.catcode}">
											<a href="/goods_loadGoods?catcode=${m2.catcode}" >${m2.catname}</a>
										</c:if>
									</c:forEach>
								</div>	
						</c:forEach>
					</div>
				</div>
   				<div id="right">
      				<div class="title">
         				<h3><i>${goodsBean.goodsfathercatname}&gt;${goodsBean.goodscatname}</i></h3>
         				<div class="guide">
            				<img src="images/hic.gif" /> 您当前的位置：产品系列 &gt;${goodsBean.goodsfathercatname} &gt;${goodsBean.goodscatname} &gt; <span>${goodsBean.goodsname}</span>
         				</div>
					</div>
      				<div class="eidtbox product">
           			<div class="products_tittop">
						<p>首家集研发、设计、生产、销售为一体的布艺窗帘企业!</p>
           			</div>
                     <div class="totit">
             			<h2>${goodsBean.goodsname}</h2><a href="/goods_loadGoods" class="backto">返回列表</a>
           			 </div>
           			<div class="preview">
        				<div class="smallImg">
							<div id="imageMenu">
								<ul>
									<li><img src="${goodsBean.goodspic}" alt=" " /></li>
								</ul>
							</div>
						</div>
	        			<div id="vertical" class="bigImg">
								<img src="${goodsBean.goodspic}" id="midimg" height="478" width="638"/>
						</div>
					</div>
        			<ul class="nettab clearfix">
			           <li class="on"><a href="javascript:;">产品参数</a></li>
			           <li><a href="javascript:;">产品意念</a></li>
        			</ul>
        			<div class="prode">
            			<div class="tabcon tabbox">
            				${goodsBean.goodsparam}
				 		</div>
				 		
            			<div class="tabcon tabbox">
                			${goodsBean.goodsyinian}
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
