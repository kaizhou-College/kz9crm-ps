package com.s.entity;

import java.util.Date;

/**
 * CstLost entity. @author MyEclipse Persistence Tools
 */

public class CstLost implements java.io.Serializable {

	// Fields

	private Integer lstId;
	 private String lstCustNo;
	private String lstCustName;
	private Integer lstCustManagerId;
	private String lstCustManagerName;
	private Date lstLastOrderDate;
	private Date lstLostDate;
	private String lstDelay;
	private String lstReason;
	private Integer lstStatus;
	private CstCustomer cstcustomer;

	// Constructors

	/** default constructor */
	public CstLost() {
	}

	/** minimal constructor */
	public CstLost(Integer lstId, String lstCustNo, Integer lstCustManagerId,
			String lstCustManagerName, String lstDelay, Integer lstStatus) {
		this.lstId = lstId;
		 this.lstCustNo = lstCustNo;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstDelay = lstDelay;
		this.lstStatus = lstStatus;
	}

	/** full constructor */
	public CstLost(Integer lstId, String lstCustNo, String lstCustName,
			Integer lstCustManagerId, String lstCustManagerName,
			Date lstLastOrderDate, Date lstLostDate, String lstDelay,
			String lstReason, Integer lstStatus) {
		this.lstId = lstId;
		 this.lstCustNo = lstCustNo;
		this.lstCustName = lstCustName;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstLastOrderDate = lstLastOrderDate;
		this.lstLostDate = lstLostDate;
		this.lstDelay = lstDelay;
		this.lstReason = lstReason;
		this.lstStatus = lstStatus;
	}

	// Property accessors

	public Integer getLstId() {
		return this.lstId;
	}

	public void setLstId(Integer lstId) {
		this.lstId = lstId;
	}

	
	public String getLstCustNo() { return this.lstCustNo; }
	 
	public void setLstCustNo(String lstCustNo) { this.lstCustNo = lstCustNo;
	}
	 
	public String getLstCustName() {
		return this.lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public Integer getLstCustManagerId() {
		return this.lstCustManagerId;
	}

	public void setLstCustManagerId(Integer lstCustManagerId) {
		this.lstCustManagerId = lstCustManagerId;
	}

	public String getLstCustManagerName() {
		return this.lstCustManagerName;
	}

	public void setLstCustManagerName(String lstCustManagerName) {
		this.lstCustManagerName = lstCustManagerName;
	}

	public Date getLstLastOrderDate() {
		return this.lstLastOrderDate;
	}

	public void setLstLastOrderDate(Date lstLastOrderDate) {
		this.lstLastOrderDate = lstLastOrderDate;
	}

	public Date getLstLostDate() {
		return this.lstLostDate;
	}

	public void setLstLostDate(Date lstLostDate) {
		this.lstLostDate = lstLostDate;
	}

	public String getLstDelay() {
		return this.lstDelay;
	}

	public void setLstDelay(String lstDelay) {
		this.lstDelay = lstDelay;
	}

	public String getLstReason() {
		return this.lstReason;
	}

	public void setLstReason(String lstReason) {
		this.lstReason = lstReason;
	}

	public Integer getLstStatus() {
		return this.lstStatus;
	}

	public void setLstStatus(Integer lstStatus) {
		this.lstStatus = lstStatus;
	}

	public CstCustomer getCstcustomer() {
		return cstcustomer;
	}

	public void setCstcustomer(CstCustomer cstcustomer) {
		this.cstcustomer = cstcustomer;
	}

	@Override
	public String toString() {
		return "CstLost [lstCustManagerId=" + lstCustManagerId
				+ ", lstCustManagerName=" + lstCustManagerName+ ", lstCustNo=" + lstCustNo
				+ ", lstCustName=" + lstCustName + ", lstDelay=" + lstDelay
				+ ", lstId=" + lstId + ", lstLastOrderDate=" + lstLastOrderDate
				+ ", lstLostDate=" + lstLostDate + ", lstReason=" + lstReason
				+ ", lstStatus=" + lstStatus + "]";
	}

}