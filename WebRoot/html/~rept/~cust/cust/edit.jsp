<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/com/com.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/js/js.js"></script>
<script type="text/javascript" src="${basePath}/html/jquery/jquery-1.4.2.min.js"></script>
</head>
<body>

<form action="customer_customerUpdate" method="post">
<div class="page_title">客户信息管理 > 客户信息</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('linkman.html');">联系人</button>
	<button class="common_button" onclick="to('activities.html');">交往记录</button>
	<button class="common_button" onclick="to('orders.html');">历史订单</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<input type="submit" class="common_button"  value="保存"> 
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><s:property value="cus.custNo"/> <input name="cus.custNo" type="hidden"  value="<s:property value='cus.custNo'/>"> </td>
		
		<th>名称</th>
		<td><input  name="cus.custName"  value="<s:property value='cus.custName'/>" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地区</th>
		<td>
			<input  name="cus.custRegion" value="<s:property value='cus.custRegion'/>" />
			<span class="red_star">*</span></td>
		<th>客户经理</th>
		<td>
			
			<select  name="cus.custManagerId">
				<option value="1" >小明</option>
				<option  value="2">旺财</option>
				<option  value="3">球球</option>
				<option  value="4">孙小美</option>
			</select>
			
			<span class="red_star">*</span>
		</td>
	</tr>	
	<tr>
		<th>客户等级</th>
		<td>
		<s:select  name="cus.custLevel" list="{'战略合作伙伴','合作伙伴','大客户','重点开发客户','普通客户'}"></s:select>
		<span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
	<tr>
		<th>客户满意度</th>
		<td>
			<select  name="cus.custSatisfy"><option value="">未指定</option>
					<option value="5">☆☆☆☆☆</option>
					<option value="4">☆☆☆☆</option>
					<option value="3" selected="selected">☆☆☆</option>
					<option value="2">☆☆</option>
					<option value="1">☆</option></select><span class="red_star">*</span>
		</td>
		<th>客户信用度</th>
		<td>
			<select  name="cus.custCredit"><option value="">未指定</option>
					<option value="5">☆☆☆☆☆</option>
					<option value="4">☆☆☆☆</option>
					<option value="3" selected="selected">☆☆☆</option>
					<option value="2">☆☆</option>
					<option value="1">☆</option></select><span class="red_star">*</span>
		</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>地址</th>
		<td><input  name="cus.custAddr" value="<s:property value='cus.custAddr'/>"  /><span class="red_star">*</span>
		</td>
		<th>邮政编码</th>
		<td><input name="cus.custZip" value="<s:property value='cus.custZip'/>" name="T1" size="20"  /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>电话</th>
		<td>
			<input name="cus.custTel" value="<s:property value='cus.custTel'/>" name="T4" size="20"  /><span class="red_star">*</span></td>
		<th>传真</th>
		<td>
			<input name="cus.custFax" value="<s:property value='cus.custFax'/>" name="T5" size="20"  /><span class="red_star">*</span>
		</td>
	</tr>	
	<tr>
		<th>网址</th>
		<td>
			<input name="cus.custWebsite" value="<s:property value='cus.custWebsite'/>" name="T6" size="20"  /><span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table2">
	<tr>
		<th>营业执照注册号</th>
		<td><input name="cus.custLicenceNo" value="<s:property value='cus.custLicenceNo'/>" name="T13" size="20" /></td>
		<th>法人</th>
		<td><input name="cus.custChieftain" value="<s:property value='cus.custChieftain'/>" name="T3" size="20" /><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>注册资金（万元）</th>
		<td>
			<input name="cus.custTurnover" value="<s:property value='cus.custTurnover'/>" name="T7" size="20" /> </td>
		<th>年营业额</th>
		<td>
			<input name="cus.custBank" value="<s:property value='cus.custBank'/>" name="T8" size="20" />
		</td>
	</tr>	
	<tr>
		<th>开户银行</th>
		<td>
			<input name="cus.custBankAccount" value="<s:property value='cus.custBankAccount'/>" name="T9" size="20" /><span class="red_star">*</span>
		</td>
		<th>银行帐号</th>
		<td><input name="cus.custWebsite" value="<s:property value='cus.custWebsite'/>" name="T10" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地税登记号</th>
		<td>
			<input name="cus.custLocalTaxNo" value="<s:property value='cus.custLocalTaxNo'/>" name="T11" size="20" /></td>
		<th>国税登记号</th>
		<td><input name="cus.custNationalTaxNo" value="<s:property value='cus.custNationalTaxNo'/>" name="T12" size="20" /></td>
	</tr>
</table>
</form>
<p>　</p>
</body>
</html>