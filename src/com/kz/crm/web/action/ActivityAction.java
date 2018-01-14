package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstActivity;
import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.service.ActivityBiz;


@Controller
@Scope("prototype")
public class ActivityAction {
	@Autowired
	private ActivityBiz activityBiz;
		
	private CstCustomer cus;
	private CstActivity activity;
	private List<CstActivity> activityList;
	
	
	
	
	public String activityDelete(){
		activityBiz.activityDelete(cus, activity);
		
		return "activityDelete";
	}
	
	public String activityUpdate(){
		activityBiz.activityUpdate(activity);
		return "activityUpdate";
	}
	
	public String activityUpdateList(){
		activity = activityBiz.activityUpdateList(activity);
		return "activityUpdateList";
	}
	
	public String activityAdd(){
		activityBiz.activityAdd(cus, activity);
		return "activityAdd";
	}
	
	public String activityList(){
		activityList = activityBiz.activityList(cus);
		return "activityList";
	}
	public String activityAddTo(){
		
		return "activityAddTo";
	}



	public CstCustomer getCus() {
		return cus;
	}


	public void setCus(CstCustomer cus) {
		this.cus = cus;
	}


	public List<CstActivity> getActivityList() {
		return activityList;
	}


	public void setActivityList(List<CstActivity> activityList) {
		this.activityList = activityList;
	}
	public CstActivity getActivity() {
		return activity;
	}
	public void setActivity(CstActivity activity) {
		this.activity = activity;
	}
	
	
	
}
