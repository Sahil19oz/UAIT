package com.sahiloz.UAIT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sahiloz.UAIT.entity.Address;

@Repository
public interface AddressRepostory extends CrudRepository<Address, Integer> {
	
	public Address findByAddressID(Integer addressID);
	
	@Query("Select a from Address a")
	public List<Address> getAllAddress();
}
