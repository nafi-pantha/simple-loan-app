package com.loanapp.auth.model;

import java.io.Serializable;

public class CustomerProductPK implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long productId;
    private Long customerId;
	private Integer loanSerialNo;
	
	public CustomerProductPK() {
	}

	public CustomerProductPK(Long productId, Long customerId, Integer loanSerialNo) {
		this.productId = productId;
		this.customerId = customerId;
		this.loanSerialNo = loanSerialNo;
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
	
}
