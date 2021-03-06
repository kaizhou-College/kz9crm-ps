package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CustomerDimPaeam;
import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.service.CustomerBiz;

@Controller
@Scope("prototype")
public class CstCustomerAction {
	
	
	@Autowired
	private CustomerBiz coustomerBiz;
	
	//分页 上下跳  时会使用的数据
	private   PageParam byPage;

	//分页的初始数据   当前页面与每也显示的条数
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=3;
	//分頁跳過去的list
	private List byPageCustomerDao;
	
	private CstCustomer cus;
	
	
	//高级查询时的数据
	private CustomerDimPaeam cdp;


	//高级程序、
	public String customerDimList(){
		System.out.println("进入高级查询");
		System.out.println(cdp);
		byPageCustomerDao=coustomerBiz.cutomerDimList(cdp);
		return "customerDimList";
	}
	
	//编辑
	public String customerUpdate(){
		System.out.println(cus);
		coustomerBiz.customerUpdate(cus);
		return "customerUpdate";
	}
	
	//编辑时的显示
	public String customerUpdateList(){
		System.out.println(cus);
		cus = coustomerBiz.listSingle(cus);
		return "customerUpdateList";
	} 
	
	
	//刪除  
	public String customerDelete(){
		System.out.println(cus.getCustNo());
		coustomerBiz.customerDelete(cus);
		return "customerDelete";
	}
	
	
	//分頁
	public String customerList(){
		//如果byPage没有初始化就给它设置一个当前页面
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(1);
		}
		//设置每页显示的数据
		byPage.setPageSize(PAGE_CUSTOMER_SIZE);
		//设置上下页跳的路径
		byPage.setPageUrl("customer_customerList");
		//设置一共有多少条数据
		byPage.setCountPlan(coustomerBiz.countCustomer());
		
		//设置一共有多少页
		int max=new Long(byPage.getCountPlan()).intValue();//long转int 
		byPage.setPageMax(((max-1)/byPage.getPageSize())+1);//算出一共有多少页
		
		
		byPageCustomerDao = coustomerBiz.byPageCustomerDao(byPage.getPageIndex(), byPage.getPageSize());
		return "customerList";
	}


	public PageParam getByPage() {
		return byPage;
	}

	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}


	public List getByPageCustomerDao() {
		return byPageCustomerDao;
	}


	public void setByPageCustomerDao(List byPageCustomerDao) {
		this.byPageCustomerDao = byPageCustomerDao;
	}


	public CstCustomer getCus() {
		return cus;
	}


	public void setCus(CstCustomer cus) {
		this.cus = cus;
	}

	public CustomerDimPaeam getCdp() {
		return cdp;
	}

	public void setCdp(CustomerDimPaeam cdp) {
		this.cdp = cdp;
	}

	
	
}
