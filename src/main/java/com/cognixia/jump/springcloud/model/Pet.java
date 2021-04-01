package com.cognixia.jump.springcloud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Pet")
@Entity
public class Pet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PETID")
	Integer petId;
	
	@Column(name="PETTYPE")
	String petType;
	
	@Column(name="PETNAME")
	String petName;
	
	@Column(name="WEIGHT")
	Double weight;
	
	@Column(name="AGE")
	int age;
	
	@Column(name="CUSTOMERID")
	Integer customerId;
	
	public Pet() {
		super();
	}
	
	public Pet(Integer petId, String petType, String petName, Double weight, int age, Integer customerId) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petName = petName;
		this.weight = weight;
		this.age = age;
		this.customerId = customerId;
	}




	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
		
}
