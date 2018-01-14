package com.kz.crm.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ServiceDao;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.ServiceDimParam;
import com.kz.crm.service.ServiceBiz;
@Service
public class ServiceBizImpl implements ServiceBiz {
	@Autowired
	private ServiceDao serviceDao;

	public void serviceAdd(CstService service) {
		serviceDao.serviceAdd(service);
	}

	public Long serviceByCountPage(int page, int pageSize) {
		Long serviceByCountPage = serviceDao.serviceByCountPage(page, pageSize);
		return serviceByCountPage;
	}

	public List serviceByPage(int page, int pageSize) {
		return serviceDao.serviceByPage(page, pageSize);
	}

	public void serviceDueToUpdate(CstService service) {
		serviceDao.serviceDueToUpdate(service);
	}

	public void serviceDelet(CstService service) {
		serviceDao.serviceDelet(service);
	}

	public CstService serviceDetailList(CstService service) {
		return serviceDao.serviceDetailList(service);
	}

	public void serviceDetailUpdate(CstService service) {
		serviceDao.serviceDetailUpdate(service);
	}

	public List serviceDimList(ServiceDimParam sdp,int page,int pageSize) {
		return serviceDao.serviceDimList(sdp,page,pageSize);
	}

	public Long serviceDimListCount(ServiceDimParam sdp) {
		return serviceDao.serviceDimListCount(sdp);
	}
	
	
	
	
}
