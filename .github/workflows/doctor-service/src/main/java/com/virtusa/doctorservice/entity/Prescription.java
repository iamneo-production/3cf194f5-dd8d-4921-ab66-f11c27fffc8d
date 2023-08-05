package com.virtusa.doctorservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prescription {
	
	@Id
	int prescriptionId;
	
	int doctorId;
	
	private int patientId;
	
	private String medication;
	
	private String notes;

	public Prescription() {
		super();
	}

	public Prescription(int prescriptionId, int doctorId, int patientId, String medication, String notes) {
		super();
		this.prescriptionId = prescriptionId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.medication = medication;
		this.notes = notes;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	

}
