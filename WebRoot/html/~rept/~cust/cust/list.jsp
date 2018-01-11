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

<div class="page_title">客户信息管理</div>


<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>

<form id="customer_id">
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input /></td>
		<th>名称</th>
		<td><input /></td>
		<th>地区</th>
		<td>
			<select>
				<option>全部</option>
				<option>湖北</option>
				<option>河北</option>
				<option>江南</option>
				<option>湖南</option>
				<option>新疆</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td><input /></td>
		<th>客户等级</th>
		<td>
			
		<s:select list="#{'0':'全部','1':'战略合作伙伴','2':'合作伙伴','3':'大客户','4':'普通客户'}" headerKey="0" headerValue="全部"></s:select>
			<select>
				<option>全部</option>
				<option>战略合作伙伴</option>
				<option>合作伙伴</option>
				<option>大客户</option>
				<option>普通客户</option>
			</select>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
</table>
</form>


<br />
<table class="data_list_table">
	<thead>
	<tr>
		<th>序号</th>
		<th>客户编号</th>
		<th>名称</th>
		<th>地区</th>
		<th>客户经理</th>
		<th>客户等级</th>
		<th>操作</th>
	</tr>
	</thead>
	<tbody id="ajaxList">
		<jsp:include page="byList.jsp" ></jsp:include>
	</tbody>
	<tr>
		<th colspan="100" class="pager">
<div class="pager">
	<pxfy:fy countPlan="${byPage.count}" pageIndex="${byPage.pageIndex}" pageSize="${byPage.pageSize}" pageMax="${byPage.pageMax}" pageUrl="${byPage.pageUrl}"></pxfy:fy>
</div>
		</th>
	</tr>
</table>

<script type="text/javascript">
	function ajaxByList(){
		
		
		
	}

</script>
</body>
</html>
