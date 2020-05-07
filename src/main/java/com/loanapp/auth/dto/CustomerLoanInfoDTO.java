package com.loanapp.auth.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerLoanInfoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long productId;
	private Long customerId;
	private Integer loanSerialNo;
	private String occupation;
	private String presentEmployer;
	private String designation;
	private Integer yearsOfExp;
	private BigDecimal grossMonthlySalary;
	private BigDecimal desiredLoanAmt;
	private Integer desiredTenure;
	private String loanPurpose;
	private Date appliedDate;
	private Integer applicationStatus;
	private Date approvedDate;
	private String remarks;
	
	public CustomerLoanInfoDTO() {
	}

	public CustomerLoanInfoDTO(Long productId, Long customerId, Integer loanSerialNo, String occupation,
			String presentEmployer, String designation, Integer yearsOfExp, BigDecimal grossMonthlySalary,
			BigDecimal desiredLoanAmt, Integer desiredTenure, String loanPurpose, Date appliedDate,
			Integer applicationStatus, Date approvedDate, String remarks) {
		this.productId = productId;
		this.customerId = customerId;
		this.loanSerialNo = loanSerialNo;
		this.occupation = occupation;
		this.presentEmployer = presentEmployer;
		this.designation = designation;
		this.yearsOfExp = yearsOfExp;
		this.grossMonthlySalary = grossMonthlySalary;
		this.desiredLoanAmt = desiredLoanAmt;
		this.desiredTenure = desiredTenure;
		this.loanPurpose = loanPurpose;
		this.appliedDate = appliedDate;
		this.applicationStatus = applicationStatus;
		this.approvedDate = approvedDate;
		this.remarks = remarks;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getLoanSerialNo() {
		return loanSerialNo;
	}

	public void setLoanSerialNo(Integer loanSerialNo) {
		this.loanSerialNo = loanSerialNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPresentEmployer() {
		return presentEmployer;
	}

	public void setPresentEmployer(String presentEmployer) {
		this.presentEmployer = presentEmployer;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(Integer yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public BigDecimal getGrossMonthlySalary() {
		return grossMonthlySalary;
	}

	public void setGrossMonthlySalary(BigDecimal grossMonthlySalary) {
		this.grossMonthlySalary = grossMonthlySalary;
	}

	public BigDecimal getDesiredLoanAmt() {
		return desiredLoanAmt;
	}

	public void setDesiredLoanAmt(BigDecimal desiredLoanAmt) {
		this.desiredLoanAmt = desiredLoanAmt;
	}

	public Integer getDesiredTenure() {
		return desiredTenure;
	}

	public void setDesiredTenure(Integer desiredTenure) {
		this.desiredTenure = desiredTenure;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public Integer getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
