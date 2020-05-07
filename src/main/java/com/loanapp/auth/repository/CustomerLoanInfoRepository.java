package com.loanapp.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.loanapp.auth.model.CustomerLoanInfo;

public interface CustomerLoanInfoRepository extends CrudRepository<CustomerLoanInfo, Long> {
}