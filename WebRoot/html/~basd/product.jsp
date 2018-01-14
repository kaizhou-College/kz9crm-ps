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

<div class="page_title">产品查询</div>
<form action="product_productDimList" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input value="保存" type="submit" class="common_button"  >
</div>
<table class="query_form_table">
	<tr>
		<th>名称</th>
		<td><input name="pdp.name" value="${pdp.name}" /></td>
		<th>型号</th>
		<td><input name="pdp.type"  value="${pdp.type}"/></td>
		<th>批次</th>
		<td><input  name="pdp.batch" value="${pdp.batch}"/></td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>名称</th>
		<th>型号</th>
		<th>等级/批次</th>
		<th>单位</th>
		<th>单价（元）</th>
		<th>备注</th>
	</tr>
	<s:iterator value="productByPage" var="list">
	<tr>
		<td class="list_data_number"><s:property value="#list.prodId"/> </td>
		<td class="list_data_ltext"><s:property value="#list.prodName"/></td>
		<td class="list_data_text"><s:property value="#list.prodType"/></td>
		<td class="list_data_text"><s:property value="#list.prodBatch"/></td>
		<td class="list_data_text"><s:property value="#list.prodUnit"/></td>
		<td class="list_data_number"><s:property value="#list.prodPrice"/></td>
		<td class="list_data_ltext"><s:property value="#list.prodMemo"/>&nbsp;</td>		
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
<s:debug></s:debug>
</body>
</html>