<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/3
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
    <table border="1px">
        <tr>
            <td colspan="7">人员列表</td>
        </tr>
        <tr style="background-color: #AED8E6">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>等级</td>
            <td>部门</td>
            <td>操作</td>

        </tr>
        <c:forEach items="${people}" var="list">
            <tr >
                <td>${list.id}</td>
                <td>${list.name}</td>
                <td>${list.sex}</td>
                <td>${list.age}</td>
                <td>${list.rank}级</td>
                <td>${list.departmevt}</td>
                <td><a href="/delete?id=${list.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" value="添加人员" id="addji">
    <h2>${msg}</h2>
</center>
</body>
</html>
<script type="text/javascript">
    $(document).ready(function(){
        $("tr:even").css("background-color","#66FEFF");
        $("tr:odd").css("background-color","#01CC01");
    })

    $("#addji").click(function () {
        window.location="/jsp/add.jsp"
    })

       /* $("form").submit(function(){
            var reg=/^\d{4}-\d{2}-\d{2}$/;
            if(reg.test($("[name='stratbillTime']").val())==false){
                alert("日期格式不正确");
                return false;
            }
            if(reg.test($("[name='endbillTime']").val())==false){
                alert("日期格式不正确");
                return false;
            }
            return true;
        })*/



</script>
