package com.loanapp.auth.service;

import java.util.ArrayList;
import com.loanapp.auth.model.CustomerInfo;

public interface CustomerInfoService {
	ArrayList<CustomerInfo> getListProductFromTextFile(String filePath);

	CustomerInfo getCustomerInfoByCustomerId(long customerId);
}
