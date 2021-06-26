package com.sahiloz.UAIT.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sahiloz.UAIT.entity.Address;

@Repository
public interface AddressRepostory extends CrudRepository<Address, Integer> {
	
	public Address findByAddressID(Integer addressID);
}
