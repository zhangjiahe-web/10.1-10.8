<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/7/27
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/index" method="post" style="text-align: center">
   请选择区域: <select name="goodsdistrict">
        <option value="1">朝阳区订单</option>
        <option value="2">海淀区订单</option>
        <option value="3">丰台区订单</option>
        <option value="4">西城区订单</option>
        <option value="5">昌平区订单</option>
    </select>
    <input type="submit" value="查询">
</form>
</body>
</html>
