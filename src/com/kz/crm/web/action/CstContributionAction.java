package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.dao.OrdersLineDao;
import com.kz.crm.entity.OrdersLine;
import com.kz.crm.service.OrdersLineBiz;

@Controller
@Scope("prototype")
public class CstContributionAction {
	//客户贡献分析
	private OrdersLine ordersLine;
	private List<OrdersLine> list;
	private String contributionName;
	@Autowired
	private OrdersLineBiz olb; 
	//查询数据
	public String query(){
		list = olb.queryOrdersLine();
		System.out.println("进入查询"+list);
		return "query_success";
	}
	public OrdersLine getOrdersLine() {
		return ordersLine;
	}
	public void setOrdersLine(OrdersLine ordersLine) {
		this.ordersLine = ordersLine;
	}
	public List<OrdersLine> getList() {
		return list;
	}
	public void setList(List<OrdersLine> list) {
		this.list = list;
	}
	public String getContributionName() {
		return contributionName;
	}
	public void setContributionName(String contributionName) {
		this.contributionName = contributionName;
	}
	public OrdersLineBiz getOlb() {
		return olb;
	}
	public void setOlb(OrdersLineBiz olb) {
		this.olb = olb;
	}
	
	


	

}
