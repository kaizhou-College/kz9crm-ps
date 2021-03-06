package com.kz.crm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SalChance entity. @author MyEclipse Persistence Tools
 */

public class SalChance implements java.io.Serializable {

	// Fields

	private Long chcId;
	private String chcSource;
	private String chcCustName;
	private String chcTitle;
	private Integer chcRate;
	private String chcLinkman;
	private String chcTel;
	private String chcDesc;
	private Integer chcCreateId;
	private String chcCreateBy;
	private Date chcCreateDate;
	private Integer chcDueId;
	private String chcDueTo;
	private Date chcDueDate;
	private Integer chcStatus;
	
	private Set<SalPlan> salPlan=new HashSet<SalPlan>();
	
	// Constructors

	/** default constructor */
	public SalChance() {
	}

	public Set<SalPlan> getSalPlan() {
		return salPlan;
	}

	public void setSalPlan(Set<SalPlan> salPlan) {
		this.salPlan = salPlan;
	}

	/** minimal constructor */
	

	/** full constructor */
	

	// Property accessors



	public SalChance(Long chcId, String chcSource, String chcCustName,
			String chcTitle, Integer chcRate, String chcLinkman, String chcTel,
			String chcDesc, Integer chcCreateId, String chcCreateBy,
			Date chcCreateDate, Integer chcDueId, String chcDueTo,
			Date chcDueDate, Integer chcStatus) {
		super();
		this.chcId = chcId;
		this.chcSource = chcSource;
		this.chcCustName = chcCustName;
		this.chcTitle = chcTitle;
		this.chcRate = chcRate;
		this.chcLinkman = chcLinkman;
		this.chcTel = chcTel;
		this.chcDesc = chcDesc;
		this.chcCreateId = chcCreateId;
		this.chcCreateBy = chcCreateBy;
		this.chcCreateDate = chcCreateDate;
		this.chcDueId = chcDueId;
		this.chcDueTo = chcDueTo;
		this.chcDueDate = chcDueDate;
		this.chcStatus = chcStatus;
	}

	
	@Override
	public String toString() {
		return "SalChance [chcCreateBy=" + chcCreateBy + ", chcCreateDate="
				+ chcCreateDate + ", chcCreateId=" + chcCreateId
				+ ", chcCustName=" + chcCustName + ", chcDesc=" + chcDesc
				+ ", chcDueDate=" + chcDueDate + ", chcDueId=" + chcDueId
				+ ", chcDueTo=" + chcDueTo + ", chcId=" + chcId
				+ ", chcLinkman=" + chcLinkman + ", chcRate=" + chcRate
				+ ", chcSource=" + chcSource + ", chcStatus=" + chcStatus
				+ ", chcTel=" + chcTel + ", chcTitle=" + chcTitle + "]";
	}

	public Long getChcId() {
		return chcId;
	}

	public void setChcId(Long chcId) {
		this.chcId = chcId;
	}

	public String getChcSource() {
		return this.chcSource;
	}

	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}

	public String getChcCustName() {
		return this.chcCustName;
	}

	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}

	public String getChcTitle() {
		return this.chcTitle;
	}

	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}

	public Integer getChcRate() {
		return this.chcRate;
	}

	public void setChcRate(Integer chcRate) {
		this.chcRate = chcRate;
	}

	public String getChcLinkman() {
		return this.chcLinkman;
	}

	public void setChcLinkman(String chcLinkman) {
		this.chcLinkman = chcLinkman;
	}

	public String getChcTel() {
		return this.chcTel;
	}

	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}

	public String getChcDesc() {
		return this.chcDesc;
	}

	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}

	public Integer getChcCreateId() {
		return this.chcCreateId;
	}

	public void setChcCreateId(Integer chcCreateId) {
		this.chcCreateId = chcCreateId;
	}

	public String getChcCreateBy() {
		return this.chcCreateBy;
	}

	public void setChcCreateBy(String chcCreateBy) {
		this.chcCreateBy = chcCreateBy;
	}

	public Date getChcCreateDate() {
		return this.chcCreateDate;
	}

	public void setChcCreateDate(Date chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}

	public Integer getChcDueId() {
		return this.chcDueId;
	}

	public void setChcDueId(Integer chcDueId) {
		this.chcDueId = chcDueId;
	}

	public String getChcDueTo() {
		return this.chcDueTo;
	}

	public void setChcDueTo(String chcDueTo) {
		this.chcDueTo = chcDueTo;
	}

	public Date getChcDueDate() {
		return this.chcDueDate;
	}

	public void setChcDueDate(Date chcDueDate) {
		this.chcDueDate = chcDueDate;
	}

	public Integer getChcStatus() {
		return this.chcStatus;
	}

	public void setChcStatus(Integer chcStatus) {
		this.chcStatus = chcStatus;
	}

}