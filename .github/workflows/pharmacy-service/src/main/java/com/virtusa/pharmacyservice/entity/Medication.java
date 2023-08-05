package com.virtusa.pharmacyservice.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medication {

	@Id
    int id;
	 String name;
	 String description;
	 String availability;
	 
	public Medication() {
		super();
	}
	public Medication(int id, String name, String description, String availability) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.availability = availability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
    
    
}
