package com.loanapp.auth.service;

import java.util.List;

import com.loanapp.auth.model.Product;

public interface ProductInfoService {

	List<Product> getAllProducts();

	Product getProductInfoByProductId(long id);
}
