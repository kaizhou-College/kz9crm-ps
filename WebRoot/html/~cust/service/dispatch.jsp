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

<div class="page_title">客户服务管理 > 服务分配</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>


<table class="query_form_table" height="53">
	<tr>
		<th height="28">客户</th>
		<td><input /></td>
		<th height="28">概要</th>
		<td><input /></td>
		<th height="28">服务类型</th>
		<td>
			<select name="D1">
				<option>全部</option>
				<option>咨询</option>
				<option>建议</option>
				<option>投诉</option>
			</select>
		</td>
	</tr>
	<tr>
		<th height="22">创建日期</th>
		<td colspan="3">
			<input name="T2" size="10" /> - <input name="T1" size="10" /></td>
		<th height="22">状态</th>
		<td>
			<select name="D1">
				<option selected>新创建</option>
			</select>
		</td>
	</tr>
</table>
<br />

<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>概要</th>
		<th>服务类型</th>
		<th>创建人</th>
		<th>创建日期</th>
		<th>分配给</th>
		<th>操作</th>
	</tr>

	<s:iterator value="serviceByPage" var="list">
	<form action="service_serviceDueTo" method="post">
			<tr>
		<td class="list_data_number"><s:property value="#list.svrId" /> </td>
		<td class="list_data_text"><s:property value="#list.svrCustName" /></td>
		<td class="list_data_ltext"><s:property value="#list.svrTitle" /></td>
		<td class="list_data_text"><s:property value="#list.svrType" /></td>
		<td class="list_data_text"><s:property value="#list.svrCreateBy" /></td>
		<td class="list_data_text"><s:property value="#list.svrCreateDate" /></td>
		<td class="list_data_text">
			<input type="hidden" name="service.svrId" value="<s:property value='#list.svrId' />">
			<s:select list="{'请选择...','小明','旺财','球球','孙小美','周洁轮'}" name="service.svrDueTo" value="%{#list.svrDueTo}"  ></s:select>
			<input type="submit" class="common_button" value="分配" >
		</td>
		<td class="list_data_op">
			<img onmousedown="serviceDispatchDelete('${list.svrId}')" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />  
		</td>
	</tr>
	</form>
	</s:iterator>
	
	
	<tr>
		<th colspan="8" class="pager">
<div class="pager">
	<pxfy:fy countPlan="${byPage.count}" pageIndex="${byPage.pageIndex}" pageSize="${byPage.pageSize}" pageMax="${byPage.pageMax}" pageUrl="${byPage.pageUrl}"></pxfy:fy>
</div>
		</th>
	</tr>
</table>

<script type="text/javascript">

	function serviceDispatchDelete(id){
		location.href="service_serviceDispatchDelete?service.svrId="+id;
	}
	
	function formSkip(){
		var pageIndex=document.getElementById("pageIndex").value;
		location.href="${byPage.pageUrl}?byPage.pageIndex="+pageIndex;
	}
	
	
	
</script>
</body>
</html>