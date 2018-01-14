package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.DictDao;
import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.DictDimList;
import com.kz.crm.entity.PageParam;

public class DictDaoImpl extends HibernateDaoSupport implements DictDao {

	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	
	//分页
	public List DicByPage(PageParam pageParam) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		createCriteria.setFirstResult((pageParam.getPageIndex()-1)*pageParam.getPageSize());
		createCriteria.setMaxResults(pageParam.getPageSize());
		return createCriteria.list();
	}

	public Long countDict() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		createCriteria.setProjection(Projections.count("dictId"));
		List<Long> list = createCriteria.list();
		return list.get(0);
	}

	public BasDict dictList(BasDict basDic) {
		Session session = this.getSession();
		BasDict bas = (BasDict)session.get(BasDict.class,basDic.getDictId());
		return bas;
	}

	public void dictUpdate(BasDict basDic) {
		Session session = this.getSession();
		BasDict bas =(BasDict) session.get(basDic.getClass(),basDic.getDictId());
		if(basDic.getDictIsEditable()!=null){
			bas.setDictIsEditable(basDic.getDictIsEditable());
		}else{
			bas.setDictIsEditable(0);
		}
		if(basDic.getDictItem()!=null){
			bas.setDictItem(basDic.getDictItem());
		}
		if(basDic.getDictType()!=null){
			bas.setDictType(basDic.getDictType());
		}
		if(basDic.getDictValue()!=null){
			bas.setDictValue(basDic.getDictValue());
		}
	}

	public void dictAdd(BasDict basDict) {
		Session session = this.getSession();
		session.save(basDict);
	}

	public void dictDelete(BasDict basDict) {
		Session session = this.getSession();
		BasDict bas =(BasDict) session.get(BasDict.class,basDict.getDictId());
		session.delete(bas);
	}

	public List dictDimList(DictDimList dim) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		if(DictDaoImpl.isNOtNull(dim.getType())){
			createCriteria.add(Restrictions.like("dictType","%"+dim.getType()+"%"));
		}
		if(DictDaoImpl.isNOtNull(dim.getItem())){
			createCriteria.add(Restrictions.like("dictItem","%"+dim.getItem()+"%"));
		}
		if(DictDaoImpl.isNOtNull(dim.getValue())){
			createCriteria.add(Restrictions.like("dictValue","%"+dim.getValue()+"%"));
		}
		List list = createCriteria.list();
		return list;
	}
}
