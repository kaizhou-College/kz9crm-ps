package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.SalChance;

public interface ChanceBiz {
	// ����
	int save(SalChance chance);

	List query();

}
