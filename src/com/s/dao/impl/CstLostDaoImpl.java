package com.s.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.s.dao.CstLostDao;
import com.s.entity.CstCustomer;
import com.s.entity.CstLost;
import com.s.entity.Orders;

public class CstLostDaoImpl extends HibernateDaoSupport implements CstLostDao {
	// 分页查询
	public List currentPage(int page, int pageSize) {
		int max = (page - 1) * pageSize;
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(CstLost.class);
		criteria.setFirstResult(max);
		criteria.setMaxResults(pageSize);
		List list = criteria.list();
		return list;
	}

	// 总数据
	public Long countPage() {
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(CstLost.class);
		criteria.setProjection(Projections.count("lstId"));
		List<Long> list = criteria.list();
		return list.get(0);
	}

	// 根据ID查询
	public CstLost queryId(int lstId) {
		Session session = this.getSession();
		CstLost cstLost = (CstLost) session.get(CstLost.class, lstId);
		System.out.println("dao方法的======" + cstLost);
		return cstLost;
	}
//修改
	public void update(Class<CstLost> class1,int lstId,String lstReason) {
		Session session = this.getSession();
		CstLost cstLost = (CstLost) session.get(class1, lstId);
		cstLost.setLstReason(lstReason);
	}
	//添加
	public void add(Object cstLost) {
		Session session = this.getSession();
		System.out.println("进入定时器的添加"+cstLost);
		session.save(cstLost);
	}
	//定时器
	public List quartzquery(){
		Session session = this.getSession();
		//1,查询订单表，订单日期超过6个月的客户的名字
		//select * from orders where months_between(sysdate,odr_date)>6
		String hql = "from Orders where months_between(sysdate,odrDate)>6";
		Query query = session.createQuery(hql);
		List<Orders> list1 = query.list();
		//2,根据客户的名字查询客户表得到客户所有信息
		//3,将该客户信息添加到cst_lost表中
		String hql1="from CstCustomer where custName=?";
		List<CstCustomer> list2 = new ArrayList<CstCustomer>();
		List<CstLost> list = new ArrayList<CstLost>();
		for (int i = 0; i < list1.size(); i++) {
			CstLost cstLost = new CstLost();
			System.out.println(list1+"==="+list.size());
			list2 = session.createQuery(hql1).setParameter(0,list1.get(i).getOdrCustomer()).list();
			cstLost.setLstCustName(list2.get(i).getCustName());
			cstLost.setLstCustManagerName(list2.get(i).getCustManagerName());
			cstLost.setLstLastOrderDate(list1.get(i).getOdrDate());
			cstLost.setLstStatus(list2.get(i).getCustStatus());
			cstLost.setLstCustNo(list2.get(i).getCustNo());
			cstLost.setLstCustManagerId(list2.get(i).getCustManagerId());
			cstLost.setLstDelay("暂无");
			cstLost.setLstReason("暂未查明");
			list.add(cstLost);
		}
		System.out.println("外面"+list.size());
		return list;
	}


}
