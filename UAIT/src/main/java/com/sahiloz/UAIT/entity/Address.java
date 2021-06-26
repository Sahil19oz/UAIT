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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aadharNumber")
	private AadharCard aadharNumber;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="epicId")
	private String epicId;
	

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="panNumber")
	private String panNumber;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="passportId")
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
		address.setPanNumber(addressObj.getPanNumber());
		address.setPassportId(addressObj.getPassportId());
		return address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		result = prime * result + ((addressID == null) ? 0 : addressID.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((epicId == null) ? 0 : epicId.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		result = prime * result + ((passportId == null) ? 0 : passportId.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (addressID == null) {
			if (other.addressID != null)
				return false;
		} else if (!addressID.equals(other.addressID))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (epicId == null) {
			if (other.epicId != null)
				return false;
		} else if (!epicId.equals(other.epicId))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		if (passportId == null) {
			if (other.passportId != null)
				return false;
		} else if (!passportId.equals(other.passportId))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	
}
