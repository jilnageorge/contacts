package com.challenge.contacts.service;

import org.mapstruct.Mapper;

import com.challenge.contacts.dto.ContactDTO;
import com.challenge.contacts.model.Contact;


@Mapper(componentModel = "spring")
public interface ContactMapper {

	Contact modelToEntity(ContactDTO contactDTO);

	ContactDTO entityToModel(Contact contact);

}