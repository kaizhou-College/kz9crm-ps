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
<form action="service_serviceAdd" method="post">
<div class="page_title">客户服务管理 > 服务创建</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
 	<input type="submit"  class="common_button"  value="保存" >	
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input name="service.svrId"   value="${service.svrId}"  /></td>
		<th>服务类型</th>
		<td>
			<select name="service.svrType"  >
				<option value="未选择">请选择...</option>
				<option value="咨询" >咨询</option>
				<option value="投诉">投诉</option>
				<option value="建议">建议</option>
			</select>
			
			<span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3"><input name="service.svrTitle" value="概要"  size="53" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>客户</th>
		<td><input name="service.svrCustName"  value="小红" size="20" /><span class="red_star">*</span></td>
		<th>状态</th>
		<td><input name="service.svrStatus" value="新建"> </td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3"><textarea name="service.svrRequest" rows="6" cols="50">服务请求</textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input name="service.svrCreateBy"   value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><input name="service.svrCreateDate"  id="t1"  readonly size="20" /><span class="red_star">*</span></td>
	</tr>
	</table>
<br />
<table disabled class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>
			<select name="service.svrDueTo"  >
				<option value="未选择">请选择...</option>
				<option  value="小明">小明</option>
				<option  value="旺财">旺财</option>
				<option  value="球球">球球</option>
				<option value="孙小美">孙小美</option>
				<option value="周洁轮">周洁轮</option>
			</select> <span class="red_star">*</span></td>
		<th>分配时间</th>
		<td><input name="service.svrDueDate"  id="t2"  readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />	
<table disabled class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea name="service.svrDeal"   rows="6" cols="50">还不错吧</textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><input name="service.svrDealBy"   value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
		<th>处理时间</th>
		<td><input name="service.svrDealDate"  id="t3"  readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input name="service.svrResult" value="可以吧"   size="20" /><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
			<select name="service.svrSatisfy"  >
				<option value="未选择">请选择...</option>
				<option  value="5">☆☆☆☆☆</option>
				<option value="4">☆☆☆☆</option>
				<option value="3">☆☆☆</option>
				<option value="2">☆☆</option>
				<option value="1">☆</option>
			</select><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<script>
	(function(){
			var intYears,intMonths,intDays,time;
		var today = new Date(); //系统当前时间
		intYears = today.getFullYear(); //得到年份,getFullYear()比getYear()更普适
		intMonths = today.getMonth() + 1; //得到月份，要加1
		intDays = today.getDate(); //得到日期
		time=intYears+"-"+intMonths+"-"+intDays;
		$("#t1").val(time);
		$("#t2").val(time);
		$("#t3").val(time);
		
	})();
</script>
</body>
</html>