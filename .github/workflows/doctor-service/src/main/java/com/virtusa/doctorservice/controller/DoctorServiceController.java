package com.virtusa.doctorservice.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.doctorservice.entity.Prescription;
import com.virtusa.doctorservice.entity.MedSchedule;
import com.virtusa.doctorservice.repository.PrescriptionRepository;


@RestController
public class DoctorServiceController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @PostMapping("/prescriptions")
    public void addedPrescription(@RequestBody Prescription p){
        prescriptionRepository.save(p);
    }

    @GetMapping("/scheduleDate/{patientId}")
    public List<MedSchedule> gettingSchedule(@PathVariable("patientId") int pid){
        List<MedSchedule> schedules=new ArrayList<>();
        for(Prescription p:prescriptionRepository.findByPatientId(pid)){
            MedSchedule m=new MedSchedule();
            m.setMedicationName(p.getMedication());
            m.setScheduleTime(p.getScheduleTime());
            schedules.add(m);
        }
        return schedules;
    }

    @GetMapping("prescriptions/{patientId}")
    public List<Prescription> gettingPrescriptions(@PathVariable("patientId") int pid){
        return prescriptionRepository.findByPatientId(pid);
    }
    
}
