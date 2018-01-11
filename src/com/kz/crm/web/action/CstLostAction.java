package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLost;
import com.kz.crm.service.CstLostBiz;

@Controller
@Scope("prototype")
public class CstLostAction {
	private CstCustomer customer;
	private CstLost cstLost;
	private List list;
	private Long countAll;//总数据
	private int max;// 最大页
	private int page;// 当前页数
	private int pageIndex;//要选择的查询的页数
	private int pageSize;//每页多少条数
	private String url = "cstlost_fenyequery";//分页查询路径

	/* 修改 */
	private int lstId;
	@Autowired
	private CstLostBiz cstlb;

	//分页查询
	public String fenyequery() {
		page = 1;
		if (pageIndex > 1) {
			page = pageIndex;
		}
		pageSize = 1;
		list = cstlb.currentPage(page, pageSize);

		countAll = cstlb.countPage();

		max = (countAll.intValue() - 1) / pageSize + 1;
//		System.out.println(countAll + "====总数据");

		return "fenye";
	}

	// 根据ID查要修改的数据
	public String updateid() {
//		System.out.println("进入修改查询" + lstId);
		cstLost = cstlb.queryId(lstId);
//		System.out.println("action���ֵ===" + cstLost);
		return "updateid";
	}
//修改
	public String update(){
//		System.out.println("要修改的id=="+lstId+"描述====="+cstLost.getLstReason());
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
