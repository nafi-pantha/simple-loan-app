package com.loanapp.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.auth.model.Product;
import com.loanapp.auth.repository.ProductRepository;

@Service
public class ProductInfoServiceImpl implements ProductInfoService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts(){
		List<Product> list = new ArrayList<>();
		productRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Product getProductInfoByProductId(long id) {
		Product obj = productRepository.findById(id).get();
		return obj;
	}
	
}
