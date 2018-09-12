<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<base href="<%=basePath%>">
<style>
.copyRight {
	margin-top: 30px;
	width: 1004px;
	height: 100px;
	float: left;
	border-top: 1px dashed silver;
	/* 	background-color: yellow; */
}
</style>

<div style="text-align: center; margin-top: 20px;" align="center">
	<font face="微软雅黑" size="2px" style="line-height: 30px;"><a
		href="./aboutUs.jsp">关于论坛</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a
		href="./technology.jsp">技术支持</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
		href="./secret.jsp">隐私政策</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a
		href="./connect.jsp">联系我们</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		 <c:if
			test="#session.tu.roleId==6||#session.tu.roleId==16">
			<a href="a/manage.jsp">后台管理</a>
		</c:if>
		<c:if test="#session.tu.roleId!=6||#session.tu.roleId!=16">
			<a onclick="alert('您没有权限！')">后台管理</a>
		</c:if> </font><br /> <font face="微软雅黑" size="2px">Copyright@2017 | 广东省深圳市<br />
		电话：0755-XXXXXXX 邮箱：XXX@XX.com
	</font>
</div>
