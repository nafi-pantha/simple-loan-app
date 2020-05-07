package com.loanapp.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.loanapp.auth.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	@Transactional(timeout = 10)
	Iterable<Product> findAll();
}