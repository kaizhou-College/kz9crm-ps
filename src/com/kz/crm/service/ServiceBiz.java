package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstService;
import com.kz.crm.entity.ServiceDimParam;

public interface ServiceBiz {
	void serviceAdd(CstService service);
	List serviceByPage(int page,int pageSize);
	Long serviceByCountPage(int page,int pageSize);
	void serviceDueToUpdate(CstService service);
	void serviceDelet(CstService service);
	CstService serviceDetailList(CstService service);
	void serviceDetailUpdate(CstService service);
	List serviceDimList(ServiceDimParam sdp,int page,int pageSize);
	Long serviceDimListCount(ServiceDimParam sdp);
}
