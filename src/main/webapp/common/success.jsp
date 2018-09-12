<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path =request.getAttribute("path").toString();
	String msg = request.getAttribute("msg").toString();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<script language="javascript">
    <% if(null!=msg) { %>
		alert("<%=msg%>");
	<% } %>
	<% if(null!=path&&!"".equals(path)) { %>
		document.location.href ="<%=path%>";
	<% } else {%>
		window.history.back();
	<% } %>
</script>
<body> 
</body> 
</html>
