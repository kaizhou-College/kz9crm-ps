package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;

public interface ActivityDao {
	List activityList(CstCustomer cst);
	void activityAdd(CstCustomer cus, CstActivity activity);
	CstActivity activityUpdateList(CstActivity activity);
	void activityUpdate(CstActivity activity);
	void activityDelete(CstCustomer cus, CstActivity activity);
}
