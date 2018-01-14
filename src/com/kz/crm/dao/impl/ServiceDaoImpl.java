package com.kz.crm.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.ServiceDao;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.ServiceDimParam;

public class ServiceDaoImpl extends HibernateDaoSupport implements ServiceDao {

	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	
	
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

	public List serviceDimList(ServiceDimParam sdp,int page,int pageSize) {
		int max=(page-1)*pageSize;
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstService.class);
		if(isNOtNull(sdp.getSvrCustName())){
			createCriteria.add(Restrictions.like("svrCustName","%"+sdp.getSvrCustName()+"%"));
		}
		if(isNOtNull(sdp.getSvrTitle())){
			createCriteria.add(Restrictions.like("svrTitle","%"+sdp.getSvrType()+"%"));
		}
		if(isNOtNull(sdp.getSvrType())&&!sdp.getSvrType().trim().equals("全部")){
			createCriteria.add(Restrictions.like("svrType","%"+sdp.getSvrType()+"%"));
		}
		if(isNOtNull(sdp.getSvrCreateDate())){
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
			Date a=null;
			try {
				a=formatter.parse(sdp.getSvrCreateDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
			time.format(a);
			createCriteria.add(Restrictions.gt("svrCreateDate",a));
		}
		if(isNOtNull(sdp.getSvrEndDate())){
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
			Date a=null;
			try {
				a=formatter.parse(sdp.getSvrEndDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
			time.format(a);
			createCriteria.add(Restrictions.lt("svrDueDate",a));
		}
		if(isNOtNull(sdp.getSvrStatus())&&!sdp.getSvrStatus().trim().equals("全部")){
			createCriteria.add(Restrictions.eq("svrStatus",sdp.getSvrStatus()));
		}
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public Long serviceDimListCount(ServiceDimParam sdp) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstService.class);
		createCriteria.setProjection(Projections.count("svrId"));
		if(isNOtNull(sdp.getSvrCustName())){
			createCriteria.add(Restrictions.like("svrCustName","%"+sdp.getSvrCustName()+"%"));
		}
		if(isNOtNull(sdp.getSvrTitle())){
			createCriteria.add(Restrictions.like("svrTitle","%"+sdp.getSvrType()+"%"));
		}
		if(isNOtNull(sdp.getSvrType())&&!sdp.getSvrType().trim().equals("全部")){
			createCriteria.add(Restrictions.like("svrType","%"+sdp.getSvrType()+"%"));
		}
		if(isNOtNull(sdp.getSvrCreateDate())){
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
			Date a=null;
			try {
				a=formatter.parse(sdp.getSvrCreateDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
			time.format(a);
			createCriteria.add(Restrictions.gt("svrCreateDate",a));
		}
		if(isNOtNull(sdp.getSvrEndDate())){
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
			Date a=null;
			try {
				a=formatter.parse(sdp.getSvrEndDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
			time.format(a);
			createCriteria.add(Restrictions.lt("svrDueDate",a));
		}
		if(isNOtNull(sdp.getSvrStatus())&&!sdp.getSvrStatus().trim().equals("全部")){
			createCriteria.add(Restrictions.eq("svrStatus",sdp.getSvrStatus()));
		}
		List<Long> list = createCriteria.list();
		return list.get(0);
	}

}
