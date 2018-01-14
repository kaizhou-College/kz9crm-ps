package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.StorageDimParam;
import com.kz.crm.service.StorageBiz;

@Controller
@Scope("prototype")
public class StorageAction {
	@Autowired
	private StorageBiz storageBiz;
	
	//分页时的数据
	private PageParam byPage;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=3;
	private List<String[]> byPageStorage;
	
	//高级查询
	private StorageDimParam sdp;
	
	public String storageDim(){
		byPageStorage=storageBiz.storageDim(sdp);
		return "storageDim";
	} 
	
	public String byPageTorage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(PAGE_CUSTOMER_INDEX);
		}
		//设置每页显示的数据
		byPage.setPageSize(PAGE_CUSTOMER_SIZE);
		//设置上下页跳的路径
		byPage.setPageUrl("storage_byPageTorage");
		//设置一共有多少条数据
		byPage.setCountPlan(storageBiz.byPageStorageCount());
		//设置一共有多少页
		int max=new Long(byPage.getCountPlan()).intValue();//long转int 
		byPage.setPageMax(((max-1)/byPage.getPageSize())+1);//算出一共有多少页
		byPageStorage = storageBiz.byPageStorage(byPage);
		return "byPageTorage";
	}

	public PageParam getByPage() {
		return byPage;
	}

	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}

	public List<String[]> getByPageStorage() {
		return byPageStorage;
	}

	public void setByPageStorage(List<String[]> byPageStorage) {
		this.byPageStorage = byPageStorage;
	}

	public StorageDimParam getSdp() {
		return sdp;
	}

	public void setSdp(StorageDimParam sdp) {
		this.sdp = sdp;
	}

	

	
	
	
	
	
	
	
	
}