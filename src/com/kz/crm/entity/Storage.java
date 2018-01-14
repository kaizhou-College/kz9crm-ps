package com.kz.crm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Storage entity. @author MyEclipse Persistence Tools
 */

public class Storage implements java.io.Serializable {
	// Fields
	private Long stkId;
//	private Integer stkProdId;
	private String stkWarehouse;
	private String stkWare;
	private Integer stkCount;
	private String stkMemo;
	private Product product;
	
	
	
	
	// Constructors


//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Storage(Long stkId, String stkWarehouse, String stkWare,
			Integer stkCount, String stkMemo) {
		super();
		this.stkId = stkId;
		this.stkWarehouse = stkWarehouse;
		this.stkWare = stkWare;
		this.stkCount = stkCount;
		this.stkMemo = stkMemo;
	}

	@Override
	public String toString() {
		return "Storage [stkCount=" + stkCount + ", stkId=" + stkId
				+ ", stkMemo=" + stkMemo 
				+ ", stkWare=" + stkWare + ", stkWarehouse=" + stkWarehouse
				+ "]";
	}

	/** default constructor */
	public Storage() {
	}


	// Property accessors

	

	public Long getStkId() {
		return this.stkId;
	}

	

	public void setStkId(Long stkId) {
		this.stkId = stkId;
	}

//	public Integer getStkProdId() {
//		return this.stkProdId;
//	}
//
//	public void setStkProdId(Integer stkProdId) {
//		this.stkProdId = stkProdId;
//	}

	public String getStkWarehouse() {
		return this.stkWarehouse;
	}

	public void setStkWarehouse(String stkWarehouse) {
		this.stkWarehouse = stkWarehouse;
	}

	public String getStkWare() {
		return this.stkWare;
	}

	public void setStkWare(String stkWare) {
		this.stkWare = stkWare;
	}

	public Integer getStkCount() {
		return this.stkCount;
	}

	public void setStkCount(Integer stkCount) {
		this.stkCount = stkCount;
	}

	public String getStkMemo() {
		return this.stkMemo;
	}

	public void setStkMemo(String stkMemo) {
		this.stkMemo = stkMemo;
	}

}