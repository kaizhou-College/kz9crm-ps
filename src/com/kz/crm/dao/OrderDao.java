package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.Orders;

public interface OrderDao {
	List orderList(CstCustomer cus);
	
	List orderLineLit(Orders order);
	Orders orderList(Orders order);
}
