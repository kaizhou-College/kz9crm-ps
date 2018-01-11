package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.OrdersLine;

public interface OrdersLineDao {
	//查询
	public List queryOrdersLine();
//根据ID查客户名称
	public String queryById(Long oddOrderId);
	
	

}
