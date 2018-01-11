package com.s.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.s.dao.ChanceDao;
import com.s.entity.SalChance;

public class ChaceDaoImpl extends HibernateDaoSupport implements ChanceDao {
	// ÐÂÔö
	public int save(SalChance chance) {
		Session session = this.getSession();
		return (Integer) session.save(chance);
	}

	// ²éÑ¯
	public List query() {
		Session session = this.getSession();
		List<SalChance> list = (List) session.createCriteria(SalChance.class)
				.list();
		return list;
	}

}
