package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.Orders;

public interface OrderBiz {
	List orderList(CstCustomer cus);
	List orderLineLit(Orders order);
	Orders orderList(Orders order);
}
