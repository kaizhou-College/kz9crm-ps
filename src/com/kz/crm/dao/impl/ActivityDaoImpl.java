package com.kz.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.ActivityDao;
import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;

public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {

	public List activityList(CstCustomer cst) {
		Session session = this.getSession();
		CstCustomer customer =(CstCustomer) session.get(CstCustomer.class,cst.getCustNo());
		Set<CstActivity> activity = customer.getActivity();
		List list=new ArrayList();
		list.addAll(activity);
		return list;
	}

	public void activityAdd(CstCustomer cus,CstActivity activity) {
		Session session = this.getSession();
		CstCustomer customer =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		customer.getActivity().add(activity);
		activity.setCustomer(customer);
		
	}

	public CstActivity activityUpdateList(CstActivity activity) {
		Session session = this.getSession();
		CstActivity acti =(CstActivity) session.get(CstActivity.class,activity.getAtvId());
		return acti;
	}

	public void activityUpdate(CstActivity activity) {
		Session session = this.getSession();
		CstActivity acti =(CstActivity) session.get(CstActivity.class,activity.getAtvId());
		acti.setAtvDate(activity.getAtvDate());
		acti.setAtvDesc(activity.getAtvDesc());
		acti.setAtvPlace(activity.getAtvPlace());
		acti.setAtvTitle(activity.getAtvTitle());
		
		
		
	}

	public void activityDelete(CstCustomer cus, CstActivity activity) {
		Session session = this.getSession();
		CstCustomer customer =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		Set<CstActivity> ac = customer.getActivity();
		customer.setActivity(null);
		for(CstActivity a:ac){
			if(a.getAtvId().equals(activity.getAtvId())){
				System.out.println("zm肿么了");
				session.evict(customer);
				session.delete(a);
			}
		}
	}
	
	
}	
