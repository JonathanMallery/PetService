package com.cognixia.jump.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognixia.jump.springcloud.model.Pet;


@Service
@FeignClient("pet-service")
public interface PetService {
	

}
