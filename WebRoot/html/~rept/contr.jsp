<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/html/comm/comm.jsp"%>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${basePath}html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}html/script/common.js"></script>
</head>
<body>

<div class="page_title">客户贡献分析</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button> 
	</div>
<table class="query_form_table">
	<tr>
		<th>客户名称</th>
		<td><input name="contributionName"/></td>
		<th>年份</th>
		<td>
			<select >
				<option>全部</option>
				<option>2005</option>
				<option>2006</option>
				<option>2007</option>
				<option>2008</option>
				<option>2009</option>
				<option>2010</option>
			</select>
		</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>订单金额（元）</th>
	</tr>
	<s:iterator value="list" var="line">
	<tr>
		<td class="list_data_number"><s:property value="#line.oddId"/> </td>
		<td class="list_data_ltext"><s:property value="#line.contributionName"/></td>
		<td class="list_data_number"><s:property value="#line.oddPrice"/></td>
	</tr>
	</s:iterator>
</table>
</body>
</html>