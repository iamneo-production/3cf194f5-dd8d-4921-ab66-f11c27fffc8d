package com.virtusa.patientservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.patientservice.entity.Patient;
import com.virtusa.patientservice.repository.PatientRepository;
// import com.virtusa.patientservice.feign.ReminderFeignClient;


@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/patients")
    public void createPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }
    
}
