package com.virtusa.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.virtusa.patientservice.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    
}
