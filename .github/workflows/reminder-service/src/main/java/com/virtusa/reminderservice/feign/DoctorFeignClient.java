package com.virtusa.reminderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import com.virtusa.reminderservice.dto.MedSchedule;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DOCTOR-SERVICE")
public interface DoctorFeignClient {

    @GetMapping("doctor/scheduleDate/{patientId}")
    public List<MedSchedule> gettingSchedule(@PathVariable("patientId") int pid);
    
}
