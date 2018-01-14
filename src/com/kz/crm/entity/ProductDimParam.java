package com.kz.crm.entity;

public class ProductDimParam {
	private String name;
	private String type;
	private String batch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public ProductDimParam(String name, String type, String batch) {
		super();
		this.name = name;
		this.type = type;
		this.batch = batch;
	}
	public ProductDimParam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
