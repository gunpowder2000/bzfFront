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
		<title>产品系列</title>
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
         			<h3><i>${bigCatName}</i></h3>
			        <div class="guide">
			           <img src="images/hic.gif" /> 您当前的位置：产品系列 ${bigCatName}  <span>${MidCatName}</span>
			        </div>
				</div>
				<div class="eidtbox product">
					<div class="products_tittop">
	              		<p>首家集研发、设计、生产、销售为一体的布艺窗帘企业!</p>
           			</div>
                    <div class="eidtbox2">
							<div class="case">
								<ul>
									<s:iterator value="goodsList">
										<li>
										   <div class="pic"><a href="/goods_loadGoodsDetail?goodsid=<s:property value="goodsid"/>" target="_blank"><img src="<s:property value="goodspic"/>" /></a></div> 
										   <p><a href="/goods_loadGoodsDetail?goodsid=<s:property value="goodsid"/>" target="_blank"><s:property value="goodsname"/></a></p>
										   <p><s:property value="goodsdigest"/></p>
										</li>
									</s:iterator>
								</ul>
							</div>
							<div class="page">
								<script>
									var pg = new showPages('pg');						
									pg.pageCount =${goodstotal};
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
