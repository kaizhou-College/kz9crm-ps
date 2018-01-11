package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstLost;

public interface CstLostBiz {

	public List currentPage(int page, int pageSize);

	public Long countPage();

	public CstLost queryId(int lstId);

	public void updateId(Class<CstLost> class1, int lstId,String lstReason);
	//Ìí¼Ó
	public void add(Object object);
	//¶¨Ê±Æ÷
	public void timesWork();

}
