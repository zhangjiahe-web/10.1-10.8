<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/1
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.8.3.min.js"></script>
<body>
<center>
    <table border="1px">
        <tr style="background-color: #9A9A9A">
            <td>预定编号</td>
            <td>会议室</td>
            <td>预定人</td>
            <td>日期</td>
        </tr>
        <c:forEach items="${meetinfgrooms}" var="list">
            <tr >
                <td>${list.id}</td>
                <td>${list.meetingName}</td>
                <td>${list.advanceName}</td>
                <td><fmt:formatDate value="${list.meetingOrder}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/jsp/add.jsp">预定会议室</a>
</center>
</body>
</html>
<script type="text/javascript">
    $(document).ready(function(){
        $("tr:odd").css("background-color","#C79A07");
    })

</script>
