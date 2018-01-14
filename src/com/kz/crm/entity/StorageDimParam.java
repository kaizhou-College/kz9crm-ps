package com.kz.crm.entity;

public class StorageDimParam {
	private String prodName;
	private String stkWarehouse;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getStkWarehouse() {
		return stkWarehouse;
	}
	public void setStkWarehouse(String stkWarehouse) {
		this.stkWarehouse = stkWarehouse;
	}
	public StorageDimParam(String prodName, String stkWarehouse) {
		super();
		this.prodName = prodName;
		this.stkWarehouse = stkWarehouse;
	}
	public StorageDimParam() {
		super();
	}
	@Override
	public String toString() {
		return "StorageDimParam [prodName=" + prodName + ", stkWarehouse="
				+ stkWarehouse + "]";
	}
}	