package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ProductDao;
import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.Product;
import com.kz.crm.entity.ProductDimParam;
public class ProductDaoImpl  extends HibernateDaoSupport implements ProductDao{
	
	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	
	
	public List productByPage(PageParam byPage) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		createCriteria.setFirstResult((byPage.getPageIndex()-1)*byPage.getPageSize());
		createCriteria.setMaxResults(byPage.getPageSize());
		return createCriteria.list();
	}

	public Long productCount() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		createCriteria.setProjection(Projections.count("prodId"));
		List<Long> list = createCriteria.list();
		return list.get(0);
	}

	public List productDimList(ProductDimParam pdp) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		if(ProductDaoImpl.isNOtNull(pdp.getName())){
			createCriteria.add(Restrictions.like("prodName","%"+pdp.getName()+"%"));
		}
		if(ProductDaoImpl.isNOtNull(pdp.getType())){
			createCriteria.add(Restrictions.like("prodType","%"+pdp.getType()+"%"));
		}
		if(ProductDaoImpl.isNOtNull(pdp.getBatch())){
			createCriteria.add(Restrictions.like("prodBatch","%"+pdp.getBatch()+"%"));
		}
		List list = createCriteria.list();
		return list;
	}

}
