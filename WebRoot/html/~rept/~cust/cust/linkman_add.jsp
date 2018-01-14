<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/comm/comm.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/js/js.js"></script>
<script type="text/javascript" src="${basePath}/html/jquery/jquery-1.4.2.min.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>
<form action="linkman_linkmanAdd" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input type="submit"  class="common_button" value="保存"> 
</div>
<input name="cus.custNo" type="hidden"  value="${cus.custNo}" > 
<table class="query_form_table">
	<tr>
		<th>姓名</th>
		<td><input name="linkman.lkmName" /><span class="red_star">*</span></td>
		<th>性别</th>
		<td>
			<input type="radio" name="linkman.lkmSex" checked value="男" />男
			<input type="radio" name="linkman.lkmSex"  value="女"/>女
		</td>
	</tr>
	<tr>
		<th>职位</th>
		<td><input name="linkman.lkmPostion" /><span class="red_star">*</span></td>
		<th>办公电话</th>
		<td><input name="linkman.lkmTel" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>手机</th>
		<td><input name="linkman.lkmMobile" size="20" /></td>
		<th>备注</th>
		<td><input name="linkman.lkmMemo" size="20" /></td>
	</tr>
</table>
</form>
</body>
</html>