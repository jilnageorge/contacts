package com.challenge.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.contacts.dto.ContactDTO;
import com.challenge.contacts.model.Contact;
import com.challenge.contacts.repository.ContactRepository;

@Service
public class ContactsService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ContactMapper contactMapper;

	public ContactDTO saveContact(ContactDTO contactDTO) {
		
		var contact = contactMapper.modelToEntity(contactDTO);
		contact.getAddress().setContact(contact);
		contact.getChildren().stream().forEach(x -> x.setContact(contact));
		
		Contact returnContact =  contactRepository.save(contact);
		
		return contactMapper.entityToModel(returnContact);
		
	}

}
