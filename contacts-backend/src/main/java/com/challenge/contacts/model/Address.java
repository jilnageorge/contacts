package com.challenge.contacts.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table (name = "ADDRESS")
@Data
@Builder
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "ADDRESS_ID")
	private int id;
	
	@Column (name = "ADDRESS1")
	private String address1;
	
	@Column (name = "ADDRESS2")
	private String address2;
	
	@Column (name = "CITY")
	private String city;
	
	@Column (name = "POSTCODE")
	private Integer postCode;
	
	@OneToOne
	@JoinColumn(name="CONTACT_ID")
	private Contact contact;
}
