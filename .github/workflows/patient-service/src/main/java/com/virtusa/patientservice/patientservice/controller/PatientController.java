package com.virtusa.patientservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.virtusa.patientservice.entity.Patient;
import com.virtusa.patientservice.repository.PatientRepo;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientRepo patientRepository;

    @PostMapping("/patients")
    public String addPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
        return "success" ;
    }

    
}
