package com.loanapp.auth.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.auth.model.CustomerInfo;
import com.loanapp.auth.repository.CustomerRepository;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerInfo getCustomerInfoByCustomerId(long customerId) {
		CustomerInfo obj = customerRepository.findById(customerId).get();
		return obj;
	}
	
	@Override
	public ArrayList<CustomerInfo> getListProductFromTextFile(String filePath) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bReader = null;
		ArrayList<CustomerInfo> listResult = new ArrayList<CustomerInfo>();
		try {
			fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
			bReader = new BufferedReader(isr);
			//String save line get from text file
			String line = null;
			//Array save product
			String[]strProduct = null;
			SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
			
			//Loop and get all data in text file
			line = bReader.readLine();
			while(line != null) {
				//Get 1 line
				line = bReader.readLine();
				//Check line get empty, exit loop 
				if(line == null) {
					break;
				} else {
					strProduct = line.split(";");
					listResult.add(new CustomerInfo(strProduct[0], strProduct[1], strProduct[2], strProduct[3],
							strProduct[4], formatter.parse(strProduct[5]), strProduct[6], strProduct[7],
							strProduct[8], Boolean.parseBoolean(strProduct[9])));
				}
			}
			customerRepository.saveAll(listResult);
			
		} catch (Exception e) {
			System.out.println("Read file error");
			e.printStackTrace();
		} finally {
			//close file
			try {
				bReader.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listResult;
	}
}
