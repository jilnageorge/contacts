package com.challenge.contacts.dto;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDTO {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private AddressDTO address;
	
	private List<ChildDTO> children;
	
}
