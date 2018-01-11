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

<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 编辑联系人</div>
<form action="linkman_linkmanUpdate" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input class="common_button" type="submit" value="保存" >
</div>
<table class="query_form_table" id="table1">
	<tr>
		<th>姓名</th>
		<td>
			<input type="hidden" name="cus.custNo" value="${cus.custNo}" > 
			<input type="hidden" name="linkman.lkmId" value="${linkman.lkmId}" > 
			<input  name="linkman.lkmName" value="${linkman.lkmName}" size="20" /><span class="red_star">*</span>
		</td>
		<th>性别</th>
		<td>
		<s:radio list="{'男','女'}"  name="linkman.lkmSex"  value="linkman.lkmSex"  />
		</td>
	</tr>
	<tr>
		<th>职位</th>
		<td><input  name="linkman.lkmPostion"  value="${linkman.lkmPostion}" size="20" /><span class="red_star">*</span></td>
		<th>办公电话</th>
		<td><input  name="linkman.lkmTel"  value="${linkman.lkmTel}" size="20" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>手机</th>
		<td><input  name="linkman.lkmMobile"  value="${linkman.lkmMobile}" size="20" /></td>
		<th>备注</th>
		<td><input  name="linkman.lkmMemo"  value="${linkman.lkmMemo}" size="20" /></td>
	</tr>
</table>
</form>
</body>
</html>