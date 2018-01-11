<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/com/com.jsp" %>


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

<div class="page_title">客户信息管理 > 客户信息 > 联系人 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onmousedown="linkmanAddTo('${cus.custNo}')">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><s:property value="cus.custNo" /><input type="hidden" name="cus.custNo" id="cus_ctuNo" value="${cus.custNo}"> </td>
		<th>客户名称</th>
		<td><s:property value="cus.custName"/></td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>姓名</th>
		<th>性别</th>
		<th>职位</th>
		<th>办公电话</th>
		<th>手机</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	
	<s:iterator value="linkmanList" var="list">
		<tr>
		<td class="list_data_text"><s:property value="#list.lkmName"/> </td>
		<td class="list_data_ltext"><s:property value="#list.lkmSex"/></td>
		<td class="list_data_text"><s:property value="#list.lkmPostion"/></td>
		<td class="list_data_text"><s:property value="#list.lkmTel"/></td>
		<td class="list_data_text"><s:property value="#list.lkmMobile"/></td>
		<td class="list_data_op">
			　</td>
		<td class="list_data_op">
			<img onmousedown="linkmanUpdateList('${list.lkmId}')" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onmousedown="linkmanDelete('${list.lkmId}')" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />&nbsp;
		</td>
	</tr>
	</s:iterator>
	</table>
	<script type="text/javascript">
		function linkmanUpdateList(id){
			location.href="linkman_linkmanUpdateList?linkman.lkmId="+id+"&&cus.custNo="+$("#cus_ctuNo").val();
		}
		function linkmanDelete(id){
			alert($("#cus_ctuNo").val());
			location.href="linkman_linkmandelete?cus.custNo="+$("#cus_ctuNo").val()+"&&linkman.lkmId="+id;
		}
		function linkmanAddTo(id){
			location.href="linkman_linkmanAddTo?cus.custNo="+id;
		}
	</script>
	
	
</body>
</html>