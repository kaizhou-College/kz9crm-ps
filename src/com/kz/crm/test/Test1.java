package com.kz.crm.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kz.crm.dao.CstLostDao;
import com.kz.crm.entity.CstLost;
import com.kz.crm.service.impl.CstLostBizImpl;

public class Test1 {
	@Autowired
	CstLostDao cldi;
	@Autowired
	CstLostBizImpl cls;
	public void timesQuarts(){
		List<CstLost> list = cldi.quartzquery();
		for(int i =0;i<list.size();i++){
			CstLost cl = new CstLost();
			cl.setLstCustManagerId(list.get(i).getLstCustManagerId());
			cl.setLstCustManagerName(list.get(i).getLstCustManagerName());
			cl.setLstCustName(list.get(i).getLstCustName());
			cl.setLstStatus(list.get(i).getLstStatus());
			cl.setLstDelay("ÔÝÎÞ");
			cl.setLstLastOrderDate(list.get(i).getLstLastOrderDate());
			cl.setLstCustNo(list.get(i).getLstCustNo());
			cls.add(cl);
		}
	}

}
