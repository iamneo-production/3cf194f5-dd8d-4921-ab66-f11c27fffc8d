package com.virtusa.notificationservice.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.virtusa.notificationservice.dto.MedSchedule;
import com.virtusa.notificationservice.dto.Notification;
import com.virtusa.notificationservice.repository.NotificationRepository;

import com.virtusa.notificationservice.feign.ReminderFeignClient;

@RestController
public class NotificationController {

    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    ReminderFeignClient reminderFeignClient;

    @PostMapping("/notifications/{patientId}")
    public void notification(@PathVariable("patientId") int pid)
        {
            List<MedSchedule> schedules=reminderFeignClient.postingRemindersToNotification(pid);
            if(schedules.size()>0){
                for(MedSchedule m: schedules){
                    String stime=m.getScheduleTime();
                    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime scheduleDateTime=LocalDateTime.parse(stime, formatter);
                    LocalDate scheduledate=scheduleDateTime.toLocalDate();
                    LocalDate currentDate=LocalDate.now();
                    if(scheduledate.isEqual(currentDate)){
                        LocalDateTime currentDateTime=LocalDateTime.now();
                        if(scheduleDateTime.isAfter(currentDateTime)){
                            Notification n=new Notification();
                            n.setMedication(m.getMedicationName());
                            n.setPatientId(pid);
                            n.setMessage("please take you medication");
                            notificationRepository.save(n);
                        }
                    }
            }
        }
    }

    @GetMapping("/notifications/{patientId}")
    public List<Notification> notifications(@PathVariable("patientId") int pid){
        return notificationRepository.findByPatientId(pid);
    }




}
