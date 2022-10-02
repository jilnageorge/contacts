package com.challenge.contacts.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "CONTACT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "CONTACT_ID")
	private int id;
	
	@Column (name = "FIRST_NAME")
	private String firstName;
	
	@Column (name = "LAST_NAME")
	private String lastName;
	
	@Column (name = "EMAIL")
	private String email;
	
	@OneToOne(mappedBy = "contact",cascade = {CascadeType.ALL})
	private Address address;
	
	@OneToMany(mappedBy = "contact", cascade = {CascadeType.ALL})
	private List<Child> children;
}
