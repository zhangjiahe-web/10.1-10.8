<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/2
  Time: 10:01
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
    <h2>记账管理</h2>
    <form action="/toselect" method="post">
        <p>资产编号：<input name="assetname"></p>
        <p>资产类型:<select name="assettype">
            <option value="">请选择</option>
            <option value="电子设备">电子设备</option>
            <option value="运输设备">运输设备</option>
        </select></p>
        <input type="submit" value="查询">
    </form>
    <table border="1px">
        <tr style="background-color: #AED8E6">
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库日期</td>

        </tr>
        <c:forEach items="${assets}" var="list">
            <tr >
                <td>${list.assetid}</td>
                <td>${list.assetname}</td>
                <td>${list.assettype}</td>
                <td><fmt:formatDate value="${list.intodate}" pattern="yyyy-MM-dd"/></td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
