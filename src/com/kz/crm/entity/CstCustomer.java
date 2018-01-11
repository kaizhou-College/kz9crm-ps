package com.kz.crm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * CstCustomer entity. @author MyEclipse Persistence Tools
 */

public class CstCustomer implements java.io.Serializable {

	// Fields

	private String custNo;
	private String custName;
	private String custRegion;
	private Long custManagerId;
	private String custManagerName;
	private Long custLevel;
	private String custLevelLabel;
	private Long custSatisfy;
	private Long custCredit;
	private String custAddr;
	private String custZip;
	private String custTel;
	private String custFax;
	private String custWebsite;
	private String custLicenceNo;
	private String custChieftain;
	private Long custBankroll;
	private String custTurnover;
	private String custBank;
	private String custBankAccount;
	private String custLocalTaxNo;
	private String custNationalTaxNo;
	private Long custStatus;
	private Set<CstLinkman> linKman=new HashSet<CstLinkman>();
	
	private Set<CstActivity> activity=new HashSet<CstActivity>();
	private Set<Orders> order=new HashSet<Orders>();
	
	
	
	
	// Constructors

	public Set<Orders> getOrder() {
		return order;
	}



	public void setOrder(Set<Orders> order) {
		this.order = order;
	}



	public Set<CstActivity> getActivity() {
		return activity;
	}



	public void setActivity(Set<CstActivity> activity) {
		this.activity = activity;
	}



	/** default constructor */
	public CstCustomer() {
	}

	

	public Set<CstLinkman> getLinKman() {
		return linKman;
	}



	public void setLinKman(Set<CstLinkman> linKman) {
		this.linKman = linKman;
	}




	/** minimal constructor */
	public CstCustomer(String custNo, String custName) {
		this.custNo = custNo;
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "CstCustomer [custAddr=" + custAddr + ", custBank=" + custBank
				+ ", custBankAccount=" + custBankAccount + ", custBankroll="
				+ custBankroll + ", custChieftain=" + custChieftain
				+ ", custCredit=" + custCredit + ", custFax=" + custFax
				+ ", custLevel=" + custLevel + ", custLevelLabel="
				+ custLevelLabel + ", custLicenceNo=" + custLicenceNo
				+ ", custLocalTaxNo=" + custLocalTaxNo + ", custManagerId="
				+ custManagerId + ", custManagerName=" + custManagerName
				+ ", custName=" + custName + ", custNationalTaxNo="
				+ custNationalTaxNo + ", custNo=" + custNo + ", custRegion="
				+ custRegion + ", custSatisfy=" + custSatisfy + ", custStatus="
				+ custStatus + ", custTel=" + custTel + ", custTurnover="
				+ custTurnover + ", custWebsite=" + custWebsite + ", custZip="
				+ custZip + "]";
	}



	/** full constructor */


	// Property accessors


	public CstCustomer(String custNo, String custName, String custRegion,
			Long custManagerId, String custManagerName, Long custLevel,
			String custLevelLabel, Long custSatisfy, Long custCredit,
			String custAddr, String custZip, String custTel, String custFax,
			String custWebsite, String custLicenceNo, String custChieftain,
			Long custBankroll, String custTurnover, String custBank,
			String custBankAccount, String custLocalTaxNo,
			String custNationalTaxNo, Long custStatus) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custRegion = custRegion;
		this.custManagerId = custManagerId;
		this.custManagerName = custManagerName;
		this.custLevel = custLevel;
		this.custLevelLabel = custLevelLabel;
		this.custSatisfy = custSatisfy;
		this.custCredit = custCredit;
		this.custAddr = custAddr;
		this.custZip = custZip;
		this.custTel = custTel;
		this.custFax = custFax;
		this.custWebsite = custWebsite;
		this.custLicenceNo = custLicenceNo;
		this.custChieftain = custChieftain;
		this.custBankroll = custBankroll;
		this.custTurnover = custTurnover;
		this.custBank = custBank;
		this.custBankAccount = custBankAccount;
		this.custLocalTaxNo = custLocalTaxNo;
		this.custNationalTaxNo = custNationalTaxNo;
		this.custStatus = custStatus;
	}

	// Property accessors

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustRegion() {
		return this.custRegion;
	}

	public void setCustRegion(String custRegion) {
		this.custRegion = custRegion;
	}

	public Long getCustManagerId() {
		return this.custManagerId;
	}

	public void setCustManagerId(Long custManagerId) {
		this.custManagerId = custManagerId;
	}

	public String getCustManagerName() {
		return this.custManagerName;
	}

	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}

	public Long getCustLevel() {
		return this.custLevel;
	}

	public void setCustLevel(Long custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustLevelLabel() {
		return this.custLevelLabel;
	}

	public void setCustLevelLabel(String custLevelLabel) {
		this.custLevelLabel = custLevelLabel;
	}

	public Long getCustSatisfy() {
		return this.custSatisfy;
	}

	public void setCustSatisfy(Long custSatisfy) {
		this.custSatisfy = custSatisfy;
	}

	public Long getCustCredit() {
		return this.custCredit;
	}

	public void setCustCredit(Long custCredit) {
		this.custCredit = custCredit;
	}

	public String getCustAddr() {
		return this.custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public String getCustZip() {
		return this.custZip;
	}

	public void setCustZip(String custZip) {
		this.custZip = custZip;
	}

	public String getCustTel() {
		return this.custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}

	public String getCustFax() {
		return this.custFax;
	}

	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}

	public String getCustWebsite() {
		return this.custWebsite;
	}

	public void setCustWebsite(String custWebsite) {
		this.custWebsite = custWebsite;
	}

	public String getCustLicenceNo() {
		return this.custLicenceNo;
	}

	public void setCustLicenceNo(String custLicenceNo) {
		this.custLicenceNo = custLicenceNo;
	}

	public String getCustChieftain() {
		return this.custChieftain;
	}

	public void setCustChieftain(String custChieftain) {
		this.custChieftain = custChieftain;
	}

	public Long getCustBankroll() {
		return this.custBankroll;
	}

	public void setCustBankroll(Long custBankroll) {
		this.custBankroll = custBankroll;
	}

	public String getCustTurnover() {
		return this.custTurnover;
	}

	public void setCustTurnover(String custTurnover) {
		this.custTurnover = custTurnover;
	}

	public String getCustBank() {
		return this.custBank;
	}

	public void setCustBank(String custBank) {
		this.custBank = custBank;
	}

	public String getCustBankAccount() {
		return this.custBankAccount;
	}

	public void setCustBankAccount(String custBankAccount) {
		this.custBankAccount = custBankAccount;
	}

	public String getCustLocalTaxNo() {
		return this.custLocalTaxNo;
	}

	public void setCustLocalTaxNo(String custLocalTaxNo) {
		this.custLocalTaxNo = custLocalTaxNo;
	}

	public String getCustNationalTaxNo() {
		return this.custNationalTaxNo;
	}

	public void setCustNationalTaxNo(String custNationalTaxNo) {
		this.custNationalTaxNo = custNationalTaxNo;
	}



	public Long getCustStatus() {
		return custStatus;
	}



	public void setCustStatus(Long custStatus) {
		this.custStatus = custStatus;
	}

}