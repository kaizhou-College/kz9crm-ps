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
   <s:iterator value="byPageCustomerDao" var="list" status="index">
		<tr>
		<td class="list_data_number"><s:property value="#index.index"/> </td>
		<td class="list_data_text" id="list_data_text"><s:property value="#list.custNo"/></td>
		<td class="list_data_ltext"><s:property value="#list.custName"/></td>
		<td class="list_data_text"><s:property value="#list.custRegion"/></td>
		<td class="list_data_text"><s:property value="#list.custManagerId"/></td>
		<td class="list_data_text"><s:property value="#list.custManagerName"/></td>
		<td class="list_data_op">
			<img onmousedown="customerUpdateList('${list.custNo}')"  title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />&nbsp;
			<img onmousedown="lingkmanList('${list.custNo}');"  title="联系人" src="${basePath}/html/images/bt_linkman.gif" class="op_button" />
			<img onmousedown="activityList('${list.custNo}');"  title="交往记录" src="${basePath}/html/images/bt_acti.gif" class="op_button" />
			<img  onmousedown="orderList('${list.custNo}');" title="历史订单" src="${basePath}/html/images/bt_orders.gif" class="op_button" />
			<img onmousedown="customerDelete('${list.custNo}');" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
			<script type="text/javascript">
				function lingkmanList(id){
					location.href="linkman_lingkmanList?cus.custNo="+id+"&&cus.custName=${list.custName}";
				}
				
				function orderList(id){
					location.href="order_orderList?cus.custNo="+id+"&&cus.custName=${list.custName}";
					
				}
				
			</script>
		</td>
	</tr>
	</s:iterator>
   
   
  </body>
</html>
