package com.virtusa.notificationservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import com.virtusa.notificationservice.dto.MedSchedule;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "REMINDER-SERVICE")
public interface ReminderFeignClient {

    @PostMapping("/reminders/{patientId}")
    public List<MedSchedule> postingRemindersToNotification(@PathVariable("patientId") int pid);
    
}
