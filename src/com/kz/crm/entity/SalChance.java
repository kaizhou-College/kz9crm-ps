package com.kz.crm.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SalChance entity. @author MyEclipse Persistence Tools
 */

public class SalChance implements java.io.Serializable {

	// Fields

	private Integer chcId;
	private String chcSource;

	public void setChcId(Integer chcId) {
		this.chcId = chcId;
	}

	private String chcCustName;
	private String chcTitle;
	private Integer chcRate;
	private String chcLinkman;
	private String chcTel;
	private String chcDesc;
	private Integer chcCreateId;
	private String chcCreateBy;
	private Timestamp chcCreateDate;
	private Integer chcDueId;
	private String chcDueTo;
	private Timestamp chcDueDate;
	private Integer chcStatus;
	private SalPlan plan;

	public SalChance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalChance(Integer chcId, String chcSource, String chcCustName,
			String chcTitle, Integer chcRate, String chcLinkman, String chcTel,
			String chcDesc, Integer chcCreateId, String chcCreateBy,
			Timestamp chcCreateDate, Integer chcDueId, String chcDueTo,
			Timestamp chcDueDate, Integer chcStatus, SalPlan plan) {
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

	public Integer getChcId() {
		return chcId;
	}

	public String getChcSource() {
		return chcSource;
	}

	public String getChcCustName() {
		return chcCustName;
	}

	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}

	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}

	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}

	public void setChcRate(Integer chcRate) {
		this.chcRate = chcRate;
	}

	public void setChcLinkman(String chcLinkman) {
		this.chcLinkman = chcLinkman;
	}

	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}

	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}

	public void setChcCreateId(Integer chcCreateId) {
		this.chcCreateId = chcCreateId;
	}

	public void setChcCreateBy(String chcCreateBy) {
		this.chcCreateBy = chcCreateBy;
	}

	public void setChcCreateDate(Timestamp chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}

	public void setChcDueId(Integer chcDueId) {
		this.chcDueId = chcDueId;
	}

	public void setChcDueTo(String chcDueTo) {
		this.chcDueTo = chcDueTo;
	}

	public void setChcDueDate(Timestamp chcDueDate) {
		this.chcDueDate = chcDueDate;
	}

	public void setChcStatus(Integer chcStatus) {
		this.chcStatus = chcStatus;
	}

	public void setPlan(SalPlan plan) {
		this.plan = plan;
	}

	public String getChcTitle() {
		return chcTitle;
	}

	public Integer getChcRate() {
		return chcRate;
	}

	public String getChcLinkman() {
		return chcLinkman;
	}

	public String getChcTel() {
		return chcTel;
	}

	public String getChcDesc() {
		return chcDesc;
	}

	public Integer getChcCreateId() {
		return chcCreateId;
	}

	public String getChcCreateBy() {
		return chcCreateBy;
	}

	public Timestamp getChcCreateDate() {
		return chcCreateDate;
	}

	public Integer getChcDueId() {
		return chcDueId;
	}

	public String getChcDueTo() {
		return chcDueTo;
	}

	public Timestamp getChcDueDate() {
		return chcDueDate;
	}

	public Integer getChcStatus() {
		return chcStatus;
	}

	public SalPlan getPlan() {
		return plan;
	}

	public String toString() {
		return "SalChance [chcCreateBy=" + chcCreateBy + ", chcCreateDate="
				+ chcCreateDate + ", chcCreateId=" + chcCreateId
				+ ", chcCustName=" + chcCustName + ", chcDesc=" + chcDesc
				+ ", chcDueDate=" + chcDueDate + ", chcDueId=" + chcDueId
				+ ", chcDueTo=" + chcDueTo + ", chcLinkman=" + chcLinkman
				+ ", chcRate=" + chcRate + ", chcSource=" + chcSource
				+ ", chcStatus=" + chcStatus + ", chcTel=" + chcTel
				+ ", chcTitle=" + chcTitle + "]";
	}

}