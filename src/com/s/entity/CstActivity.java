package com.s.entity;

import java.util.Date;

/**
 * CstActivity entity. @author MyEclipse Persistence Tools
 */

public class CstActivity implements java.io.Serializable {

	// Fields

	private Integer atvId;
//	private String atvCustNo;
	private String atvCustName;
	private Date atvDate;
	private String atvPlace;
	private String atvTitle;
	private String atvDesc;
	private CstCustomer cstCustomer;

	// Constructors

	/** default constructor */
	public CstActivity() {
	}

	/** minimal constructor */
	public CstActivity(Integer atvId, String atvCustNo, Date atvDate,
			String atvPlace, String atvTitle) {
		this.atvId = atvId;
//		this.atvCustNo = atvCustNo;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
	}

	/** full constructor */
	public CstActivity(Integer atvId, String atvCustNo, String atvCustName,
			Date atvDate, String atvPlace, String atvTitle, String atvDesc) {
		this.atvId = atvId;
//		this.atvCustNo = atvCustNo;
		this.atvCustName = atvCustName;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
		this.atvDesc = atvDesc;
	}

	// Property accessors

	public Integer getAtvId() {
		return this.atvId;
	}

	public void setAtvId(Integer atvId) {
		this.atvId = atvId;
	}

/*	public String getAtvCustNo() {
		return this.atvCustNo;
	}

	public void setAtvCustNo(String atvCustNo) {
		this.atvCustNo = atvCustNo;
	}*/

	public String getAtvCustName() {
		return this.atvCustName;
	}

	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}

	public Date getAtvDate() {
		return this.atvDate;
	}

	public void setAtvDate(Date atvDate) {
		this.atvDate = atvDate;
	}

	public String getAtvPlace() {
		return this.atvPlace;
	}

	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}

	public String getAtvTitle() {
		return this.atvTitle;
	}

	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}

	public String getAtvDesc() {
		return this.atvDesc;
	}

	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}

	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	@Override
	public String toString() {
		return "CstActivity [atvCustName=" + atvCustName + ", atvDate=" + atvDate + ", atvDesc=" + atvDesc
				+ ", atvId=" + atvId + ", atvPlace=" + atvPlace + ", atvTitle="
				+ atvTitle + "]";
	}
	
	
	

}