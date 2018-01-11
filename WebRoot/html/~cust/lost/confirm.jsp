<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp"%>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${basePath}html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}html/script/common.js"></script>
</head>
<body>

<div class="page_title">客户流失管理 &gt; 确认流失</div>
<form action="cstlost_update?lstId=<s:property value="cstLost.lstId"/>" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="to('relay.html');">暂缓流失</button>
	<input class="common_button" type="submit" value="保存"/>
</div>
<s:debug></s:debug>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><s:property value="cstLost.lstId"/></td>
		<th>客户</th>
		<td><s:property value="cstLost.lstCustName"/></td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td>
			<s:property value="cstLost.lstCustManagerName"/></td>
		<th>上次下单时间</th>
		<td>
			<s:property value="cstLost.lstLastOrderDate"/></td>
	</tr>
	<tr>
		<th>暂缓措施</th>
		<td colspan="3">
			<s:property value="cstLost.lstDelay"/>
</td>
	</tr>	
	<tr>
		<th>流失原因</th>
		<td colspan="3">
			<textarea rows="6" cols="50" name="cstLost.lstReason"><s:property value="cstLost.lstReason"/></textarea><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<br />
</body>
</html>