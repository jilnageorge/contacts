package com.challenge.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.contacts.dto.ContactDTO;
import com.challenge.contacts.service.ContactsService;

@RestController
@CrossOrigin(origins="*")
public class ContactController {
	
	@Autowired
	private ContactsService contactService;
	
	@PostMapping("/contacts")
	public ContactDTO saveContact(@RequestBody ContactDTO contactDTO){
		
		return this.contactService.saveContact(contactDTO);
		
	}
	
	@GetMapping("/contacts")
	public String getContacts() {
		
		return "Hello World";
		
	}

}
