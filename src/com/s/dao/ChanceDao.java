package com.s.dao;

import java.util.List;

import com.s.entity.SalChance;

public interface ChanceDao {
	//����
	public int save(SalChance chance);

	public List query();

}
