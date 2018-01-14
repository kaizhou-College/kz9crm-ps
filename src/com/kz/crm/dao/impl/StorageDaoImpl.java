package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.StorageDao;
import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.Product;
import com.kz.crm.entity.StorageDimParam;

public class StorageDaoImpl extends HibernateDaoSupport implements StorageDao{
	
	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	
	
	public List<String[]> byPageStorage(PageParam byPage) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		createCriteria.createAlias("storages","s");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("s.stkId"));
		projectionList.add(Projections.property("prodName"));
		projectionList.add(Projections.property("s.stkWarehouse"));
		projectionList.add(Projections.property("s.stkWare"));
		projectionList.add(Projections.property("prodMemo"));
		createCriteria.setProjection(projectionList);
		createCriteria.setFirstResult((byPage.getPageIndex()-1)*byPage.getPageSize());
		createCriteria.setMaxResults(byPage.getPageSize());
		List<String[]> list = createCriteria.list();
		return list;
	}
	public Long byPageStorageCount() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		createCriteria.createAlias("storages","s");
		createCriteria.setProjection(Projections.count("prodId"));
		List<Long> list = createCriteria.list();
		return list.get(0);
	}
	public List storageDim(StorageDimParam sdp) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		createCriteria.createAlias("storages","s");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("s.stkId"));
		projectionList.add(Projections.property("prodName"));
		projectionList.add(Projections.property("s.stkWarehouse"));
		projectionList.add(Projections.property("s.stkWare"));
		projectionList.add(Projections.property("prodMemo"));
		createCriteria.setProjection(projectionList);
		if(isNOtNull(sdp.getProdName())){
			createCriteria.add(Restrictions.like("prodName","%"+sdp.getProdName()+"%"));
		}if(isNOtNull(sdp.getStkWarehouse())){
			createCriteria.add(Restrictions.like("s.stkWarehouse","%"+sdp.getStkWarehouse()+"%"));
		}
		List list = createCriteria.list();
		return list;
	}

}
