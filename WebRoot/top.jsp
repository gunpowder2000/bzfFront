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
		

		<link rel="stylesheet" type="text/css" href="css/custom.css" />
		<link href="css/archenav.css" rel="stylesheet" />
		<script type="text/javascript" src="js/modernizr.custom.46884.js"></script>
		<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    	<script type="text/javascript" src="js/archenav.js"></script>

  </head>
  
  <body>
    <div class="header">
        <div class="topNav" id="topNav">
            <div class="topNav2">
                <div class="navBox">
                    <div class="navIndexBg">
                        <div class="navIL"></div>
                        <div class="navIL navIR"></div>
                        <div class="navIM"></div>
                    </div>
                    <div class="navMain" id="navMain">
                        <!-- 主导航放这里 -->
                        <div class="navIndex" id="navIndex">
                            <ul>
                                <li class=""><a href="/index"  class="nav4">网站首页</a></li>
                                <li class="  "><a href="/about_loadAbout?sta=GSJJ" >关于公司</a></li>
                                <li class="nav1"><a href="/goods_loadGoods" >产品系列</a></li>
                                <li class=""><a href="/join_loadJoin?sta=JMFA" >加盟方式</a></li>
                                <li class=""><a href="/work_loadWork" >人才招聘</a></li>
                                <li class=""><a href="/about_loadAbout?sta=LXWM" >联系我们</a></li>
                            </ul>
                        </div>
                        <div class="navSub" id="navSub">
                            <dl class="nav2">
                                <dt>关于公司</dt>
                                <dd><a href="/about_loadAbout?sta=GSJJ" title="">公司简介</a></dd>
                                <dd><a href="/about_loadAbout?sta=CZLC" title="">成长历程</a></dd>
                                <dd><a href="/about_loadAbout?sta=PPLN" title="">品牌理念</a></dd>
							    <dd><a href="/news_loadNews" title="">品牌新闻</a></dd>
                            </dl>
                            <dl class="nav1">
                                <dt>产品系列</dt>
                                <s:iterator value="topList">
                                	<dd><a href="/goods_loadGoods?catcode=<s:property value="topid"/>" title=""><s:property value="topname"/></a></dd>
								</s:iterator>
                            </dl>
                            <dl>
                                <dt>加盟方式</dt>
                                <dd><a href="/join_loadJoin?sta=JMFA" title="">加盟方案</a></dd>
                                <dd><a href="/join_loadJoin?sta=JMTJ" title="">加盟条件</a></dd>
								<dd><a href="/join_loadJoin?sta=JMYS" title="">加盟优势</a></dd>
								<dd><a href="/join_loadJoin?sta=JMLC" title="">加盟流程</a></dd>
                            </dl>
                        </div>
                        <!-- 二级放这里 end -->
                    </div>
                </div>
            </div>
        </div>
        <div class="logoBox">
            <h1 id="logo" class="logoPNG">网站</h1>
        </div>
    </div>
    	
  </body>
</html>
