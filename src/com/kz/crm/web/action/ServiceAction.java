package com.kz.crm.web.action;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.PageParam;
import com.kz.crm.entity.CstService;
import com.kz.crm.entity.ServiceDimParam;
import com.kz.crm.service.ServiceBiz;

@Controller
@Scope("prototype")
public class ServiceAction {
	@Autowired
	private ServiceBiz serviceBiz;
	
	private CstService service;
	
	
	public PageParam byPage;
	public static final int SERVICE_PAGE_INDEX=1;
	public static final int SERVICE_PAGE_SIZE=3;
	private List serviceByPage;

	//搞错查询的数据
	private ServiceDimParam sdp;
	//高级查询是的路劲
	private String url;
	//四个高级查询的联合
	public String serviceDimList(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(SERVICE_PAGE_INDEX);
		}
		byPage.setPageUrl("service_serviceDimList");//设置分页的路径
		byPage.setPageSize(SERVICE_PAGE_SIZE);
		//求这表中所有数据的条数
		byPage.setCountPlan(serviceBiz.serviceDimListCount(sdp));
		//求一个有都是页
		byPage.setPageMax((new Long(byPage.getCountPlan()).intValue()-1)/byPage.getPageSize()+1);
		
		serviceByPage=serviceBiz.serviceDimList(sdp,byPage.getPageIndex(),byPage.getPageSize());
		System.out.println("-----------------");
		System.out.println("byPage.setCountPlan(serviceBiz.serviceDimListCount(sdp));=========="+serviceBiz.serviceDimListCount(sdp));
		System.out.println("-----------------");
		if(url.equals("serviceDimList-deal")){
			return "serviceDimList-deal";
		}else if(url.endsWith("serviceDimList-feedback")){
			return "serviceDimList-feedback";
		}else if(url.endsWith("serviceDimList-dispatch")){
			return "serviceDimList-dispatch";
		}else if(url.endsWith("serviceDimList-arch")){
			return "serviceDimList-arch";
		}
		return "ERROR";
	}
	
	
	public String serviceAddTo(){
		service=new CstService();
		long unboundedLong = new Random().nextLong();
		service.setSvrId(unboundedLong);
		return "serviceAddTo";
	}
	public String serviceAdd(){
		service.setSvrCustNo("11");
		service.setSvrCreateId(1);
		service.setSvrDueId(1);
		service.setSvrDealId(1);
		System.out.println(service);
		serviceBiz.serviceAdd(service);
		return "serviceAdd";
	}
	//服务归档的显示
	public String serviceArchlList(){
		service = serviceBiz.serviceDetailList(service);
		return "serviceArchlList";
	}
	
	//服务归档的分页
	public String serviceArchByPage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(SERVICE_PAGE_INDEX);
		}
		byPage.setPageUrl("service_serviceArchByPage");//设置分页的路径
		byPage.setPageSize(SERVICE_PAGE_SIZE);
		//求这表中所有数据的条数
		byPage.setCountPlan(serviceBiz.serviceByCountPage(byPage.getPageIndex(),byPage.getPageSize()));
		//求一个有都是页
		byPage.setPageMax((new Long(byPage.getCountPlan()).intValue()-1)/byPage.getPageSize()+1);
		
		serviceByPage = serviceBiz.serviceByPage(byPage.getPageIndex(),byPage.getPageSize());
		
		return "serviceArchByPage";
	}
	
	
	//服务反馈的修改
	public String serviceFeedbacklUpdate(){
		serviceBiz.serviceDetailUpdate(service);
		return "serviceFeedbacklUpdate";
	}
	
	//服务反馈修改的显示
	public String serviceFeedbacklList(){
		service = serviceBiz.serviceDetailList(service);
		return "serviceFeedbacklList";
	} 
	
	
	//服务反馈的分页
	public String serviceFeedbackByPage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(SERVICE_PAGE_INDEX);
		}
		byPage.setPageUrl("service_serviceFeedbackByPage");//设置分页的路径
		byPage.setPageSize(SERVICE_PAGE_SIZE);
		//求这表中所有数据的条数
		byPage.setCountPlan(serviceBiz.serviceByCountPage(byPage.getPageIndex(),byPage.getPageSize()));
		//求一个有都是页
		byPage.setPageMax((new Long(byPage.getCountPlan()).intValue()-1)/byPage.getPageSize()+1);
		
		serviceByPage = serviceBiz.serviceByPage(byPage.getPageIndex(),byPage.getPageSize());
		
		return "serviceFeedbackByPage";
	}
	
	public String  serviceDueTo(){
		serviceBiz.serviceDueToUpdate(service);
		return "serviceDueToAjax";
	}
	//服务处理的分页
	@SuppressWarnings("deprecation")
	public String serviceDisposeByPage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(SERVICE_PAGE_INDEX);
		}
		byPage.setPageUrl("service_serviceDisposeByPage");//设置分页的路径
		byPage.setPageSize(SERVICE_PAGE_SIZE);
		//求这表中所有数据的条数
		byPage.setCountPlan(serviceBiz.serviceByCountPage(byPage.getPageIndex(),byPage.getPageSize()));
		//求一个有都是页
		byPage.setPageMax((new Long(byPage.getCountPlan()).intValue()-1)/byPage.getPageSize()+1);
		
		serviceByPage = serviceBiz.serviceByPage(byPage.getPageIndex(),byPage.getPageSize());
		
		return "serviceDisposeByPage";
	}
	
	//服务处理的修改
	public String serviceDetailUpdate(){
		serviceBiz.serviceDetailUpdate(service);
		return "serviceDetailUpdate";
	}
	
	
	//服务处理的修改显示
	public String serviceDetailList(){
		service = serviceBiz.serviceDetailList(service);
		return "serviceDetailList";
	}
	
	//服务分配的分页
	public String serviceByPage(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(SERVICE_PAGE_INDEX);
		}
		byPage.setPageUrl("service_serviceByPage");//设置分页的路径
		byPage.setPageSize(SERVICE_PAGE_SIZE);
		//求这表中所有数据的条数
		byPage.setCountPlan(serviceBiz.serviceByCountPage(byPage.getPageIndex(),byPage.getPageSize()));
		//求一个有都是页
		byPage.setPageMax((new Long(byPage.getCountPlan()).intValue()-1)/byPage.getPageSize()+1);
		
		serviceByPage = serviceBiz.serviceByPage(byPage.getPageIndex(),byPage.getPageSize());
		
		return "serviceByPage";
	}
	
	//服务分配页面的删除
	public String serviceDispatchDelete(){
		serviceBiz.serviceDelet(service);
		return "serviceDispatchDelete";
	}

	public CstService getService() {
		return service;
	}

	public List getServiceByPage() {
		return serviceByPage;
	}
	public void setServiceByPage(List serviceByPage) {
		this.serviceByPage = serviceByPage;
	}
	public void setService(CstService service) {
		this.service = service;
	}
	public PageParam getByPage() {
		return byPage;
	}
	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}


	public ServiceDimParam getSdp() {
		return sdp;
	}


	public void setSdp(ServiceDimParam sdp) {
		this.sdp = sdp;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}



	
	
	
}
