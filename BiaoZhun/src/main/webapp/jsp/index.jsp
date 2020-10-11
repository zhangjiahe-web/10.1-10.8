<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/11
  Time: 10:04
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
    <h1 align="center">标注信息列表</h1>
    <form method="post" action="/index">
    <table border="1px" align="center">
        <tr>

            <td align="right" colspan="7"><input type="text" name="name"><input type="submit"  value="提交检索"><input type="button" id="add" value="新增检索"><input type="button" value="删除检索" onclick="AllDel()"></td>
        </tr>
        <tr align="center">
            <td><input type="checkbox"></td>
            <td>标准号</td>
            <td>中文名称</td>
            <td>版本</td>
            <td>发布日期</td>
            <td>实施日期</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${pageInfo.list}" var="list">
            <tr align="center">
                <td><input type="checkbox" name="selected item" value="${list.id}" ></td>
                <td>${list.stdNum}</td>
                <td>${list.zhname}</td>
                <td>${list.verSion}</td>
                <td><fmt:formatDate value="${list.releaseDate}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${list.implDate}" pattern="yyyy-MM-dd"/></td>
                <td><a href="/download?fileName=${list.packagePath}">下载</a>|<a href="/updatecha?id=${list.id}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <a href="/index?name=${name}&pageNumStr=${pageInfo.firstPage}">首页</a>
        <c:if test="${pageInfo.hasPreviousPage}">
            <a href="/index?name=${name}&pageNumStr=${pageInfo.prePage}">上一页</a>
        </c:if>
        <c:forEach items="${pageInfo.navigatepageNums}" var="i">
            <a href="/index?name=${name}&pageNumStr=${i}">${i}</a>
        </c:forEach>
        <c:if test="${pageInfo.hasNextPage}">
            <a href="/index?name=${name}&pageNumStr=${pageInfo.nextPage}">下一页</a>
        </c:if>
        <a href="/index?name=${name}&pageNumStr=${pageInfo.lastPage}">尾页</a>
    </div>
    </form>
</center>
</body>
</html>
<script type="text/javascript">
    function AllDel(){
        var checks=$("[name='selected item']:checked");
        if(checks.length==0){
            alert("至少选择一个用户");
            return false;
        }
        if(confirm('确定要删除所选用户吗?')){
            var str="";
            checks.each(function(){
                str+=$(this).val()+",";
            })
            location.href="/delete?str="+str;
        }
    }
    $(document).ready(function(){
        $("tr:odd").css("background-color","#666666");
    })
$("#add").click(function () {
    window.location="/jsp/add.jsp"
})

</script>

