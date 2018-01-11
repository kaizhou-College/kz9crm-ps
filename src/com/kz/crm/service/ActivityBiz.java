package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;

public interface ActivityBiz {
	List activityList(CstCustomer cst);
	void activityAdd(CstCustomer cus,CstActivity activity);
	CstActivity activityUpdateList(CstActivity activity);
	void activityUpdate(CstActivity activity);
	void activityDelete(CstCustomer cus,CstActivity activity);
}
