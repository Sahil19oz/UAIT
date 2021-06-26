package com.sahiloz.service;

import com.sahiloz.dto.AddressDTO;

public interface AddressService {
	
	public AddressDTO getAddress(String addressID) throws Exception;
	
	public Integer postAddress(AddressDTO address) throws Exception;
	
	public Integer updateAddress(AddressDTO address) throws Exception;
	
	//Maybe we can add a delete service
}
