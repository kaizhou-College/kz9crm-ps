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
<div class="page_title">客户服务管理 &gt; 服务处理</div>
<form action="service_serviceDetailUpdate" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button> 
	<input type="submit" value="保存">  
</div>

<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input type="hidden" value="${service.svrId}" name="service.svrId"> ${service.svrId}</td>
		<th>服务类型</th>
		<td>
			${service.svrType}</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3">${service.svrTitle}</td>
	</tr>	
	<tr>
		<th>客户</th>
		<td>${service.svrCustName}</td>
		<th>状态</th>
		<td>${service.svrStatus}</td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3">${service.svrRequest}<br>
　</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>${service.svrCreateBy}</td>
		<th>创建时间</th>
		<td>${service.svrCreateDate}</td>
	</tr>
	</table>
<br />
<table class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>
			${service.svrDueTo}</td>
		<th>分配时间</th>
		<td>${service.svrDueDate}</td>
	</tr>
</table>
<br />	
<table class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea rows="6" cols="50" name="service.svrDeal" >${service.svrDeal}</textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><input name="service.svrDealBy" value="${service.svrDealBy}" readonly size="20" /><span class="red_star">*</span></td>
		<th>处理时间</th>
		<td><input id="t3" name="service.svrDealDate" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input name="service.svrResult" size="20" value="${service.svrResult}"/><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
		<s:select  list="#{'0':'请选择...','1':'☆','2':'☆☆','3':'☆☆☆','4':'☆☆☆☆','5':'☆☆☆☆☆'}" name="service.svrSatisfy" value="%{service.svrSatisfy}"></s:select>
		<span class="red_star">*</span></td>
	</tr>
</table>
</form>


<script>
	setCurTime('t3');
</script>
</body>
</html>