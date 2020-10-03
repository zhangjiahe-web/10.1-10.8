<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/3
  Time: 16:24
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
    <table border="1px">

        <tr>
            <td style="color: red">添加人员</td>
        </tr>
        <tr>
            <td>姓名:<input name="name"></td>
        </tr>
        <tr>
            <td>性别:<select name="sex">
                <option value="">请选择</option>
                <option value="女">女</option>
                <option value="男">男</option>
            </select></td>
        </tr>
        <tr>
            <td>年龄:<input name="age"></td>
        </tr>
        <tr>
            <td>等级:<select name="rank">
                <option value="">请选择</option>
                <option value="1">一级</option>
                <option value="2">二级</option>
                <option value="3">三级</option>
                <option value="4">四级</option>
                <option value="5">五级</option>
            </select></td>
        </tr>
        <tr>
            <td>部门:<select name="departmevt">
                <option value="">请选择</option>
                <option value="开发部">开发部</option>
                <option value="工程质量部">工程质量部</option>
                <option value="支持部">支持部</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    $(document).ready(function(){
        $("tr:even").css("background-color","#66FEFF");
        $("tr:odd").css("background-color","#01CC01");
    })

    if(${suc!=null}){
        alert("信息添加成功!")
        window.location="/index"

    }


</script>
</center>
</body>
</html>
