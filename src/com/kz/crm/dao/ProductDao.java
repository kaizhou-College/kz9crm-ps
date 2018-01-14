package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.ProductDimParam;

public interface ProductDao {
	List productByPage(PageParam byPage);
	Long productCount();
	List productDimList(ProductDimParam pdp);
}
