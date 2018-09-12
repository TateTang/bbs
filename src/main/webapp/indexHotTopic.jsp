<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<style type="text/css">
table td {
	height: 30px;
	font-size: 16px;
}

a:link,a:visited {
	color: #525252;
	text-decoration: none;
} /* 未被访问的链接 */ /*已被访问的链接 */
a:hover {
	color: #525252;
	text-decoration: underline;
} /* 鼠标指针移动到链接上 */
.topicTitle:link,.topicTitle:visited {
	color: #525252;
	text-decoration: none;
}

.topicTitle:hover {
	color: #2C86E5;
	text-decoration: underline;
}
</style>

<div style="font-family: 微软雅黑;">
	<table>
		<%
			int i = 1;
		%>

		<c:forEach items="${indexHotTopic }" var="hotTopic">
			<tr>
				<td style="width: 35px;font-style: italic;" align="center"><%=i%></td>
				<td><div style="width:600px;">
						<div
							style="white-space:nowrap;overflow:hidden;text-overflow:ellipsis;max-width: 400px;float: left;">
							<a
								href="cate_goCate.action?category.id=${ hotTopic.topicType.typeCategory.name}"
								target="_top" style="font-size: 14px;">${ hotTopic.topicType.typeCategory.name} </a>-<a
								href="type_goType.action?type.id=${hotTopic.topics_type_id}"
								target="_top" style="font-size: 14px;">${hotTopic.topicType.name } </a>||&nbsp;<a
								href="topic_goTopic.do?id=${hotTopic.id}"
								target="_top" class="topicTitle">${hotTopic.title } </a>
						</div>
						<div style="float: left;font-size: 12px;color: #4C9ED9">
							&nbsp;&nbsp;[
							${hotTopic.integral }分
							]&nbsp;[回复:
							${hotTopic.comment_count }
							]&nbsp;[
							<c:if test="${hotTopic.status ==0}">未结帖</c:if>
							<c:if test="${hotTopic.status ==1}">已结帖</c:if>
							]<c:if test="${hotTopic.nice_topic ==1}">[<font color="red">精品</font>]</c:if>
						</div>
					</div></td>
				<td align="right" width="80px;"><div
						style="white-space:nowrap;overflow:hidden;text-overflow:ellipsis;max-width: 80px;">
						<a class="topicTitle" href="user_GoUser.action?user.id=${hotTopic.topics_user_id }" target="_top"
							style="font-size: 14px;">${hotTopic.topicUser.nickname } 
						</a>&nbsp;&nbsp;
					</div></td>
			</tr>
			<%
				i++;
			%>
		</c:forEach>
	</table>
</div>
