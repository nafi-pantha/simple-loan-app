package com.loanapp.auth.dto;

import java.util.Date;

public class CustomerInfoDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String nid;
    private Date birthDate;
    private String address;
    private String postCode;
    private String contactNo;
    private Boolean activeStatus;
    
	public CustomerInfoDTO() {
	}
	
	

	public CustomerInfoDTO(String firstName, String lastName, String email, String gender, String nid, Date birthDate,
			String address, String postCode, String contactNo, Boolean activeStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.nid = nid;
		this.birthDate = birthDate;
		this.address = address;
		this.postCode = postCode;
		this.contactNo = contactNo;
		this.activeStatus = activeStatus;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
    
    
}
