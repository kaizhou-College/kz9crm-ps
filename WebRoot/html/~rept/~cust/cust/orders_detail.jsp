<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/comm/comm.jsp" %>


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

<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 历史订单 &gt; 订单明细 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table" height="59">
	<tr>
		<th>订单编号</th>
		<td>${order.odrId}</td>
		<th>日期</th>
		<td>${order.odrDate}</td>
	</tr>
	<tr>
		<th height="28">送货地址</th>
		<td>${order.odrAddr}</td>
		<th height="28">总金额（元）</th>
		<td>55200</td>
	</tr>
	<tr>
		<th height="28">状态</th>
		<td>
					<s:if test="order.odrStatus==5">
						已发货
					</s:if>
					<s:elseif test="order.odrStatus==6">
						已回款
					</s:elseif>
		</td>
		<th height="28">&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>商品</th>
		<th>数量</th>
		<th>单位</th>
		<th>单价（元）</th>
		<th>金额（元）</th>
	</tr>
	<tr>
		<td class="list_data_text">海龙笔记本电脑-i60-2688 9966</td>
		<td class="list_data_ltext">2</td>
		<td class="list_data_text">台</td>
		<td class="list_data_text">10800</td>
		<td class="list_data_text">21600</td>
	</tr>
	<s:iterator value="orderLineLit" var="list">
		<tr>
		<td class="list_data_text"><s:property value="#list.oddProdId"/> </td>
		<td class="list_data_ltext"><s:property value="#list.oddUnit"/> </td>
		<td class="list_data_text"><s:property value="#list.oddProdId"/> </td>
		<td class="list_data_text"><s:property value="#list.oddProdId"/> </td>
		<td class="list_data_text"><s:property value="#list.oddProdId"/> </td>
	</tr>
	</s:iterator>
	</table>
	<s:debug></s:debug>
</body>
</html>