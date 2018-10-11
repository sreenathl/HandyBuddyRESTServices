package com.slickarc.hb.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slickarc.hb.domain.Customer;

@RestController
public class CustomerController {

	@PostMapping(produces="application/json", consumes="application/json" ,value="/greet" )
	public Customer greetCustomer(@RequestBody Customer customer, @RequestParam(required=false) String name)
	{
		String returnString="";
		try {
			returnString = "Hello "+name.trim()+" !";
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		customer.setFirstName("Some Other");
		
		return  customer;
	}
}
