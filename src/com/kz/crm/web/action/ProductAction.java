package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.ProductDimParam;
import com.kz.crm.service.ProductBiz;

@Controller
@Scope("prototype")
public class ProductAction {
	@Autowired
	private ProductBiz productBiz;
	
	private PageParam byPage;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=3;
	private List productByPage;
	
	
	private  ProductDimParam pdp;
	
	public String productDimList(){
		productByPage=productBiz.productDimList(pdp);
		return "productDimList";
	}
	
	
	public String productByPage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(PAGE_CUSTOMER_INDEX);
		}
		//设置每页显示的数据
		byPage.setPageSize(PAGE_CUSTOMER_SIZE);
		//设置上下页跳的路径
		byPage.setPageUrl("product_productByPage");
		//设置一共有多少条数据
		byPage.setCountPlan(productBiz.productCount());
		//设置一共有多少页
		int max=new Long(byPage.getCountPlan()).intValue();//long转int 
		byPage.setPageMax(((max-1)/byPage.getPageSize())+1);//算出一共有多少页
		productByPage = productBiz.productByPage(byPage);
		return "productByPage";
	}
	public PageParam getByPage() {
		return byPage;
	}
	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}
	public List getProductByPage() {
		return productByPage;
	}
	public void setProductByPage(List productByPage) {
		this.productByPage = productByPage;
	}


	public ProductDimParam getPdp() {
		return pdp;
	}


	public void setPdp(ProductDimParam pdp) {
		this.pdp = pdp;
	}
}