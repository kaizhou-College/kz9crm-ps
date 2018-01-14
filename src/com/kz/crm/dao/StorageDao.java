package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.StorageDimParam;

public interface StorageDao {
	List byPageStorage(PageParam byPage);
	Long byPageStorageCount();
	List storageDim(StorageDimParam sdp);
}
