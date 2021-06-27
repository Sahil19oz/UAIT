package com.sahiloz.UAIT.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sahiloz.UAIT.dto.AddressDTO;

@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressID;
	
	private String street;
	
	private String town;
	
	private String district;
	
	private Integer zipCode;
	
	private String state;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="aadharNumber",nullable = true)
	private AadharCard aadharNumber;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="epicId")
	private String epicId;
	

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="panNumber")
//	@Column(name="pannumber")
//	private String panNumber;
//	
////	@OneToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name="passportId")
//	private String passportId;

	
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

	public AadharCard getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(AadharCard aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getEpicId() {
		return epicId;
	}

	public void setEpicId(String epicId) {
		this.epicId = epicId;
	}

//	public String getPanNumber() {
//		return panNumber;
//	}
//
//	public void setPanNumber(String panNumber) {
//		this.panNumber = panNumber;
//	}
//
//	public String getPassportId() {
//		return passportId;
//	}
//
//	public void setPassportId(String passportId) {
//		this.passportId = passportId;
//	}
	
	public static AddressDTO changeToDTO(Address addressObj) {
		AddressDTO address=new AddressDTO();
		address.setAddressID(addressObj.getAddressID());
		address.setStreet(addressObj.getStreet());
		address.setTown(addressObj.getTown());
		address.setDistrict(addressObj.getDistrict());
		address.setZipCode(addressObj.getZipCode());
		address.setAadharNumber(addressObj.getAadharNumber());
		address.setState(addressObj.getState());
		address.setEpicId(addressObj.getEpicId());
//		address.setPanNumber(addressObj.getPanNumber());
//		address.setPassportId(addressObj.getPassportId());
		return address;
	}
	
	public static Address changeToEntity(AddressDTO addressObj) {
		Address address=new Address();
		address.setAddressID(addressObj.getAddressID());
		address.setStreet(addressObj.getStreet());
		address.setTown(addressObj.getTown());
		address.setDistrict(addressObj.getDistrict());
		address.setZipCode(addressObj.getZipCode());
		address.setAadharNumber(addressObj.getAadharNumber());
		address.setState(addressObj.getState());
		address.setEpicId(addressObj.getEpicId());
//		address.setPanNumber(addressObj.getPanNumber());
//		address.setPassportId(addressObj.getPassportId());
		return address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressID == null) ? 0 : addressID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		return true;
	}

	
}
