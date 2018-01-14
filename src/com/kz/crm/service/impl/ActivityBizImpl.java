package com.kz.crm.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ActivityDao;
import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.service.ActivityBiz;

@Service
public class ActivityBizImpl implements ActivityBiz{
	@Autowired
	private ActivityDao activityDao;
	
	public List activityList(CstCustomer cst) {
		List activityList = activityDao.activityList(cst);
		return activityList;
	}

	public void activityAdd(CstCustomer cus, CstActivity activity) {
		long unboundedLong = new Random().nextLong();
		activity.setAtvId(unboundedLong);
		activityDao.activityAdd(cus, activity);
	}
	public CstActivity activityUpdateList(CstActivity activity) {
		CstActivity activityUpdateList = activityDao.activityUpdateList(activity);
		return activityUpdateList;
	}

	public void activityUpdate(CstActivity activity) {
		activityDao.activityUpdate(activity);
	}

	public void activityDelete(CstCustomer cus, CstActivity activity) {
		activityDao.activityDelete(cus, activity);
	}
	
	
	
}
