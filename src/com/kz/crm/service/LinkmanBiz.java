package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;

public interface LinkmanBiz {
	List linkmanList(CstCustomer cus);
	void linkmanAdd(CstCustomer cus,CstLinkman lin);
	void linkmanDelete(CstCustomer cus,CstLinkman lin);
	CstLinkman linkmanUpdateList(CstLinkman lin);
	void linkmanUpdate(CstLinkman lin);
}
