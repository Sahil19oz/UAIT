package com.sahiloz.UAIT.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahiloz.UAIT.dto.AddressDTO;
import com.sahiloz.UAIT.entity.Address;
import com.sahiloz.UAIT.repository.AddressRepostory;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepostory addressRepo;
	
	@Override
	public AddressDTO getAddress(String addressID) throws Exception{
		Address addressObj=addressRepo.findByAddressID(Integer.parseInt(addressID));
		if(addressObj==null) {
			System.out.println("Address record does not exist");
			return null;
		}
		AddressDTO obj=Address.changeToDTO(addressObj);
		
		return obj;
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
