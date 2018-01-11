package com.kz.crm.dao.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.CustomerDao;
import com.kz.crm.entity.CstCustomer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public List byPageCustomerDao(int page, int pageSize) {
		Session session = this.getSession();
		
		Criteria createCriteria = session.createCriteria(CstCustomer.class);
		
		int max=(page-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		 
		List list = createCriteria.list();
		return list;
	}
	
	
	//统计查询
	public Long countCustomer() {
		Session session = this.getSession();
		
		Criteria createCriteria = session.createCriteria(CstCustomer.class);
		createCriteria.setProjection(Projections.count("custNo"));//添加  投影   统计查询
		
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	public void customerDelete(CstCustomer cus) {
		Session session = this.getSession();
		CstCustomer c =(CstCustomer) session.get(CstCustomer.class ,cus.getCustNo());
		session.delete(c);
	}


	public CstCustomer listSingle(CstCustomer cut) {
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer)session.get(CstCustomer.class,cut.getCustNo());
		return cstCustomer;
	}


	public void customerUpdate(CstCustomer cus) {
		Session session = this.getSession();
		session.update(cus);
	}



}
