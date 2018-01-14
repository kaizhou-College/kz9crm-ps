package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.ProductDimParam;

public interface ProductBiz  {
	List productByPage(PageParam byPage);
	Long productCount();
	List productDimList(ProductDimParam pdp);
}
