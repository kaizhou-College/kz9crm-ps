package com.kz.crm.web.action;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.CstCustomer;
import com.kz.crm.entity.CstLinkman;
import com.kz.crm.service.LinkmanBiz;

@Controller
@Scope("prototype")
public class LinkmanAction {
	
	@Autowired
	private LinkmanBiz lingkman;
	
	private CstCustomer cus;
	private CstLinkman linkman;
	
	private List linkmanList;

	public String linkmanUpdate(){
		lingkman.linkmanUpdate(linkman);
		return "linkmanUpdate";
	}
	
	public String linkmanUpdateList(){
		linkman=lingkman.linkmanUpdateList(linkman);
		return "linkmanUpdateList";
	}
	public String linkmandelete(){
		lingkman.linkmanDelete(cus, linkman);
		return "linkmandelete";
	}
	
	public String linkmanAdd(){
		lingkman.linkmanAdd(cus, linkman);
		return "linkmanAdd";
	}
	
	public String linkmanAddTo(){
		return "linkmanAddTo";
	}
	public String lingkmanList(){
		linkmanList = lingkman.linkmanList(cus);
		
		return "lingkmanList";
	}
	public List getLinkmanList() {
		return linkmanList;
	}
	public void setLinkmanList(List linkmanList) {
		this.linkmanList = linkmanList;
	}
	public CstCustomer getCus() {
		return cus;
	}
	public void setCus(CstCustomer cus) {
		this.cus = cus;
	}
	public LinkmanBiz getLingkman() {
		return lingkman;
	}
	public void setLingkman(LinkmanBiz lingkman) {
		this.lingkman = lingkman;
	}
	public CstLinkman getLinkman() {
		return linkman;
	}
	public void setLinkman(CstLinkman linkman) {
		this.linkman = linkman;
	}
	
}
