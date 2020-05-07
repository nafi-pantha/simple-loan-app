package com.loanapp.auth.web;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loanapp.auth.dto.CustomerLoanInfoDTO;
import com.loanapp.auth.service.CustomerInfoService;
import com.loanapp.auth.service.CustomerLoanInfoService;
import com.loanapp.auth.service.ProductInfoService;

@RestController
public class RestWebController {
	@Autowired
    private CustomerInfoService customerInfoService;
	
	@Autowired
    private ProductInfoService productInfoService;
	
	@Autowired
    private CustomerLoanInfoService customerLoanInfoService;
	
	@RequestMapping(value="/get-customer-info", method = RequestMethod.GET)
    public ResponseEntity<Object> getCustomerInfo(@RequestParam("customerID") long id, Model model){
		try {
			customerInfoService.getCustomerInfoByCustomerId(id);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Object>(new Error(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(customerInfoService.getCustomerInfoByCustomerId(id), HttpStatus.OK);
    }
	
	@RequestMapping(value="/get-product-info", method = RequestMethod.GET)
    public ResponseEntity<Object> getProductInfo(@RequestParam("loanProductID") long id, Model model){
		try {
			productInfoService.getProductInfoByProductId(id);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Object>(new Error(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(productInfoService.getProductInfoByProductId(id), HttpStatus.OK);
    }
	
	@RequestMapping(value = "/loan-application-submit", method = RequestMethod.POST)
	public ResponseEntity<Object> newCustomerLoan(@RequestBody CustomerLoanInfoDTO customerLoanInfoDTO) {
		try {
            customerLoanInfoService.add(customerLoanInfoDTO);
            return new ResponseEntity<Object>("Success!", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>("Error!", HttpStatus.BAD_REQUEST);
        }
	}
}
