<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/5
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.8.3.min.js"></script>
<body>
<center>
    <form action="/doadd" method="post">
        <p>资产编号:<input type="text" name="assetid"></p>
        <p>资产名称:<input type="text" name="assetname"></p>
        <p>资产类型:<select name="assettype">
            <option value="电子设备">电子设备</option>
            <option value="运输设备">运输设备</option>
        </select></p>
        <p>入库日期:<input type="text" name="intodate"></p>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
<script type="text/javascript">
    if(${suc!=null}){
        alert("添加成功!")
        window.location="/jsp/index.jsp"

    }
</script>
