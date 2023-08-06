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
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class PharmacyController {

    @Autowired
    MedicationRepository medicationRepository;

    @GetMapping("pharmacy/medications/{medication_id}")
    @Retry(name="medication",fallbackMethod="medicationFallback")
    public Medication getMedication(@PathVariable("medication_id") int id){
        return medicationRepository.findById(id).get();
    }

    @PostMapping("pharmacy/medications")
    public void addMedication(@RequestBody Medication m){
         medicationRepository.save(m);
    }

    public Medication medicationFallback(){
        Medication m=new Medication(0,"Pharmacy Service is down","Fallback method called","");
        return m;
    }
    
}
