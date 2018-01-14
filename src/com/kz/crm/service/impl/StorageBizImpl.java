package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.StorageDao;
import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.StorageDimParam;
import com.kz.crm.service.StorageBiz;
@Service
public class StorageBizImpl implements StorageBiz {
	@Autowired
	private StorageDao storageDao;

	public List byPageStorage(PageParam byPage) {
		return storageDao.byPageStorage(byPage);
	}

	public Long byPageStorageCount() {
		return storageDao.byPageStorageCount();
	}

	public List storageDim(StorageDimParam sdp) {
		return storageDao.storageDim(sdp);
	}
	
	
}
