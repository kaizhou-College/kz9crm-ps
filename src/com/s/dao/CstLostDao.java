package com.s.dao;

import java.util.List;

import com.s.entity.CstLost;

public interface CstLostDao {
	// ��ҳ��ѯ
	List currentPage(int page, int pageSize);

	Long countPage();

	CstLost queryId(int lstId);

	void update(Class<CstLost> class1, int lstId,String lstReason);
	//��ʱ��
	List quartzquery();
	//���

	void add(Object object);
}
