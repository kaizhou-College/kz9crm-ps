<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/com/com.jsp" %>
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

<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录 &gt; 编辑交往记录</div>
<form action="activity_activityUpdate?cus.custNo=${cus.custNo}" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input type="submit"  class="common_button"  value="保存" > 
</div>
<table class="query_form_table" id="table1">
	<tr>
		<th>时间</th>
		<td>
		<input type="hidden" name="activity.atvId" value="${activity.atvId}"  >
		<input name="activity.atvDate" value="${activity.atvDate}" size="20" /><span class="red_star">*</span></td>
		<th>地点</th>
		<td>
			<input name="activity.atvPlace" value="${activity.atvPlace}" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>概要</th>
		<td><input name="activity.atvTitle" value="${activity.atvTitle}" size="20" /><span class="red_star">*</span></td>
		<th>备注</th>
		<td><input name="activity.atvDesc" value="${activity.atvDesc}" size="20" /></td>
	</tr>	
	<tr>
		<th>详细信息</th>
		<td colspan="3">
			<textarea cols="50" rows="6" name="activity.atvDesc">${activity.atvDesc}</textarea>
		</td>
	</tr>
</table>
</form>
</body>
</html>