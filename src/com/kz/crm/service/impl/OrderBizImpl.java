package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.OrderDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.Orders;
import com.kz.crm.service.OrderBiz;

@Service
public class OrderBizImpl  implements OrderBiz{
	@Autowired
	private OrderDao orderDao;

	public List orderList(CstCustomer cus) {
		List orderList = orderDao.orderList(cus);
		return orderList;
	}

	public List orderLineLit(Orders order) {
		List orderLineLit = orderDao.orderLineLit(order);
		return orderLineLit;
	}

	public Orders orderList(Orders order) {
		Orders orderList = orderDao.orderList(order);
		return orderList;
	}
}
