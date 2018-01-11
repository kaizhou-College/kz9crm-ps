package com.kz.crm.service;


import java.util.List;


public interface OrdersLineBiz {
	
	public List queryOrdersLine();

	public String queryById(Long oddOrderId);

}
