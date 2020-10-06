<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/7/10
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<form action="/index" method="post">
    <select name="status">
        <option value="0">全部</option>
        <option value="1">已申报</option>
        <option value="2">审核中</option>
        <option value="3">已审核</option>


    </select>
    <input type="submit" value="确定">

</form>

<table border="1px">
    <tr>
        <td>项目编号</td>
        <td>项目名称</td>
        <td>申报开始日期</td>
        <td>申报结束日期</td>
        <td>申报状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ projectinfoPageInfo.list }" var="list">
        <tr>
            <td>${list.id }</td>
            <td>${list.projectname }</td>
            <td><fmt:formatDate value="${list.startdate}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${list.enddate}" pattern="yyyy-MM-dd"/></td>
            <td>
                <c:if test="${list.status==1}">
                    已申报
                </c:if>
                <c:if test="${list.status==2}">
                    审核中
                </c:if>
               <c:if test="${list.status==3}">
                    已审核
                </c:if>
            </td>
            <td><a href="/updatecha?id=${list.id}"> <c:if test="${list.status==1}">
                已申报
            </c:if>
                <c:if test="${list.status==2}">
                    审核中
                </c:if>
                <c:if test="${list.status==3}">

                </c:if></a></td>
        </tr>
    </c:forEach>
</table>
<p>${requestScope.flag}</p>
<div>
    <a href="/index?pageNumStr=${projectinfoPageInfo.firstPage}">首页</a>
    <c:if test="${projectinfoPageInfo.hasPreviousPage}">
        <a href="/index?pageNumStr=${projectinfoPageInfo.prePage}">上一页</a>
    </c:if>
    <c:forEach items="${projectinfoPageInfo.navigatepageNums}" var="i">
        <a href="/index?pageNumStr=${i}">${i}</a>
    </c:forEach>
    <c:if test="${projectinfoPageInfo.hasNextPage}">
        <a href="/index?pageNumStr=${projectinfoPageInfo.nextPage}">下一页</a>
    </c:if>
    <a href="/index?pageNumStr=${projectinfoPageInfo.lastPage}">尾页</a>
</div>
</center>
</body>
</html>
