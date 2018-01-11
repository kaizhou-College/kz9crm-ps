package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.OrdersLineDao;
import com.kz.crm.entity.Orders;
import com.kz.crm.entity.OrdersLine;

public class OrdersLineDaoImpl extends HibernateDaoSupport implements OrdersLineDao{
	//查询
	public List queryOrdersLine() {
		Session session = this.getSession();
		List<OrdersLine> list = session.createCriteria(OrdersLine.class).list();
		return list;
	}
//根据订单详情ID查客户名称
	public String queryById(Long oddOrderId) {
		Session session = this.getSession();
		Orders orders = (Orders) session.get(Orders.class, oddOrderId);
		System.out.println("daoimpl里的==="+orders.getOdrCustomer());
		return orders.getOdrCustomer();
	}

	

}
