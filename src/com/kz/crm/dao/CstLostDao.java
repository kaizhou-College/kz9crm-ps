package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstLost;

public interface CstLostDao {
	List currentPage(int page, int pageSize);

	Long countPage();

	CstLost queryId(int lstId);

	void update(Class<CstLost> class1, int lstId,String lstReason);
	List quartzquery();

	void add(Object object);
}
