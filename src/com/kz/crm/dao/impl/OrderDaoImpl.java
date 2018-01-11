package com.kz.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.Order;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.OrderDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.Orders;
import com.kz.crm.entity.OrdersLine;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	public List orderList(CstCustomer cus) {
		System.out.println("贱人了");
		Session session = this.getSession();
		CstCustomer customer =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		Set<Orders> order = customer.getOrder();
		List list=new ArrayList();
		System.out.println(list);
		list.addAll(order);
		System.out.println("出来了");
		return list;
	}

	public List orderLineLit(Orders order) {
		System.out.println("123213");
		Session session = this.getSession();
		
		Orders s =(Orders) session.get(Orders.class,order.getOdrId());
		System.out.println(s);
		List list=new ArrayList();
		System.out.println(list);
		list.addAll(s.getOrderLine());
		System.out.println(list);
		System.out.println("-=-=");
		return list;
	}

	public Orders orderList(Orders order) {
		System.out.println(" 贱人了");
		Session session = this.getSession();
		Orders s =(Orders) session.get(Orders.class,order.getOdrId());
		System.out.println("sdosdfmk 差速度快 ");
		return s;
	}

}
