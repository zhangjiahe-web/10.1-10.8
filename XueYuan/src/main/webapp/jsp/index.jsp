<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.td{

text-align:center;

}
</style>
</head>
<body>
<center>
<table border="1px" width="500px" height="300px">
<tr>
<td colspan="6" class='td'>学员信息列表</td>
</tr>
<tr>
<td>学员编号</td>
<td>学员姓名</td>
<td>学员性别</td>
<td>学员年龄</td>
<td>家庭住址</td>
<td>Email</td>
</tr>
	<c:forEach items="${students}" var="list">
	<tr>
		<td><a href="/updatecha?sid=${list.sid}">${list.sid}</a></td>
		<td>${list.sname}</td>
		<td>${list.sgender}</td>
		<td>${list.sage}</td>
		<td>${list.saddress}</td>
		<td>${list.semail}</td>
</tr>
	</c:forEach>
</table>
</center>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$("tr:odd").css("background-color","#5EF4C3");
	})
	</script>
</body>
</html>