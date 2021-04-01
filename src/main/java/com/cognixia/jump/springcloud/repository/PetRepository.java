package com.cognixia.jump.springcloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.jump.springcloud.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

	
	List<Pet> findAllByCustomerId(Integer customerId);
	List<Pet> findAllByPetType(String petType);
	Pet findByPetId(Integer petId);
}
