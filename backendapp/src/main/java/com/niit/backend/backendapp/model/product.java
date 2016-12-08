package com.niit.backend.backendapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
@Id
@Column(name="ID")
//@GeneratedValue
private int ID;
@Column(name="Name")
private String Name;

public product(int iD, String name) {
	
	this.ID = iD;
	this.Name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}











}
