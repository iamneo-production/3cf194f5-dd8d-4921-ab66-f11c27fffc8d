package com.virtusa.patientservice.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import javax.annotation.processing.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;


@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
    private String patientName;
    private int age;
    private int prescriptionId;
    private String phoneno;
    
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPrescriptionId() {
        return prescriptionId;
    }
    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    





    
}
