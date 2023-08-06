package com.virtusa.patientservice.feign;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.virtusa.patientservice.entity.Prescription;

@FeignClient(name = "DOCTOR-SERVICE")
public interface DoctorFeignClient {

    @GetMapping("doctor/prescriptions/{patientId}")
    public List<Prescription> gettingPrescriptions(@PathVariable("patientId") int pid);
}
