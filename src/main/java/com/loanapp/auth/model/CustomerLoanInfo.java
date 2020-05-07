package com.loanapp.auth.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customerloaninfo")
@IdClass(CustomerProductPK.class)
public class CustomerLoanInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long productId;

	@Id
	private Long customerId;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LSN_SEQ")
    @SequenceGenerator(name = "LSN_SEQ", sequenceName = "LSN_SEQ", allocationSize = 1, initialValue = 1)
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
	private Integer applicationStatus; //1=Pending, 2=Accepted, 3=Rejected, 4=Expired, 5=Flagged
	private Date approvedDate;
	private String remarks;

	public CustomerProductPK getId() {
        return new CustomerProductPK(
            productId,
            customerId,
            loanSerialNo
        );
    }

    public void setId(CustomerProductPK id) {
        this.productId = id.getProductId();
        this.customerId = id.getCustomerId();
        this.loanSerialNo = id.getLoanSerialNo();
    }

	
	public CustomerLoanInfo() {
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
