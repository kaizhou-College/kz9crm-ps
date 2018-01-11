package com.kz.crm.entity;

import java.util.Date;


/**
 * CstActivity entity. @author MyEclipse Persistence Tools
 */

public class CstActivity  implements java.io.Serializable {


    // Fields    

     private Long atvId;
//     private String atvCustNo;
     private String atvCustName;
     private Date atvDate;
     private String atvPlace;
     private String atvTitle;
     private String atvDesc;
     
     private CstCustomer customer;
     
     

    // Constructors

    public CstCustomer getCustomer() {
		return customer;
	}


	public void setCustomer(CstCustomer customer) {
		this.customer = customer;
	}


	/** default constructor */
    public CstActivity() {
    }


	public CstActivity(Long atvId, String atvCustName, Date atvDate,
			String atvPlace, String atvTitle, String atvDesc) {
		super();
		this.atvId = atvId;
		this.atvCustName = atvCustName;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
		this.atvDesc = atvDesc;
	}


	@Override
	public String toString() {
		return "CstActivity [atvCustName=" + atvCustName + ", atvDate="
				+ atvDate + ", atvDesc=" + atvDesc + ", atvId=" + atvId
				+ ", atvPlace=" + atvPlace + ", atvTitle=" + atvTitle + "]";
	}


	public Long getAtvId() {
		return atvId;
	}


	public void setAtvId(Long atvId) {
		this.atvId = atvId;
	}


	public String getAtvCustName() {
		return atvCustName;
	}


	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}


	public Date getAtvDate() {
		return atvDate;
	}


	public void setAtvDate(Date atvDate) {
		this.atvDate = atvDate;
	}


	public String getAtvPlace() {
		return atvPlace;
	}


	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}


	public String getAtvTitle() {
		return atvTitle;
	}


	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}


	public String getAtvDesc() {
		return atvDesc;
	}


	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}

	








}