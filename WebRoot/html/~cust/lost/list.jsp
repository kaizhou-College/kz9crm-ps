<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../../comm/comm.jsp"%>
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${basePath}html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}html/script/common.js"></script>
</head>
<body>

<div class="page_title">客户流失管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户</th>
		<td><input /></td>
		<th>客户经理</th>
		<td><input /></td>
		<th>状态</th>
		<td>
			<select>
				<option>全部</option>
				<option>预警</option>
				<option>暂缓流失</option>
				<option>确认流失</option>
			</select>
		</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>客户经理</th>
		<th>上次下单时间</th>
		<th>确认流失时间</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<s:iterator value="list" var="lost">
	<tr>
		<td class="list_data_number"><s:property value="#lost.lstId"/></td>
		<td class="list_data_text"><s:property value="#lost.lstCustName"/></td>
		<td class="list_data_ltext"><s:property value="#lost.lstCustManagerName"/></td>
		<td class="list_data_text"><s:property value="#lost.lstLastOrderDate"/></td>
		<td class="list_data_text"><s:property value="#lost.lstLostDate"/></td>
		<td class="list_data_text"><s:property value="#lost.lstStatus"/></td>
		<td class="list_data_op">
			<img onclick="to('cstlost_updateid?lstId='+<s:property value='#lost.lstId'/>);" title="确认流失" src="${basePath}html/images/bt_confirm.gif" class="op_button" />
			<img onclick="to('relay.html');" title="暂缓流失" src="${basePath}html/images/bt_relay.gif" class="op_button" />
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
	<fy:fy countPlan="${countAll}" pageIndex="${page}" pageSize="${pageSize}" pageMax="${max}" pageUrl="${url}"></fy:fy>
</div>
		</th>
	</tr>
</table>
</body>
<script type="text/javascript">
		function formSkip(){
			var page=document.getElementById("pageIndex").value;
			location.href="'+${pageUrl}+'?byPage.pageIndex="+page;
		}
		
	</script>
</html>