<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<style type="text/css">
.friendLink {
	font-family: 微软雅黑;
	font-size: 13px;
	margin-left: 10px;
}

a:link {
	color: #525252;
	background-color: white;
	text-decoration: none;
} /* 未被访问的链接 */
a:visited {
	color: #525252;
	background-color: white;
} /*已被访问的链接 */
a:hover {
	color: white;
	background-color: #2C86E5;
} /* 鼠标指针移动到链接上 */
</style>

<div class="friendLink">
	<div style="height: 24px;font-size: 15px;font-weight: bolder">
		<a href="http://www.zuidaima.com" target="_blank">最代码</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</div>
	<div style="height: 24px;">
		<a href="http://www.csdn.net/" target="_blank"
			style="font-size: 15px;font-weight: bolder">CSDN</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="http://www.iteye.com/" target="_blank">ITeye</a>
	</div>
	<div style="height: 24px;">
		<a href="http://bbs.51cto.com/" target="_blank">51CTO</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="http://www.javaxxz.com/" target="_blank">Java学习者论坛</a>
	</div>
	<div style="height: 24px;">
		<a href="http://www.oschina.net/" target="_blank"
			style="font-size: 15px;font-weight: bolder">开源中国</a>&nbsp;&nbsp;<a
			href="http://www.itpub.net/forum.php" target="_blank">ITPUB</a>
	</div>
	<div style="height: 24px;">
		<a href="http://bbs.tianya.cn/" target="_blank"
			style="font-size: 15px;font-weight: bolder">天涯论坛</a>
	</div>

</div>
