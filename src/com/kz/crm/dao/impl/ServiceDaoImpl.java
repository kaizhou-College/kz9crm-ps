package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.ServiceDao;
import com.kz.crm.entity.CstService;

public class ServiceDaoImpl extends HibernateDaoSupport implements ServiceDao {

	public void serviceAdd(CstService service) {
		Session session = this.getSession();
		session.save(service);
	}

	public Long serviceByCountPage(int page,int pageSize) {
		Session session = this.getSession();
		
		Criteria createCriteria = session.createCriteria(CstService.class);
		createCriteria.setProjection(Projections.count("svrId"));
			
		List<Long> list = createCriteria.list();
		return list.get(0);
	}

	public List serviceByPage(int page,int pageSize) {
		
		int max=(page-1)*pageSize;
		
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstService.class);
		
		
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		
		List list = createCriteria.list();
		
		return list;
	}

	public void serviceDueToUpdate(CstService service) {
		Session session = this.getSession();
		CstService  cstService = (CstService) session.get(CstService.class,service.getSvrId());
		cstService.setSvrDueTo(service.getSvrDueTo());
	}

	public void serviceDelet(CstService service) {
		Session session = this.getSession();
		CstService cst =(CstService) session.get(CstService.class,service.getSvrId());
		session.delete(cst);
	}

	public CstService serviceDetailList(CstService service) {
		Session session = this.getSession();
		CstService cst =(CstService) session.get(CstService.class,service.getSvrId());
		return cst;
	}

	public void serviceDetailUpdate(CstService service) {
		Session session = this.getSession();
		CstService cst =(CstService) session.get(CstService.class,service.getSvrId());
		if(service.getSvrDeal()!=null){
			cst.setSvrDeal(service.getSvrDeal()); 
		}if(service.getSvrDealBy()!=null){
			cst.setSvrDealBy(service.getSvrDealBy() );
		}if(service.getSvrDealBy()!=null){
			cst.setSvrDealBy(service.getSvrDealBy() );
		}if(service.getSvrResult()!=null){
			cst.setSvrResult(service.getSvrResult() );
		}if(service.getSvrSatisfy()!=null){
			cst.setSvrSatisfy (service.getSvrSatisfy() );
		}
	}

}
