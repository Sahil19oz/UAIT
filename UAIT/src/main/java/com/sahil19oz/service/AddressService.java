package com.sahil19oz.service;

import com.sahiloz.dto.AddressDTO;

public interface AddressService {
	
	public AddressDTO getAddress(String addressID);
	
	public Integer postAddress(AddressDTO address);
	
	public Integer updateAddress(AddressDTO address);
}
