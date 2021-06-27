package com.sahiloz.UAIT.dto;

import java.util.Date;


import com.sahiloz.UAIT.entity.Address;

//Need to add Validation to this class

public class AadharCardDTO {

	private String aadharNumber;
	private String Name;
	private String gender;
	private Date DOB;
	private Address addressId;
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Address getAddressId() {
		return addressId;
	}
	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	
	
}
