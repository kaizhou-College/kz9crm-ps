package com.kz.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javassist.CtConstructor;

import javax.sound.sampled.LineListener;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kz.crm.dao.LinkmanDao;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;

public class LinkmanDaoImpl extends HibernateDaoSupport implements LinkmanDao{

	public List linkmanList(CstCustomer cus) {
		Session session = this.getSession();
		CstCustomer cut =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		Set<CstLinkman> linKman = cut.getLinKman();
		List list=new ArrayList();
		list.addAll(linKman);
		return list;
	}

	public void linkmanAdd(CstCustomer cus,CstLinkman lin) {
		Session session = this.getSession();
		CstCustomer  cut =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		Set<CstLinkman> linKman = cut.getLinKman();
		linKman.add(lin);
		lin.setCustomer(cut);
		
	}

	public void linkmanDelete(CstCustomer cus, CstLinkman lin) {
		Session session = this.getSession();
		CstCustomer cut =(CstCustomer) session.get(CstCustomer.class,cus.getCustNo());
		Set<CstLinkman> linKman = cut.getLinKman();
		
		cut.setLinKman(null);
		for(CstLinkman s:linKman){
			if(s.getLkmId().equals(lin.getLkmId())){
				session.evict(cut);
				session.delete(s);
			}
		}
	}

	public CstLinkman linkmanUpdateList(CstLinkman lin) {
		Session session = this.getSession();
		CstLinkman linkman =(CstLinkman) session.get(CstLinkman.class,lin.getLkmId());
		return linkman;
	}

	public void linkmanUpdate(CstLinkman lin) {
		Session session = this.getSession();
		CstLinkman linkamn =(CstLinkman) session.get(CstLinkman.class,lin.getLkmId());
		linkamn.setLkmMemo(lin.getLkmMemo());
		linkamn.setLkmMobile(lin.getLkmMobile());
		linkamn.setLkmName(lin.getLkmName());
		linkamn.setLkmPostion(lin.getLkmPostion());
		linkamn.setLkmSex(lin.getLkmSex());
		linkamn.setLkmTel(lin.getLkmTel());
		
		
	}

}
