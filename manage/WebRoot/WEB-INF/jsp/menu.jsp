<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>综合管理系统</title>
<meta charset="UTF-8" />
<link rel="shortcut icon" type="image/x-icon" href="<%=basePath%>image/manage.png" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/icon.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css" />
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'header',split:true,noheader:true" style="height:63px;background:#E6F0FF;">
	<div class="logo"><img alt="" src="<%=basePath%>image/logo.png" style="height:50px"></div>
	<div class="logout">您好，${user.uName } | <a href="${pageContext.request.contextPath }/signout">退出</a></div>
</div>   
<div data-options="region:'south',title:'footer',split:true,noheader:true" style="height:38px;line-height:30px;text-align:center;">
	版权 © www.ncomer.com
</div>    
<div data-options="region:'west',title:'导航菜单',split:true,iconCls:'icon-menu'" style="width:180px;padding:10px;">
	<ul id="nav"></ul>
</div>   
<div data-options="region:'center'" style="overflow:hidden;">
	<div id="tabs">
	</div>
</div> 
</body>
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easyui.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui-lang-zh_CN.js" ></script>
<script type="text/javascript" src="<%=basePath%>js/rootpath.js" ></script>
<script type="text/javascript" src="<%=basePath%>js/main.js" ></script>
</html>