package com.kz.crm.entity;

import java.util.Date;

/**
 * SalPlan entity. @author MyEclipse Persistence Tools
 */

public class SalPlan implements java.io.Serializable {

	// Fields

	private Long plaId;
//	private Integer plaChcId;
	private Date plaDate;
	private String plaTodo;
	private String plaResult;
	
	
	private SalChance salChance;
	
	
	// Constructors

	public SalChance getSalChance() {
		return salChance;
	}

	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}

	/** default constructor */
	public SalPlan() {
	}

	/** minimal constructor */

	/** full constructor */

	// Property accessors


//	public Integer getPlaChcId() {
//		return this.plaChcId;
//	}
//
//	public void setPlaChcId(Integer plaChcId) {
//		this.plaChcId = plaChcId;
//	}

	public Date getPlaDate() {
		return this.plaDate;
	}

	@Override
	public String toString() {
		return "SalPlan [plaDate=" + plaDate + ", plaId=" + plaId
				+ ", plaResult=" + plaResult + ", plaTodo=" + plaTodo + "]";
	}

	public SalPlan(Long plaId, Date plaDate, String plaTodo, String plaResult) {
		super();
		this.plaId = plaId;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
		this.plaResult = plaResult;
	}

	public Long getPlaId() {
		return plaId;
	}

	public void setPlaId(Long plaId) {
		this.plaId = plaId;
	}

	public void setPlaDate(Date plaDate) {
		this.plaDate = plaDate;
	}

	public String getPlaTodo() {
		return this.plaTodo;
	}

	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}

	public String getPlaResult() {
		return this.plaResult;
	}

	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}

}