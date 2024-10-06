package com.g3appdev.chickenproven.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3appdev.chickenproven.Entity.Student;
import com.g3appdev.chickenproven.Repository.StudentRepository;

import java.util.List;
import java.util.NoSuchElementException;

import javax.naming.NameNotFoundException;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    
    public StudentService() {
        super();
    }

    // Create or save a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @SuppressWarnings("finally")
    public Student updateStudentRecord(int student_id, Student newStudent) {
        Student studentEntity = new Student();
        
        try {
            studentEntity = studentRepository.findById(student_id).get();
            
            studentEntity.setname(newStudent.getname());
            studentEntity.setemail(newStudent.getemail());
            studentEntity.setpassword(newStudent.getpassword());

        } catch (NoSuchElementException nex) {
            throw new NameNotFoundException("Student" + student_id + "not found");
        }finally{
            return studentRepository.save(studentEntity);
        }
    }

    //delete of CRUD

    @SuppressWarnings("unused")
    public String deleteStudent(int student_id){
        String msg = "";
        if(studentRepository.findById(student_id) != null){
            studentRepository.deleteById(student_id);
            msg = "Student record successfully deleted";
        }else{
            msg = student_id + "NOT Found!";
        }
        return msg;
    }
}