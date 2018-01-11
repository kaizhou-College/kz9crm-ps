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
<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>  
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
		<td colspan="3">${service.svrDeal}<span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td>${service.svrDealBy}<span class="red_star">*</span></td>
		<th>处理时间</th>
		<td>${service.svrDealDate}<span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td>${service.svrResult}<span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
		<s:if test="service.svrSatisfy==1">☆</s:if>
		<s:elseif test="service.svrSatisfy==2">☆☆</s:elseif>
		<s:elseif test="service.svrSatisfy==3">☆☆☆</s:elseif>
		<s:elseif test="service.svrSatisfy==4">☆☆☆☆</s:elseif>
		<s:elseif test="service.svrSatisfy==5">☆☆☆☆</s:elseif>
		<s:else></s:else>
		<span class="red_star">*</span></td>
	</tr>
</table>
</body>
</html>