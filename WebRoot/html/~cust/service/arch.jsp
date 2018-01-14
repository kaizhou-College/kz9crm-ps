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

<div class="page_title">客户服务管理 &gt; 服务归档</div>
<form action="service_serviceDimList" method="post">
<input type="hidden" name="url" value="serviceDimList-arch">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input type="submit" class="common_button" value="查询" />
</div>
<table class="query_form_table">
	<tr>
		<th height="28" >客户</th>
		<td><input name="sdp.svrCustName" value="${sdp.svrCustName}" /></td>
		<th height="28">概要</th>
		<td><input name="sdp.svrTitle" value="${sdp.svrTitle}"  /></td>
		<th height="28">服务类型</th>
		<td>
			<s:select list="{'全部','咨询','建议','投诉'}"  name="sdp.svrType"  value="sdp.svrType"></s:select>
		</td>
	</tr>
	<tr>
		<th height="32">创建日期</th>
		<td colspan="3">
			<input  name="sdp.svrCreateDate" value="${sdp.svrCreateDate}"  size="10" /> - 
			<input  name="sdp.svrEndDate" value="${sdp.svrEndDate}"  size="10" /></td>
		<th height="32">状态</th>
		<td>
			<s:select list="{'全部','新建','已处理','已归档'}" name="sdp.svrStatus" value="sdp.svrStatus"></s:select>
		</td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>概要</th>
		<th>服务类型</th>
		<th>创建人</th>
		<th>创建日期</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<s:iterator value="serviceByPage" var="list">
		<tr>
		<td class="list_data_number"><s:property value="#list.svrId" /> </td>
		<td class="list_data_text"><s:property value="#list.svrCustName" /></td>
		<td class="list_data_ltext"><s:property value="#list.svrTitle" /></td>
		<td class="list_data_text"><s:property value="#list.svrType" /></td>
		<td class="list_data_text"><s:property value="#list.svrCreateBy" /></td>
		<td class="list_data_text">
			<input type="hidden" name="service.svrId" value="<s:property value='#list.svrId' />">
			<s:property value="#list.svrCreateDate" />
		</td>
		<td class="list_data_text">
			<s:property value="#list.svrStatus" />
		</td>
		<td class="list_data_op">
						
			<img onmousedown="serviceArchlList('${list.svrId}')"  title="处理" src="${basePath}/html/images/bt_detail.gif" class="op_button" />  
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
	<pageDim:fy url="${url}" svrCreateDate="${sdp.svrCreateDate}" svrCustName="${sdp.svrCustName}" svrEndDate="${sdp.svrEndDate}" svrStatus="${sdp.svrStatus}" svrTitle="${sdp.svrTitle}" svrType="${sdp.svrType}" countPlan="${byPage.countPlan}" pageIndex="${byPage.pageIndex}" pageSize="${byPage.pageSize}" pageMax="${byPage.pageMax}" pageUrl="${byPage.pageUrl}"></pageDim:fy>
</div>
		</th>
	</tr>
</table>
<script type="text/javascript">
		function formSkip(){
		var pageIndex=document.getElementById("pageIndex").value;
		location.href="${byPage.pageUrl}?byPage.pageIndex="+pageIndex+"&sdp.svrCustName=${sdp.svrCustName}&sdp.svrTitle=${sdp.svrTitle}&sdp.svrType=${sdp.svrType}&sdp.svrCreateDate=${sdp.svrCreateDate}&sdp.svrEndDate=${sdp.svrEndDate}&sdp.svrStatus=${sdp.svrStatus}&url=serviceDimList-deal";
	}
	function serviceArchlList(id){
		location.href="service_serviceArchlList?service.svrId="+id;
	}
	
</script>
</body>
</html>