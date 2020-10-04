<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.td{
background-color:#5EF4C3;
text-align:center;
}
.td1{
background-color:#5EF4C3;

}
.td2{
display:none;

}

</style>
</head>
<body>
<center>
<form action="/updateinfo" method="post">
<table border="1px" >
<tr>
<td colspan="3" class='td'>学员信息</td>
</tr>
<tr>
<td class='td2'>学员ID</td>
<td class='td2'><input type='text' name='sid' value="${list.sid}"/></td>
</tr>
<tr>
<td class='td1'>学员姓名</td>
<td><input type='text' name='sname' value="${list.sname}"/></td>
</tr>
<tr>
<td class='td1'>学员性别:</td>
<td><input type='text' name='sgender' value="${list.sgender}"/></td>
</tr>
<tr>
<td class='td1'>学员年龄:</td>
<td><input type='text' name='sage' value="${list.sage}"/></td>
</tr>
<tr>
<td class='td1'>学员住址:</td>
<td><input type='text' name='saddress' value="${list.saddress}"/></td>
</tr>
<tr>
<td class='td1'>Email:</td>
<td><input type='text' name='semail' value="${list.semail}"/></td>
</tr>
<tr>
<td  id='td'><input type='submit'  value='修改' />
<input type='reset'  value='重置'/></td>
</tr>
</table>
</form>
</center>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(function(){
	$("tr:odd").css("background-color","#5EF4C3");
	$("tr:even").css("background-color","#5EF4C3");
})
$("form").submit(function(){
	var name=$("[name='sname']").val();
	if(name==""){
		alert("请填写完整学员信息修改");
		return false;
	}
	var sex=$("[name='sgender']").val();
	if(sex==""){
		alert("请填写完整学员信息修改");
		return false;
	}
	var age=$("[name='sage']").val();
	if(age==""){
		alert("请填写完整学员信息修改");
		return false;
	}
	var address=$("[name='saddress']").val();
	if(address==""){
		alert("请填写完整学员信息修改");
		return false;
	}
	var email=$("[name='semail']").val();
	if(email==""){
		alert("请填写完整学员信息修改");
		return false;
	}
	
	
	return true;
	
})
	</script>
</body>
</html>