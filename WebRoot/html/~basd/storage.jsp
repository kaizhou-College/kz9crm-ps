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

<div class="page_title">产品查询</div>
<form action="storage_storageDim" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input type="submit" value="保存"  class="common_button">
</div>
<table class="query_form_table">
	<tr>
		<th>产品</th>
		<td><input  value="${sdp.prodName}" name="sdp.prodName"/></td>
		<th>仓库</th>
		<td><input  value="${sdp.stkWarehouse}" name="sdp.stkWarehouse"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>产品</th>
		<th>仓库</th>
		<th>货位</th>
		<th>件数</th>
		<th>备注</th>
	</tr>
	<s:iterator value="byPageStorage" var="list">
		<tr>
			<td class="list_data_number"><s:property value="#list[0]"/> </td>
			<td class="list_data_ltext"><s:property value="#list[1]"/></td>
			<td class="list_data_ltext"><s:property value="#list[2]"/></td>
			<td class="list_data_text"><s:property value="#list[3]"/></td>
			<td class="list_data_number"><s:property value="#list[4]"/></td>
			<td class="list_data_ltext">&nbsp;</td>		
		</tr>
	</s:iterator>
	<tr>
		<th colspan="100" class="pager">
<div class="pager">
	<pxfy:fy countPlan="${byPage.countPlan}" pageIndex="${byPage.pageIndex}" pageSize="${byPage.pageSize}" pageMax="${byPage.pageMax}" pageUrl="${byPage.pageUrl}"></pxfy:fy>
</div>
		</th>
	</tr>
</table>
<script type="text/javascript">
	function formSkip(){
		var pageIndex=document.getElementById("pageIndex").value;
		location.href="${byPage.pageUrl}?byPage.pageIndex="+pageIndex;
	}
</script>
</body>
</html>