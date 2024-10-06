package com.g3appdev.chickenproven.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.g3appdev.chickenproven.Entity.Student;
import com.g3appdev.chickenproven.Service.StudentService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Endpoint to return a greeting message
    @GetMapping("/printHello")
    public String print() {
        return "Hello";
    }

    // Create a new student
    @PostMapping("/addStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // Read all students
    @GetMapping("/readAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //update of CRUD
    @PutMapping("/updateStudentRecord")
    public Student updateStudentRecord(@RequestParam int student_id, @RequestBody Student newStudent) {
        return studentService.updateStudentRecord(student_id, newStudent);
    }

    //delete of CRUD
    @DeleteMapping("/deleteStudent/{student_id}")
    public String deleteStudent(@PathVariable int student_id){
        return studentService.deleteStudent(student_id);
    }

}