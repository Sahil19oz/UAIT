package com.sahiloz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahil19oz.serviceImpl.AddressServiceImpl;
import com.sahiloz.dto.AddressDTO;

@RestController
@RequestMapping("/")
public class ApiController {
	
	@Autowired
	private AddressServiceImpl addressService;
	
	@GetMapping(value="/getAddress/{Aid}")
	public ResponseEntity<AddressDTO> getAddressDetails(@PathVariable String Aid) {
		return null;
		
	}

}
