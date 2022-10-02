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
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table (name = "CHILD")
@Data
@Builder
public class Child {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "NAME")
	private String name;
	
	@Column (name = "AGE")
	private int age;
	
	@ManyToOne
	@JoinColumn(name="CONTACT_ID")
	private Contact contact;
}
