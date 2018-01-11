<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/js/js.js"></script>
<script type="text/javascript" src="${basePath}/html/jquery/jquery-1.4.2.min.js"></script>
</head>
<body>
<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onmousedown="acivityAddTo('${cus.custNo}');" >新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
	<script type="text/javascript">
	function acivityAddTo(id){
		location.href="activity_activityAddTo?cus.custNo="+id;		
	}
</script>
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>${cus.custNo}</td>
		<th>客户名称</th>
		<td>${cus.custName}</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th width="232">时间</th>
		<th>地点</th>
		<th>概要</th>
		<th>详细信息</th>
		<th>备注</th>
		<th>操作</th>
	</tr>

	<s:iterator value="activityList" var="list">
		<tr>
		<td class="list_data_text" width="230"> <s:property value='#list.atvDate'/> </td>
		<td class="list_data_text"><s:property value='#list.atvPlace'/></td>
		<td class="list_data_ltext"><s:property value='#list.atvTitle'/></td>
		<td class="list_data_ltext"><s:property value='#list.atvDesc'/></td>
		<td class="list_data_op">
			　</td>
		<td class="list_data_op">
			<img onmousedown="activityUpdateList('${list.atvId}');" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onmousedown="activityDelete('${list.atvId}')" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
		</td>
	</tr>
	</s:iterator>
	</table>
	<script type="text/javascript">
		function activityUpdateList(id){
			location.href="activity_activityUpdateList?activity.atvId="+id+"&&cus.custNo=${cus.custNo}";		
		}
		function activityDelete(id){
			location.href="activity_activityDelete?activity.atvId="+id+"&&cus.custNo=${cus.custNo}";	
		}
	</script>
</body>
</html>