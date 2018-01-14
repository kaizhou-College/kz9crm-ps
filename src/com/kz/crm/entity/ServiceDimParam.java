package com.kz.crm.entity;

import java.sql.Date;

public class ServiceDimParam {
	private String svrCustName;
	private String svrTitle;
	private String svrType;
	private String svrCreateDate;
	private String svrEndDate;
	private String svrStatus;
	

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





	public ServiceDimParam() {
		super();
		// TODO Auto-generated constructor stub
	}





	public ServiceDimParam(String svrCustName, String svrTitle, String svrType,
			String svrCreateDate, String svrEndDate, String svrStatus) {
		super();
		this.svrCustName = svrCustName;
		this.svrTitle = svrTitle;
		this.svrType = svrType;
		this.svrCreateDate = svrCreateDate;
		this.svrEndDate = svrEndDate;
		this.svrStatus = svrStatus;
	}





	@Override
	public String toString() {
		return "ServiceDimParam [svrCreateDate=" + svrCreateDate
				+ ", svrCustName=" + svrCustName + ", svrEndDate=" + svrEndDate
				+ ", svrStatus=" + svrStatus + ", svrTitle=" + svrTitle
				+ ", svrType=" + svrType + "]";
	}
	
	
}
