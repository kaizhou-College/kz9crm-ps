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

<div class="page_title">数据字典管理</div>
<form action="dictAction_dictDimList" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onmousedown="dictInsertTo();" >新建</button>
	<input value="查询" type="submit"class="common_button"  >
</div>
<table class="query_form_table">
	<tr>
		<th>类别</th>
		<td><input name="dim.type" value="${dim.type}"/></td>
		<th>条目</th>
		<td><input  name="dim.item" value="${dim.item}"/></td>
		<th>值</th>
		<td><input  name="dim.value" value="${dim.value}"/></td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>类别</th>
		<th>条目</th>
		<th>值</th>
		<th>是否可编辑</th>
		<th>操作</th>
	</tr>
	<s:iterator value="dicByPage" var="list">
		<tr>
		<td class="list_data_number"><s:property value="#list.dictId"/> </td>
		<td class="list_data_ltext"><s:property value="#list.dictType"/></td>
		<td class="list_data_text"><s:property value="#list.dictItem"/></td>
		<td class="list_data_text"><s:property value="#list.dictValue"/></td>
		<td class="list_data_text">
			<s:if test="#list.dictIsEditable==1">是</s:if>
			<s:elseif test="#list.dictIsEditable==0">否</s:elseif>
		</td>
		<td class="list_data_op">
			<s:if test="#list.dictIsEditable==1">
				<img onmousedown="dictUpdate('${list.dictId}')"  title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
				<img onmousedown="dictDelete('${list.dictId}')" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
			</s:if>
		</td>
	</tr>
	</s:iterator>
	
	<tr>
		<th colspan="6" class="pager">
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
	function dictUpdate(id){
		location.href="dictAction_dictList?basDict.dictId="+id;
	}
	function dictInsertTo(){
		location.href="dictAction_dictInsertTo";
	}
	function dictDelete(id){
		location.href="dictAction_dictDelete?basDict.dictId="+id;
	}
</script>
</body>
</html>