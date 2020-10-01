<%--
  Created by IntelliJ IDEA.
  User: 张家和
  Date: 2020/10/1
  Time: 13:59
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

        <tr style="background-color: #9A9A9A">
            <td><b>会议室预定</b></td>
        </tr>
        <tr>
            <td>会议室:<select name="meetingName">
                <option value="一号会议室">一号会议室</option>
                <option value="二号会议室">二号会议室</option>
                <option value="三号会议室">三号会议室</option>
                <option value="四号会议室">四号会议室</option>
                <option value="五号会议室">五号会议室</option>
            </select></td>
        </tr>
        <tr>
            <td>申请人:<input name="advanceName"></td>
        </tr>
        <tr>
            <td>预定日期:<input name="meetingOrder"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
    </form>
    <script type="text/javascript">
        $("form").submit(function(){


            var reg=/^\d{4}-\d{2}-\d{2}$/;
            var meetingOrder=$("[name='meetingOrder']").val();
            if(reg.test($("[name='meetingOrder']").val())==false){
                alert("日期格式不正确");
                return false;
            }

            return true;
        })
        if(${suc!=null}){
            alert("添加成功!")
            window.location="/index"

        }


    </script>
</center>

</body>
</html>
