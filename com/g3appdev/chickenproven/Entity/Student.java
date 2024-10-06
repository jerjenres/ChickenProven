package com.g3appdev.chickenproven.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblStudent")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private int student_id;

    private String name;
    private String email;
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student_id", cascade = CascadeType.ALL)
    private List<Attendance> attendance;
    
    public Student() {
    super();
    }
    
    public Student(int studentId, String name, String email, String password) {
    this.student_id = studentId;
    this.name = name;
    this.email = email;
    this.password = password;
    
    }
    // Getters and Setters
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int studentId) {
        this.student_id = studentId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    // public List<Attendance> getAttendanceList(){
    //     return attendance;
    // }

    // public void setAttendanceList(List<Attendance> attendanceList){
    //     this.attendance = attendanceList;
    // }
}