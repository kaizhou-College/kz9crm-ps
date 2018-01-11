package com.s.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.s.entity.CstCustomer;
import com.s.entity.CstLost;
import com.s.service.CstLostBiz;

@Controller
@Scope("prototype")
public class CstLostAction {
	private CstCustomer customer;
	private CstLost cstLost;
	private List list;
	private Long countAll;// һ������������
	private int max;// ���ҳ��
	private int page;// ��ǰҳ��
	private int pageIndex;// ���ݴ�������ҳ����ѯ����
	private int pageSize;// ÿҳ��������
	private String url = "cstlost_fenyequery";// ��ҳ��ѯ·��

	/* �����޸� */
	private int lstId;
	@Autowired
	private CstLostBiz cstlb;

	// ��ҳ��ѯ
	public String fenyequery() {
//		System.out.println(pageIndex + "====��ǰҳ");
		page = 1;
		if (pageIndex > 1) {
//			System.out.println("������");
			page = pageIndex;
		}
		pageSize = 1;
		list = cstlb.currentPage(page, pageSize);

//		System.out.println(list + "=====����");
		countAll = cstlb.countPage();

		max = (countAll.intValue() - 1) / pageSize + 1;
//		System.out.println(countAll + "====�ܹ�����������");

		return "fenye";
	}

	// ����ID��ѯҪ�޸ĵ�����
	public String updateid() {
//		System.out.println("�����ѯ�޸�" + lstId);
		cstLost = cstlb.queryId(lstId);
//		System.out.println("action���ֵ===" + cstLost);
		return "updateid";
	}
//�޸�
	public String update(){
//		System.out.println("�����޸Ĳ���id=="+lstId+"����====="+cstLost.getLstReason());
		cstlb.updateId(CstLost.class,lstId,cstLost.getLstReason());
		return "update_success";
	}
	public CstCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(CstCustomer customer) {
		this.customer = customer;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getCountAll() {
		return countAll;
	}

	public void setCountAll(Long countAll) {
		this.countAll = countAll;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CstLostBiz getCstlb() {
		return cstlb;
	}

	public void setCstlb(CstLostBiz cstlb) {
		this.cstlb = cstlb;
	}

	public int getLstId() {
		return lstId;
	}

	public void setLstId(int lstId) {
		this.lstId = lstId;
	}

	public CstLost getCstLost() {
		return cstLost;
	}

	public void setCstLost(CstLost cstLost) {
		this.cstLost = cstLost;
	}

}
