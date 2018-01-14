package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.ProductDao;
import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.ProductDimParam;
import com.kz.crm.service.ProductBiz;
@Service
public class ProductBizImpl implements ProductBiz {
	@Autowired
	private ProductDao productDao;
	public List productByPage(PageParam byPage) {
		return productDao.productByPage(byPage);
	}
	public Long productCount() {
		return productDao.productCount();
	}
	public List productDimList(ProductDimParam pdp) {
		return productDao.productDimList(pdp);
	}
}
