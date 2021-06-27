package com.sahiloz.UAIT.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sahiloz.UAIT.dto.AddressDTO;
import com.sahiloz.UAIT.entity.Address;
import com.sahiloz.UAIT.service.AddressServiceImpl;

@CrossOrigin
@RestController
@Validated
@RequestMapping("address")
public class ApiController {
	
	@Autowired
	private AddressServiceImpl addressService;
	
	@Autowired
	private Environment env;
	
	@GetMapping(value="getAddress/{addressId}")
	public ResponseEntity<AddressDTO> getAddressDetails(@PathVariable("addressId") String addressId) throws Exception {
		 try
	       {
			 System.out.println("Hello from inside");
	           AddressDTO address = addressService.getAddress(addressId);
	           return new ResponseEntity<AddressDTO>(address, HttpStatus.OK);
	           
	       }
	       catch (Exception e) {
	           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
	       }
		
	}
	
	@GetMapping(value="getAddress")
	public ResponseEntity<List<AddressDTO>> getAddresses() throws Exception {
		 try
	       {
	           List<AddressDTO> addresses = addressService.getAddresses();
	           
	           return new ResponseEntity<>(addresses, HttpStatus.OK);
	           
	       }
	       catch (Exception e) {
	           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
	       }
		
	}
	
	@PostMapping(value = "/addAddress/")
	public ResponseEntity<String> addAddress(@RequestBody @Valid AddressDTO address) throws Exception {
		try
		{
			Integer addressId=addressService.postAddress(address);
			String modificationSuccessMsg = "The address has been added successfully with ID "+addressId;
			return new ResponseEntity<String>(modificationSuccessMsg, HttpStatus.OK);
			
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.FORBIDDEN, env.getProperty(e.getMessage()));
		}

	}
	
	//Validation and condition checking not done properly please be mindful of that
	@PutMapping(value="updateAddress/{addressId}/{aadharId}")
	public ResponseEntity<String> updateAddress(@PathVariable String addressId, @PathVariable String aadharId,@RequestBody AddressDTO address) throws Exception{
		Integer addId=addressService.updateAddress(address);
		return new ResponseEntity<String>("The fields have been updated succesfully",HttpStatus.OK);
	}
	
	//Also need to add delete functionality but skipping for now
	

}
