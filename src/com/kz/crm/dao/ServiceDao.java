package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.CstService;

public interface ServiceDao {
	void serviceAdd(CstService service);
	
	List serviceByPage(int page,int pageSize);
	Long serviceByCountPage(int page,int pageSize);
	
	void serviceDueToUpdate(CstService service);
	
	void serviceDelet(CstService service);
	
	CstService serviceDetailList(CstService service);
	
	void serviceDetailUpdate(CstService service);
	
}
