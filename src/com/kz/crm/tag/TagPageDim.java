package com.kz.crm.tag;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagPageDim extends SimpleTagSupport{
	private int pageIndex;
	private int pageSize;
	private String pageUrl;
	private int pageMax;
	private int countPlan;
	private String svrCustName;
	private String svrTitle;
	private String svrType;
	private String svrCreateDate;
	private String svrEndDate;
	private String svrStatus;
	private String url;
	/*	共${countPlan }条记录 每页${pageSize }条
	第${page }页/${pageMax}共页
		<a href="${pageUrl}?pageIndex=1">第一页</a>
		<a href="${pageUrl}?pageIndex=${page-1}">上一页</a>
		<a href="${pageUrl}?pageIndex=${page+1}">下一页</a>
		<a href="${pageUrl}?pageIndex=${pageMax}">最后一页</a>
	转到<input value="1" size="2" />页
	<button width="20" onclick="reload();">GO</button>*/
	public void doTag() throws JspException, IOException {
	JspWriter out=getJspContext().getOut();
		out.println("共"+countPlan+"条记录 每页"+pageSize+"条第"+pageIndex+"页/"+pageMax+"共页");
		if(pageIndex!=1){
			out.println("<a href='"+pageUrl+"?byPage.pageIndex=1&sdp.svrCustName="+svrCustName+"&sdp.svrTitle="+svrTitle+"&sdp.svrType="+svrType+"&sdp.svrCreateDate="+svrCreateDate+"&sdp.svrEndDate="+svrEndDate+"&sdp.svrStatus="+svrStatus+"&url="+url+"'>第一页</a>");
			out.println("<a href='"+pageUrl+"?byPage.pageIndex="+(pageIndex-1)+"&sdp.svrCustName="+svrCustName+"&sdp.svrTitle="+svrTitle+"&sdp.svrType="+svrType+"&sdp.svrCreateDate="+svrCreateDate+"&sdp.svrEndDate="+svrEndDate+"&sdp.svrStatus="+svrStatus+"&url="+url+"'>上一页</a>");
		}else{
			out.println("<a href='#'>第一页</a>");
			out.println("<a href='#'>上一页</a>");
		}
		if(pageIndex!=pageMax){
			out.println("<a href='"+pageUrl+"?byPage.pageIndex="+(pageIndex+1)+"&sdp.svrCustName="+svrCustName+"&sdp.svrTitle="+svrTitle+"&sdp.svrType="+svrType+"&sdp.svrCreateDate="+svrCreateDate+"&sdp.svrEndDate="+svrEndDate+"&sdp.svrStatus="+svrStatus+"&url="+url+"'>下一页</a>");
			out.println("<a href='"+pageUrl+"?byPage.pageIndex="+pageMax+"&sdp.svrCustName="+svrCustName+"&sdp.svrTitle="+svrTitle+"&sdp.svrType="+svrType+"&sdp.svrCreateDate="+svrCreateDate+"&sdp.svrEndDate="+svrEndDate+"&sdp.svrStatus="+svrStatus+"&url="+url+"'>最后一页</a>");
		}else {
			out.println("<a href='#'>下一页</a>");
			out.println("<a href='#'>最后一页</a>");
		}
		out.println("转到<input id='pageIndex'  size='2' />页<button width='20' onmousedown='formSkip()' onclick='reload();'>GO</button>");
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public int getPageMax() {
		return pageMax;
	}
	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}
	public int getCountPlan() {
		return countPlan;
	}
	public void setCountPlan(int countPlan) {
		this.countPlan = countPlan;
	}
	public String getSvrCustName() {
		return svrCustName;
	}
	public void setSvrCustName(String svrCustName) {
		this.svrCustName = svrCustName;
	}
	public String getSvrTitle() {
		return svrTitle;
	}
	public void setSvrTitle(String svrTitle) {
		this.svrTitle = svrTitle;
	}
	public String getSvrType() {
		return svrType;
	}
	public void setSvrType(String svrType) {
		this.svrType = svrType;
	}
	
	public String getSvrCreateDate() {
		return svrCreateDate;
	}
	public void setSvrCreateDate(String svrCreateDate) {
		this.svrCreateDate = svrCreateDate;
	}
	public String getSvrEndDate() {
		return svrEndDate;
	}
	public void setSvrEndDate(String svrEndDate) {
		this.svrEndDate = svrEndDate;
	}
	public String getSvrStatus() {
		return svrStatus;
	}
	public void setSvrStatus(String svrStatus) {
		this.svrStatus = svrStatus;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	

}
