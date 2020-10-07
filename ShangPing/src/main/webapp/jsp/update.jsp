<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/7/27
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/7/27
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <table border="1px">

            <tr>
                <td>商品编号</td>
                <td><input type="text" name="id" value="${ goods.id }"/></td>
            </tr>
            <tr>
                <td>商品名称</td>
                <td><input type="text" name="goodsname" value="${ goods.goodsname }"/></td>
            </tr>
            <tr>
                <td>商品价格</td>
                <td><input type="text" name="goodsprice" value="${ goods.goodsprice }"/></td>
            </tr>
            <tr>
                <<input type="hidden" value="${sessionScope.goodsDistrict}" name="goodsdistrict">
                <td>库存数量</td>
                <td><input type="text" name="goodscount" value="${ goods.goodscount }"/></td>
            </tr>
            <tr>
                <td>订单状态</td>
                <td align="center">
                    <select name="billstatus">
                            <option value="0">待处理</option>
                            <option value="1">处理中</option>
                            <option value="2">已处理</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交">
                    <input type="button" value="返回">
                </td>
            </tr>

    </table>
</form>

</body>
</html>
</body>
</html>
