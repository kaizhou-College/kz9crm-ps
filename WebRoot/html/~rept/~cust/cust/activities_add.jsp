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

<div class="page_title">客户信息管理 > 客户信息 > 交往记录 > 新建交往记录</div>

<form action="activity_activityAdd" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<input  class="common_button"  type="submit" value="保存" >  
</div>

<table class="query_form_table">
	<tr>
		<th>时间</th>
		<td>
			<input name="cus.custNo" type="hidden" value="${cus.custNo}">
			<input id="activity_Date" name="activity.atvDate" /><span class="red_star">*</span>
		</td>
		
		
		<th>地点</th>
		<td>
			<input name="activity.atvPlace" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>概要</th>
		<td><input  name="activity.atvTitle" /><span class="red_star">*</span></td>
		<th>备注</th>
		<td><input  name="activity.atvDesc" /></td>
	</tr>	
	<tr>
		<th>详细信息</th>
		<td colspan="3">
			<textarea  name="activity.atvTitle" cols="50" rows="6"> </textarea>
		</td>
	</tr>
</table>
</form>
<script type="text/javascript">

	(function(){
			var intYears,intMonths,intDays,time;
		var today = new Date(); //系统当前时间
		intYears = today.getFullYear(); //得到年份,getFullYear()比getYear()更普适
		intMonths = today.getMonth() + 1; //得到月份，要加1
		intDays = today.getDate(); //得到日期
		time=intYears+"-"+intMonths+"-"+intDays;
		$("#activity_Date").val(time);
	})();
	


	
</script>
</body>
</html>