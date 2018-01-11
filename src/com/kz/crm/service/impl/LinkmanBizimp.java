package com.kz.crm.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.LinkmanDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.service.LinkmanBiz;
@Service
public class LinkmanBizimp implements LinkmanBiz{
	@Autowired
	private LinkmanDao linkmanDao;
	
	public List linkmanList(CstCustomer cus) {
		List linkmanList = linkmanDao.linkmanList(cus);
		return linkmanList;
	}

	public void linkmanAdd(CstCustomer cus, CstLinkman lin) {
		long unboundedLong = new Random().nextLong();
		System.out.println(unboundedLong);
		lin.setLkmId(unboundedLong);
		linkmanDao.linkmanAdd(cus,lin);
	}

	public void linkmanDelete(CstCustomer cus, CstLinkman lin) {
		linkmanDao.linkmanDelete(cus, lin);
	}

	public CstLinkman linkmanUpdateList(CstLinkman lin) {
		CstLinkman linkmanUpdateList = linkmanDao.linkmanUpdateList(lin);
		return linkmanUpdateList;
	}

	public void linkmanUpdate(CstLinkman lin) {
		linkmanDao.linkmanUpdate(lin);
	}
	
}
