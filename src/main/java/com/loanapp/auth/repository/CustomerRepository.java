package com.loanapp.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.loanapp.auth.model.CustomerInfo;

public interface CustomerRepository extends CrudRepository<CustomerInfo, Long> {
}