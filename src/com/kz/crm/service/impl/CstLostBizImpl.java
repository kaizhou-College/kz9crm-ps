package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.CstLostDao;
import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostBiz;

@Service
public class CstLostBizImpl implements CstLostBiz {
	@Autowired
	private CstLostDao lostDao;

	// ��ҳ��ѯ
	public List currentPage(int page, int pageSize) {

		return lostDao.currentPage(page, pageSize);
	}

	// �����ҳ��
	public Long countPage() {

		return lostDao.countPage();
	}

	// ���ID�����
	public CstLost queryId(int lstId) {

		return lostDao.queryId(lstId);
	}
	//���
	public void add(Object object) {
		lostDao.add(object);
	}
//�޸�
	public void updateId(Class<CstLost> class1,int lstId,String lstReason) {
		lostDao.update(class1,lstId,lstReason);
	}
	//定时器
	public void timesWork(){
		System.out.println("定时器");
		List<CstLost> list = lostDao.quartzquery();
		System.out.println("bizimpl----------"+list.size());
		for (int i = 0; i < list.size(); i++) {
			CstLost cstLost = new CstLost();
			cstLost.setLstCustName(list.get(i).getLstCustName());
			cstLost.setLstCustManagerName(list.get(i).getLstCustManagerName());
			cstLost.setLstCustManagerId(list.get(i).getLstCustManagerId());
			cstLost.setLstLastOrderDate(list.get(i).getLstLastOrderDate());
			cstLost.setLstStatus(list.get(i).getLstStatus());
			cstLost.setLstCustNo(list.get(i).getLstCustNo());
			cstLost.setLstDelay("暂无");
			cstLost.setLstReason("暂未查明");
			System.out.println("impl====="+cstLost);
			add(cstLost);
		}
	}



}
