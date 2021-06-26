package com.sahiloz.dto;

import javax.validation.constraints.NotNull;

import com.sahiloz.entity.Address;


public class AddressDTO {
	
	private Integer addressID;
	@NotNull(message= "Please enter the street")
	private String street;
	@NotNull(message="Please enter the town")
	private String town;
	@NotNull(message= "Please enter the district")
	private String district;
	@NotNull(message= "Please enter the zip code")
	private Integer zipCode;
	@NotNull(message= "Please enter the state")
	private String state;
	@NotNull(message="Please enter the aadhar number")
	private String aadharNumber;
	
	private String epicId;
	private String panNumber;
	private String passportId;

	
	public Integer getAddressID() {
		return addressID;
	}

	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getEpicId() {
		return epicId;
	}

	public void setEpicId(String epicId) {
		this.epicId = epicId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
}
