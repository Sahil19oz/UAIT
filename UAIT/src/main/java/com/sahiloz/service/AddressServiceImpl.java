package com.sahiloz.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sahiloz.dto.AddressDTO;
import com.sahiloz.entity.Address;
import com.sahiloz.repository.AddressRepostory;

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDTO addressDTO;
	
	@Autowired
	private AddressRepostory addressRepo;
	
	@Override
	public AddressDTO getAddress(String addressID) {
		AddressDTO addressObj=addressRepo.findByAddressID(addressID);
		if(addressObj==null) {
			System.out.println("Address record does not exist");
			return null;
		}
		return addressObj;
	}

	@Override
	public Integer postAddress(AddressDTO address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateAddress(AddressDTO address) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

}
