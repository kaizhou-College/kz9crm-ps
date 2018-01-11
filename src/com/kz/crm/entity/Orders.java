package com.kz.crm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Long odrId;
	private String odrCustomer;
	private Date odrDate;
	private String odrAddr;
	private String odrStatus;
	
	private CstCustomer customer;
	
	
	private Set<OrdersLine> orderLine=new HashSet<OrdersLine>();
	
	
	
	
	
	// Constructors


	@Override
	public String toString() {
		return "Orders [odrAddr=" + odrAddr + ", odrCustomer=" + odrCustomer
				+ ", odrDate=" + odrDate + ", odrId=" + odrId + ", odrStatus="
				+ odrStatus +"]";
	}
	public Set<OrdersLine> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(Set<OrdersLine> orderLine) {
		this.orderLine = orderLine;
	}

	public CstCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(CstCustomer customer) {
		this.customer = customer;
	}

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Long odrId, String odrCustomer, Date odrDate, String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrStatus = odrStatus;
	}

	/** full constructor */
	public Orders(Long odrId, String odrCustomer, Date odrDate, String odrAddr,
			String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrAddr = odrAddr;
		this.odrStatus = odrStatus;
	}

	// Property accessors

	public Long getOdrId() {
		return this.odrId;
	}

	public void setOdrId(Long odrId) {
		this.odrId = odrId;
	}

	public String getOdrCustomer() {
		return this.odrCustomer;
	}

	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}

	public Date getOdrDate() {
		return this.odrDate;
	}

	public void setOdrDate(Date odrDate) {
		this.odrDate = odrDate;
	}

	public String getOdrAddr() {
		return this.odrAddr;
	}

	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}

	public String getOdrStatus() {
		return this.odrStatus;
	}

	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}

}