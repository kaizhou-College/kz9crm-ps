package com.kz.crm.entity;

import java.util.Date;

/**
 * CstLost entity. @author MyEclipse Persistence Tools
 */

public class CstLost implements java.io.Serializable {

	// Fields

	private Long lstId;
	private String lstCustNo;
	private String lstCustName;
	private Long lstCustManagerId;
	private String lstCustManagerName;
	private Date lstLastOrderDate;
	private Date lstLostDate;
	private String lstDelay;
	private String lstReason;
	private Long lstStatus;

	// Constructors

	/** default constructor */
	public CstLost() {
	}

	/** minimal constructor */
	public CstLost(Long lstId, String lstCustNo, Long lstCustManagerId,
			String lstCustManagerName, String lstDelay, Long lstStatus) {
		this.lstId = lstId;
		this.lstCustNo = lstCustNo;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstDelay = lstDelay;
		this.lstStatus = lstStatus;
	}

	/** full constructor */
	public CstLost(Long lstId, String lstCustNo, String lstCustName,
			Long lstCustManagerId, String lstCustManagerName,
			Date lstLastOrderDate, Date lstLostDate, String lstDelay,
			String lstReason, Long lstStatus) {
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

	public Long getLstId() {
		return this.lstId;
	}

	public void setLstId(Long lstId) {
		this.lstId = lstId;
	}

	public String getLstCustNo() {
		return this.lstCustNo;
	}

	public void setLstCustNo(String lstCustNo) {
		this.lstCustNo = lstCustNo;
	}

	public String getLstCustName() {
		return this.lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public Long getLstCustManagerId() {
		return this.lstCustManagerId;
	}

	public void setLstCustManagerId(Long lstCustManagerId) {
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

	public Long getLstStatus() {
		return this.lstStatus;
	}

	public void setLstStatus(Long lstStatus) {
		this.lstStatus = lstStatus;
	}

}