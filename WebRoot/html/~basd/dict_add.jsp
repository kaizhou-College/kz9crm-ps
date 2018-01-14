<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/html/comm/comm.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/jquery/jquery-1.4.2.min.js"></script>
</head>
<body>
<div class="page_title">数据字典管理 > 新建数据字典条目</div>
<form action="dictAction_dictInsert" method="post" >
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input class="common_button" value="保存" type="submit" >
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input name="basDict.dictId" value="${basDict.dictId}" readonly /></td>
		<th>类别</th>
		<td><input name="basDict.dictType" /><span class="red_star">*</span><br /></td>
	</tr>
	<tr>
		<th>条目</th>
		<td><input  name="basDict.dictItem" /><span class="red_star">*</span></td>
		<th>值</th>
		<td><input  name="basDict.dictValue" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>是否可编辑</th>
		<td><input type="checkbox"  name="basDict.dictIsEditable" value="1"  checked /></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
</body>
</html>