package com.virtusa.pharmacyservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.pharmacyservice.entity.Medication;
import com.virtusa.pharmacyservice.repository.MedicationRepository;

@RestController
public class PharmacyController {

    @Autowired
    MedicationRepository medicationRepository;

    @GetMapping("/medications/{medication_id}")
    public Medication getMedication(@PathVariable("medication_id") int id){
        return medicationRepository.findById(id).get();
    }

    @PostMapping("/medications")
    public void addMedication(@RequestBody Medication m){
         medicationRepository.save(m);
    }

    
}
