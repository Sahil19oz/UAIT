package com.sahiloz.UAIT.service;

import com.sahiloz.UAIT.dto.AddressDTO;

public interface AddressService {
	
	public AddressDTO getAddress(String addressID) throws Exception;
	
	public Integer postAddress(AddressDTO address) throws Exception;
	
	public Integer updateAddress(AddressDTO address) throws Exception;
	
	//Maybe we can add a delete service
}
