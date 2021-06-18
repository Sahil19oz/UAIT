package com.sahil19oz.service;

public interface AddressService {
	
	public AddressDTO getAddress(String addressID);
	
	public Integer postAddress(AddressDTO address);
	
	public Integer updateAddress(AddressDTO address);
}
