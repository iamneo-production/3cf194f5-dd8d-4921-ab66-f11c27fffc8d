package com.virtusa.patientservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	private PatientRepo patientRepository;

    @PostMapping
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){

       Patient patient1 = patientService.savePatient(patient);

       return ResponseEntity.status(HttpStatus.CREATED).body(patient1);

    }





    
}
