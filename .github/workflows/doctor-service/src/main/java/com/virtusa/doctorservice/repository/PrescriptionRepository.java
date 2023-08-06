package com.virtusa.doctorservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.virtusa.doctorservice.entity.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {

    List<Prescription> findByPatientId(Integer patientId);
    
}
