package com.sahiloz.repository;

import org.springframework.data.repository.CrudRepository;

import com.sahiloz.dto.AddressDTO;
import com.sahiloz.entity.Address;

public interface AddressRepostory extends CrudRepository<Address, Integer> {
	
	public AddressDTO findByAddressID(String addressID);
}
