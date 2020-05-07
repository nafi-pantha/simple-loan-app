package com.loanapp.auth.service;

import java.util.List;

import com.loanapp.auth.dto.CustomerLoanInfoDTO;
import com.loanapp.auth.model.CustomerLoanInfo;

public interface CustomerLoanInfoService {

	void add(CustomerLoanInfoDTO customerLoanInfoDTO);

	List<CustomerLoanInfo> getAllLoans();
}
