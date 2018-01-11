package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ChanceDao;
import com.kz.crm.entity.SalChance;
import com.kz.crm.service.ChanceBiz;

@Service
public class ChanceBizImpl implements ChanceBiz {
	@Autowired
	private ChanceDao dao;

	// ²éÑ¯
	public List query() {
		List list = dao.query();
		return list;
	}

	// ÐÂÔö
	public int save(SalChance chance) {
		int res = dao.save(chance);
		return res;
	}

}
