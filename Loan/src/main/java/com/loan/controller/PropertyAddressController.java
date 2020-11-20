package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.model.PropertyAddress;
import com.loan.repository.PropertyAddressMapper;

@Component
@RestController
@RequestMapping("/propertyAddress")
public class PropertyAddressController {

	@Autowired
	private PropertyAddressMapper propertyAddressMapper;

	public PropertyAddressController(PropertyAddressMapper propertyAddressMapper) {
		this.propertyAddressMapper = propertyAddressMapper;
	}

	@GetMapping("/get-propertyAddress")
	public List<PropertyAddress> getPropertyDetails() {
		return propertyAddressMapper.findAll();
	}

	@GetMapping("/get-propertyAddress/{id}")
	public PropertyAddress getpropertyAddressId(@PathVariable("id") String propertyAddressId) {
		return propertyAddressMapper.getPropertyAddressId(propertyAddressId);
	}

	@PostMapping("/post-propertyAddress")
	private List<PropertyAddress> update() {
		PropertyAddress propertyAddress = new PropertyAddress();
		propertyAddress.setPropertyAddressId("13");
		propertyAddress.setAddressLine1("jp nagar");
		propertyAddress.setAddressLine2("bang");
		propertyAddress.setCity("rkr");
		propertyAddress.setState("ka");
		propertyAddress.setPostalCode("56234");
		propertyAddressMapper.insertIntopropertyAddress(propertyAddress);
		return propertyAddressMapper.findAll();
	}
}
