package com.g3appdev.chickenproven.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "")
    private int attendance_id;

    
    private String password;
    private LocalDate date;
    private String status;
    private LocalDateTime signInTime;
    private LocalDateTime signOutTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "student_id")
    @JsonIgnore
    private Student student_id;
    
    public Attendance() {
        super();
    }

    // Constructor with parameters
    public Attendance(int attendance_id, Student student_id, String password, LocalDate date, String status, LocalDateTime signInTime, LocalDateTime signOutTime) {
        super();
        this.attendance_id = attendance_id;
        this.student_id = student_id;
        this.password = password;
        this.date = date;
        this.status = status;
        this.signInTime = signInTime;
        this.signOutTime = signOutTime;
    }

    // Getters and Setters
    public int getAttendanceID() {
        return attendance_id;
    }

    public void setAttendanceID(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    public Student getStudentID() {
        return student_id;
    }

    public void setStudentID(Student student_id) {
        this.student_id = student_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(LocalDateTime signInTime) {
        this.signInTime = signInTime;
    }

    public LocalDateTime getSignOutTime() {
        return signOutTime;
    }

    public void setSignOutTime(LocalDateTime signOutTime) {
        this.signOutTime = signOutTime;
    }
    
    
}
