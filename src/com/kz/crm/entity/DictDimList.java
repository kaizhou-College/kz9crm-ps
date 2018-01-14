package com.kz.crm.entity;

public class DictDimList {
	private String type;
	private String item;
	private String value;
	public DictDimList(String type, String item, String value) {
		super();
		this.type = type;
		this.item = item;
		this.value = value;
	}
	public DictDimList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "DictDimList [item=" + item + ", type=" + type + ", value="
				+ value + "]";
	}
	
	
}
