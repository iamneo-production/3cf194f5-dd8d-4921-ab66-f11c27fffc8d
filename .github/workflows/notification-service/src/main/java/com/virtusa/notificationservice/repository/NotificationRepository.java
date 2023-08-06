package com.virtusa.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.virtusa.notificationservice.dto.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer>{

    List<Notification> findByPatientId(int patientId);
    
}
