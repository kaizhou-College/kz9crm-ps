package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.SalChance;

public interface ChanceDao {
	// ����
	public int save(SalChance chance);

	public List query();

}
