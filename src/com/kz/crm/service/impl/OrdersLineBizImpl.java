package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.OrdersLineDao;
import com.kz.crm.service.OrdersLineBiz;
@Service
public class OrdersLineBizImpl implements OrdersLineBiz{
	@Autowired
	private OrdersLineDao old;
	public List queryOrdersLine() {
		return old.queryOrdersLine();
	}
	//根据ID查客户名称
	public String queryById(Long oddOrderId) {
		return old.queryById(oddOrderId);
	}

}
