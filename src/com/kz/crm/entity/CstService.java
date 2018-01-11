package com.kz.crm.entity;

import java.util.Date;

/**
 * CstService entity. @author MyEclipse Persistence Tools
 */

public class CstService implements java.io.Serializable {

	// Fields

	private Long svrId;
	private String svrType;
	private String svrTitle;
	private String svrCustNo;
	private String svrCustName;
	private String svrStatus;
	private String svrRequest;
	private Integer svrCreateId;
	private String svrCreateBy;
	private Date svrCreateDate;
	private Integer svrDueId;
	private String svrDueTo;
	private Date svrDueDate;
	private String svrDeal;
	private Integer svrDealId;
	private String svrDealBy;
	private Date svrDealDate;
	private String svrResult;
	private String svrSatisfy;

	// Constructors

	/** default constructor */
	public CstService() {
	}

	@Override
	public String toString() {
		return "CstService [svrCreateBy=" + svrCreateBy + ", svrCreateDate="
				+ svrCreateDate + ", svrCreateId=" + svrCreateId
				+ ", svrCustName=" + svrCustName + ", svrCustNo=" + svrCustNo
				+ ", svrDeal=" + svrDeal + ", svrDealBy=" + svrDealBy
				+ ", svrDealDate=" + svrDealDate + ", svrDealId=" + svrDealId
				+ ", svrDueDate=" + svrDueDate + ", svrDueId=" + svrDueId
				+ ", svrDueTo=" + svrDueTo + ", svrId=" + svrId
				+ ", svrRequest=" + svrRequest + ", svrResult=" + svrResult
				+ ", svrSatisfy=" + svrSatisfy + ", svrStatus=" + svrStatus
				+ ", svrTitle=" + svrTitle + ", svrType=" + svrType + "]";
	}

	/** minimal constructor */
	public CstService(Long svrId, String svrType, String svrTitle,
			String svrCustName, String svrStatus, String svrRequest,
			Integer svrCreateId, String svrCreateBy, Date svrCreateDate) {
		this.svrId = svrId;
		this.svrType = svrType;
		this.svrTitle = svrTitle;
		this.svrCustName = svrCustName;
		this.svrStatus = svrStatus;
		this.svrRequest = svrRequest;
		this.svrCreateId = svrCreateId;
		this.svrCreateBy = svrCreateBy;
		this.svrCreateDate = svrCreateDate;
	}

	/** full constructor */
	public CstService(Long svrId, String svrType, String svrTitle,
			String svrCustNo, String svrCustName, String svrStatus,
			String svrRequest, Integer svrCreateId, String svrCreateBy,
			Date svrCreateDate, Integer svrDueId, String svrDueTo,
			Date svrDueDate, String svrDeal, Integer svrDealId,
			String svrDealBy, Date svrDealDate, String svrResult,
			String svrSatisfy) {
		this.svrId = svrId;
		this.svrType = svrType;
		this.svrTitle = svrTitle;
		this.svrCustNo = svrCustNo;
		this.svrCustName = svrCustName;
		this.svrStatus = svrStatus;
		this.svrRequest = svrRequest;
		this.svrCreateId = svrCreateId;
		this.svrCreateBy = svrCreateBy;
		this.svrCreateDate = svrCreateDate;
		this.svrDueId = svrDueId;
		this.svrDueTo = svrDueTo;
		this.svrDueDate = svrDueDate;
		this.svrDeal = svrDeal;
		this.svrDealId = svrDealId;
		this.svrDealBy = svrDealBy;
		this.svrDealDate = svrDealDate;
		this.svrResult = svrResult;
		this.svrSatisfy = svrSatisfy;
	}

	// Property accessors

	public Long getSvrId() {
		return this.svrId;
	}

	public void setSvrId(Long svrId) {
		this.svrId = svrId;
	}

	public String getSvrType() {
		return this.svrType;
	}

	public void setSvrType(String svrType) {
		this.svrType = svrType;
	}

	public String getSvrTitle() {
		return this.svrTitle;
	}

	public void setSvrTitle(String svrTitle) {
		this.svrTitle = svrTitle;
	}

	public String getSvrCustNo() {
		return this.svrCustNo;
	}

	public void setSvrCustNo(String svrCustNo) {
		this.svrCustNo = svrCustNo;
	}

	public String getSvrCustName() {
		return this.svrCustName;
	}

	public void setSvrCustName(String svrCustName) {
		this.svrCustName = svrCustName;
	}

	public String getSvrStatus() {
		return this.svrStatus;
	}

	public void setSvrStatus(String svrStatus) {
		this.svrStatus = svrStatus;
	}

	public String getSvrRequest() {
		return this.svrRequest;
	}

	public void setSvrRequest(String svrRequest) {
		this.svrRequest = svrRequest;
	}

	public Integer getSvrCreateId() {
		return this.svrCreateId;
	}

	public void setSvrCreateId(Integer svrCreateId) {
		this.svrCreateId = svrCreateId;
	}

	public String getSvrCreateBy() {
		return this.svrCreateBy;
	}

	public void setSvrCreateBy(String svrCreateBy) {
		this.svrCreateBy = svrCreateBy;
	}

	public Date getSvrCreateDate() {
		return this.svrCreateDate;
	}

	public void setSvrCreateDate(Date svrCreateDate) {
		this.svrCreateDate = svrCreateDate;
	}

	public Integer getSvrDueId() {
		return this.svrDueId;
	}

	public void setSvrDueId(Integer svrDueId) {
		this.svrDueId = svrDueId;
	}

	public String getSvrDueTo() {
		return this.svrDueTo;
	}

	public void setSvrDueTo(String svrDueTo) {
		this.svrDueTo = svrDueTo;
	}

	public Date getSvrDueDate() {
		return this.svrDueDate;
	}

	public void setSvrDueDate(Date svrDueDate) {
		this.svrDueDate = svrDueDate;
	}

	public String getSvrDeal() {
		return this.svrDeal;
	}

	public void setSvrDeal(String svrDeal) {
		this.svrDeal = svrDeal;
	}

	public Integer getSvrDealId() {
		return this.svrDealId;
	}

	public void setSvrDealId(Integer svrDealId) {
		this.svrDealId = svrDealId;
	}

	public String getSvrDealBy() {
		return this.svrDealBy;
	}

	public void setSvrDealBy(String svrDealBy) {
		this.svrDealBy = svrDealBy;
	}

	public Date getSvrDealDate() {
		return this.svrDealDate;
	}

	public void setSvrDealDate(Date svrDealDate) {
		this.svrDealDate = svrDealDate;
	}

	public String getSvrResult() {
		return this.svrResult;
	}

	public void setSvrResult(String svrResult) {
		this.svrResult = svrResult;
	}

	public String getSvrSatisfy() {
		return this.svrSatisfy;
	}

	public void setSvrSatisfy(String svrSatisfy) {
		this.svrSatisfy = svrSatisfy;
	}

}