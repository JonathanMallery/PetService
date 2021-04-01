package com.cognixia.jump.springcloud.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Pet;
import com.cognixia.jump.springcloud.repository.PetRepository;
import com.cognixia.jump.springcloud.service.PetService;

@RestController
public class PetController {

	private static final Logger logger = LoggerFactory.getLogger(PetController.class);
	
	@Autowired
	PetService petservice;
	
	@Autowired
	private PetRepository petRepository;
	
	@GetMapping("/hellopet")
	public String helloCustomer() {
		return "Hello from Pet Service - Controller!!";
	}
	
	@GetMapping(value = "/pet")
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}
	
	@GetMapping(value = "/pet/{petId}")
	public Pet findByPetId(@PathVariable Integer petId) {
		logger.info("Find by Pet ID :"+petId);
		return petRepository.findByPetId(petId);
	}
	@GetMapping(value = "/pet/pet-type/{type}")
	public List<Pet> findByPetType(@PathVariable String type){
		logger.info("Find by Pet Type :"+type);
		return petRepository.findAllByPetType(type);
	}
	@GetMapping(value = "/pet/customer/{customer}")
	public List<Pet> findByCustomer(@PathVariable Integer customer) {
		logger.info("Find by Customer :"+customer);
		return petRepository.findAllByCustomerId(customer);
	}
	
	@PostMapping(value = "/pet")
	public Pet save(@RequestBody Pet pet) {
		return petRepository.save(pet);
	}
	@PutMapping(value = "/pet")
	public Pet update(@RequestBody Pet pet) {
		logger.info("Find by Pet :"+pet);
		return petRepository.save(pet);
	}
	@DeleteMapping(value = "/pet")
	public void delete(@RequestBody Pet pet) {
		logger.info("Find by Pet :"+pet);
		petRepository.delete(pet);
	}
	
}
