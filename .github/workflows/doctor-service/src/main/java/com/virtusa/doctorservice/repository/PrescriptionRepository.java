package com.virtusa.doctorservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.doctorservice.entity.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {
    
}
