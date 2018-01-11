package com.kz.crm.entity;

public class ByPage {
	private int pageIndex;
	private int pageSize;
	private String pageUrl;
	private int pageMax;
	private long count;
	public ByPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ByPage(int pageIndex, int pageSize, String pageUrl, int pageMax,
			long count) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.pageUrl = pageUrl;
		this.pageMax = pageMax;
		this.count = count;
	}

	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public int getPageMax() {
		return pageMax;
	}
	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ByPage [count=" + count + ", pageIndex=" + pageIndex
				+ ", pageMax=" + pageMax + ", pageSize=" + pageSize
				+ ", pageUrl=" + pageUrl + "]";
	}
	
	
	
	
}
