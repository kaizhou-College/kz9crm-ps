package com.kz.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.ChanceDao;
import com.kz.crm.entity.SalChance;

public class ChaceDaoImpl extends HibernateDaoSupport implements ChanceDao {
	// ����
	public int save(SalChance chance) {
		Session session = this.getSession();
		return (Integer) session.save(chance);
	}

	// ��ѯ
	public List query() {
		Session session = this.getSession();
		List<SalChance> list = (List) session.createCriteria(SalChance.class).list();
		return list;
	}

}
