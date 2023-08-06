package com.virtusa.reminderservice.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.reminderservice.feign.DoctorFeignClient;
import com.virtusa.reminderservice.dto.MedSchedule;
@RestController
public class ReminderController {

    @Autowired
    DoctorFeignClient doctorFeignClient;

    @PostMapping("/reminders/{patientId}")
    public List<MedSchedule> postingRemindersToNotification(@PathVariable("patientId") int pid){
        return doctorFeignClient.gettingSchedule(pid);
    }
    
}
