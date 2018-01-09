package com.s.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s.dao.ChanceDao;
import com.s.entity.SalChance;
import com.s.service.ChanceBiz;
@Service
public class ChanceBizImpl implements ChanceBiz{
	@Autowired
	private ChanceDao dao;
	//²éÑ¯
	public List query() {
		List list = dao.query();
		return list;
	}
	//ÐÂÔö
	public int save(SalChance chance) {
		int res = dao.save(chance);
		return res;
	}
	
	
	





}
