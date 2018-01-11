package com.kz.crm.entity;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Long prodId;
	private String prodName;
	private String prodType;
	private String prodBatch;
	private String prodUnit;
	private Long prodPrice;
	private String prodMemo;
	
	
	//private OrdersLine orderLine;
	
	
	// Constructors

//	public OrdersLine getOrderLine() {
//		return orderLine;
//	}
//
//	public void setOrderLine(OrdersLine orderLine) {
//		this.orderLine = orderLine;
//	}

	/** default constructor */
	public Product() {
	}

	@Override
	public String toString() {
		return "Product [prodBatch=" + prodBatch + ", prodId=" + prodId
				+ ", prodMemo=" + prodMemo + ", prodName=" + prodName
				+ ", prodPrice=" + prodPrice + ", prodType=" + prodType
				+ ", prodUnit=" + prodUnit + "]";
	}

	/** minimal constructor */
	public Product(Long prodId, String prodName, String prodType) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
	}

	/** full constructor */
	public Product(Long prodId, String prodName, String prodType,
			String prodBatch, String prodUnit, Long prodPrice, String prodMemo) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodBatch = prodBatch;
		this.prodUnit = prodUnit;
		this.prodPrice = prodPrice;
		this.prodMemo = prodMemo;
	}

	// Property accessors

	public Long getProdId() {
		return this.prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdBatch() {
		return this.prodBatch;
	}

	public void setProdBatch(String prodBatch) {
		this.prodBatch = prodBatch;
	}

	public String getProdUnit() {
		return this.prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public Long getProdPrice() {
		return this.prodPrice;
	}

	public void setProdPrice(Long prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdMemo() {
		return this.prodMemo;
	}

	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}

}