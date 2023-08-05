package com.virtusa.doctorservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.doctorservice.entity.Prescription;
import com.virtusa.doctorservice.repository.PrescriptionRepository;


@RestController
public class DoctorServiceController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @PostMapping("/prescriptions")
    public void addedPrescription(@RequestBody Prescription p){
        prescriptionRepository.save(p);
    }
    
}
