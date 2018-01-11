package com.kz.crm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * OrdersLine entity. @author MyEclipse Persistence Tools
 */

public class OrdersLine implements java.io.Serializable {

	// Fields

	private Long oddId;
	private Long oddOrderId;
	private Long oddProdId;
	private Long oddCount;
	private String oddUnit;
	private Long oddPrice;
	
	private Orders orders;
	
	private Set<Product> product=new HashSet<Product>();
	
	
	
	// Constructors

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "OrdersLine [oddCount=" + oddCount + ", oddId=" + oddId
		+ ", oddOrderId=" + oddOrderId+ ", oddPrice=" + oddPrice
				+ ", oddProdId=" + oddProdId + ", oddUnit=" + oddUnit
				+ ", product=" + product + "]";
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	/** default constructor */
	public OrdersLine() {
	}

	/** minimal constructor */
	public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId, Long oddCount) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
	}

	/** full constructor */
	public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId,
			Long oddCount, String oddUnit, Long oddPrice) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
		this.oddUnit = oddUnit;
		this.oddPrice = oddPrice;
	}

	// Property accessors

	public Long getOddId() {
		return this.oddId;
	}

	public void setOddId(Long oddId) {
		this.oddId = oddId;
	}

	public Long getOddOrderId() {
		return this.oddOrderId;
	}

	public void setOddOrderId(Long oddOrderId) {
		this.oddOrderId = oddOrderId;
	}

	public Long getOddProdId() {
		return this.oddProdId;
	}

	public void setOddProdId(Long oddProdId) {
		this.oddProdId = oddProdId;
	}

	public Long getOddCount() {
		return this.oddCount;
	}

	public void setOddCount(Long oddCount) {
		this.oddCount = oddCount;
	}

	public String getOddUnit() {
		return this.oddUnit;
	}

	public void setOddUnit(String oddUnit) {
		this.oddUnit = oddUnit;
	}

	public Long getOddPrice() {
		return this.oddPrice;
	}

	public void setOddPrice(Long oddPrice) {
		this.oddPrice = oddPrice;
	}

}