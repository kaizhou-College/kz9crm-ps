package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstLost;

public interface CstLostDao {
	// 分页
	List currentPage(int page, int pageSize);

	Long countPage();

	CstLost queryId(int lstId);

	void update(Class<CstLost> class1, int lstId,String lstReason);
	//定时器
	List quartzquery();
	//添加

	void add(Object object);
}
