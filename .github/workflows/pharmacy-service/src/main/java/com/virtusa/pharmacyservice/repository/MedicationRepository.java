package com.virtusa.pharmacyservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.virtusa.pharmacyservice.entity.Medication;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Integer> {
    
}
