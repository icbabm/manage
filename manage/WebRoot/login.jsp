<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>综合管理系统登录</title>
<meta charset="UTF-8" />
<link rel="shortcut icon" type="image/x-icon" href="<%=basePath%>image/favicon.ico" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/icon.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css" />
</head>
<body>
<div id="login">
	<p>帐号：<input type="text" id="manager" value="admin" class="textbox"></p>
	<p>密码：<input type="password" id="password" value="123456" class="textbox"></p>
</div>
<div id="btn">
	<a href="#" class="easyui-linkbutton">登录</a>
</div>
</body>
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui-lang-zh_CN.js" ></script>
<script type="text/javascript" src="<%=basePath%>js/rootpath.js" ></script>
<script type="text/javascript" src="<%=basePath%>js/login.js" ></script> 
</html>