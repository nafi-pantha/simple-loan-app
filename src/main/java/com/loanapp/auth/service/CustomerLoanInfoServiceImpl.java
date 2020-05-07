package com.loanapp.auth.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.auth.dto.CustomerLoanInfoDTO;
import com.loanapp.auth.model.CustomerLoanInfo;
import com.loanapp.auth.model.CustomerProductPK;
import com.loanapp.auth.repository.CustomerLoanInfoRepository;

@Service
public class CustomerLoanInfoServiceImpl implements CustomerLoanInfoService {

	@Autowired
	private CustomerLoanInfoRepository customerLoanInfoReporsitory;

	@Override
	public void add(CustomerLoanInfoDTO customerLoanInfoDTO) {
		Date date = new Date();

		CustomerLoanInfo customerLoanInfo = new CustomerLoanInfo();
		CustomerProductPK customerProductPK = new CustomerProductPK();

		customerProductPK.setCustomerId(customerLoanInfoDTO.getCustomerId());
		customerProductPK.setProductId(customerLoanInfoDTO.getProductId());
		customerLoanInfo.setId(customerProductPK);
		customerLoanInfo.setOccupation(customerLoanInfoDTO.getOccupation());
		customerLoanInfo.setPresentEmployer(customerLoanInfoDTO.getPresentEmployer());
		customerLoanInfo.setDesignation(customerLoanInfoDTO.getDesignation());
		customerLoanInfo.setYearsOfExp(customerLoanInfoDTO.getYearsOfExp());
		customerLoanInfo.setGrossMonthlySalary(customerLoanInfoDTO.getGrossMonthlySalary());
		customerLoanInfo.setDesiredLoanAmt(customerLoanInfoDTO.getDesiredLoanAmt());
		customerLoanInfo.setDesiredTenure(customerLoanInfoDTO.getDesiredTenure());
		customerLoanInfo.setLoanPurpose(customerLoanInfoDTO.getLoanPurpose());
		customerLoanInfo.setAppliedDate(date);
		customerLoanInfo.setApplicationStatus(1);
		customerLoanInfo.setRemarks(customerLoanInfoDTO.getRemarks());

		customerLoanInfoReporsitory.save(customerLoanInfo);
	}

	@Override
	public List<CustomerLoanInfo> getAllLoans() {
		List<CustomerLoanInfo> customerLoanInfos = (List<CustomerLoanInfo>) customerLoanInfoReporsitory.findAll(); 
        return customerLoanInfos;
	}

}
