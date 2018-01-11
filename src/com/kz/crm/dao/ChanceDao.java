package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.SalChance;

public interface ChanceDao {
	// 增加
	public int save(SalChance chance);
	//查询
	public List query();

}
