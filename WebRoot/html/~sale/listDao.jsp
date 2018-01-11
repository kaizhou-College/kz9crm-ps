<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/html/comm/comm.jsp" %>
<s:iterator value="byPage" var="list">
		<tr>
		<td class="list_data_number"><s:property value="#list.chcId"/>111</td>
		<td class="list_data_text"><s:property value="#list.chcCustName"/></td>
		<td class="list_data_ltext"><s:property value="#list.chcTitle"/></td>
		<td class="list_data_text"><s:property value="#list.chcLinkman"/></td>
		<td class="list_data_text"><s:property value="#list.chcTel"/></td>
		<td class="list_data_text"><s:property value="#list.chcCreateDate"/></td>
		<td class="list_data_text">
			<s:if test="#list.salChance.chcStatus<4">
				开发中
			</s:if><s:else>
				已结档
			</s:else>
		</td>
		<td class="list_data_op">
			<s:if test="#list.chcStatus<4">
				<img onclick="to('plan_planListBeing?sc.chcId=<s:property value='#list.chcId'/>');" title="制定计划" src="${basePath}/html/images/bt_plan.gif" class="op_button" />
				<img onclick="to('~sale/dev_execute.html');" title="执行计划" src="${basePath}/html/images/bt_feedback.gif" class="op_button" />
				<img onclick="alert('用户开发成功，已添加新客户记录。');" title="开发成功" src="${basePath}/html/images/bt_yes.gif" class="op_button" />
			</s:if><s:else>
				<img onclick="to('plan_planList?sc.chcId=<s:property value='#list.chcId'/>');" title="查看" src="${basePath}/html/images/bt_detail.gif" class="op_button" />
			</s:else>
		</td>
	</tr>
	</s:iterator>	
	<tr>
	<th colspan="10" class="pager">
		<div class="pager" >
			<kzfy:fy  pageIndex="${page}" pageSize="${pageSize}" pageUrl="${pageUrl}" pageMax="${pageMax}" countPlan="${countPlan }"></kzfy:fy>
		</div>
	</th>
	</tr>
	