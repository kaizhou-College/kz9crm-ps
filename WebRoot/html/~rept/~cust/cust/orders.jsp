<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/com/com.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/js/js.js"></script>
<script type="text/javascript" src="${basePath}/html/jquery/jquery-1.4.2.min.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 历史订单 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>KH071202001</td>
		<th>客户名称</th>
		<td>聪海信息科技有限公司</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>订单编号</th>
		<th>日期</th>
		<th>送货地址</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<s:iterator value="orderList" var="list">
			<tr>
				<td class="list_data_text"><s:property value="#list.odrId"/> </td>
				<td class="list_data_text"><s:property value="#list.odrDate"/> </td>
				<td class="list_data_text"><s:property value="#list.odrAddr"/> </td>
				<td class="list_data_text">
					<s:if test="#list.odrStatus==5">
						已发货
					</s:if>
					<s:elseif test="#list.odrStatus==6">
						已回款
					</s:elseif>
				</td>
				<td class="list_data_op">
			<img onmousedown="orderLineList('${list.odrId}')" title="查看明细" src="${basePath}/html/images/bt_detail.gif" class="op_button" /></td>
	</tr>
	</s:iterator>
	</table>
	<script type="text/javascript">
		function orderLineList(id){
			location.href="order_OrderLineList?order.odrId="+id;
		}
	</script>
	
</body>
</html>