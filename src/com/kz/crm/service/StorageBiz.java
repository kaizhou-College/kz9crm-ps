package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.StorageDimParam;

public interface StorageBiz {
	List byPageStorage(PageParam byPage);
	Long byPageStorageCount();
	List storageDim(StorageDimParam sdp);
}
