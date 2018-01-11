package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.Orders;
import com.kz.crm.service.OrderBiz;

@Controller
@Scope("prototype")
public class OrderAction {
	@Autowired
	private OrderBiz orderBiz;
	
	private CstCustomer cus;
	private Orders order;
	
	private List<Orders> orderList;
	private List orderLineLit;
	
	public String orderList(){
		orderList = orderBiz.orderList(cus);
		
		return "orderList";
	}
	
	public String OrderLineList(){
		System.out.println("在acrion中");
		System.out.println(order);
		orderLineLit = orderBiz.orderLineLit(order);
		System.out.println("action查询完毕");
		System.out.println("-=-=-=-"+order);
		order = orderBiz.orderList(order);
		System.out.println("成功跳出action");
		return "OrderLineList";
	}
	
	public CstCustomer getCus() {
		return cus;
	}

	public void setCus(CstCustomer cus) {
		this.cus = cus;
	}

	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public List getOrderLineLit() {
		return orderLineLit;
	}

	public void setOrderLineLit(List orderLineLit) {
		this.orderLineLit = orderLineLit;
	}


	
	
}
