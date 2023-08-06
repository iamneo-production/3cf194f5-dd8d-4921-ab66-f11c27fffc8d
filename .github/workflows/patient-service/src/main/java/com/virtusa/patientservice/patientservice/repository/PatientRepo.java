package com.virtusa.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.virtusa.patientservice.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer> {

}
