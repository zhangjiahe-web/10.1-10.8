<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/7/27
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>商品编号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>库存数量</td>
        <td>订单状态</td>
        <td>操作</td>
    </tr>

        <c:forEach items="${list}" var="list">
    <tr>
        <td>${list.id}</td>
        <td>${list.goodsname}</td>
        <td>${list.goodsprice}</td>
        <td>${list.goodscount}</td>
        <td><c:if test="${list.billstatus==0}">
            待处理
        </c:if>
            <c:if test="${list.billstatus==1}">
             处理中
            </c:if>
            <c:if test="${list.billstatus==2}">
                已处理
            </c:if>

        </td>
        <td><a href="/updatecha?id=${list.id}">修改</a></td>
    </tr>
        </c:forEach>
</table>
<%--<div>
    <a href="GetAll?pageNum=${pageInfo.firstPage}&goodsDistrict=${sessionScope.goodsDistrict}">首页</a>
    <c:if test="${pageInfo.hasPreviousPage}">
        <a href="GetAll?pageNum=${pageInfo.prePage}&goodsDistrict=${sessionScope.goodsDistrict}">上一页</a>
    </c:if>
    <c:forEach items="${pageInfo.navigatepageNums}" var="i">
        <a href="GetAll?pageNum=${i}&goodsDistrict=${sessionScope.goodsDistrict}">${i}</a>
    </c:forEach>
    <c:if test="${pageInfo.hasNextPage}">
        <a href="GetAll?pageNum=${pageInfo.nextPage}&goodsDistrict=${sessionScope.goodsDistrict}">下一页</a>
    </c:if>
    <a href="GetAll?pageNum=${pageInfo.lastPage}&goodsDistrict=${sessionScope.goodsDistrict}">尾页</a>
</div>--%>
</body>
</html>
