package com.g3appdev.chickenproven.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.g3appdev.chickenproven.Entity.Attendance;
import com.g3appdev.chickenproven.Service.AttendanceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    
    @GetMapping("/printHello")
    public String print() {
        return "Hello, Piolo Frances Enriquez!";
    }

    
    @PostMapping("/addAttendance")
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceService.createAttendance(attendance);
    }

    
    @GetMapping("/readAllAttendances")
    public List<Attendance> getAllAttendance(){
        return attendanceService.getAllAttendance();
    }

    //update of CRUD
    @PutMapping("/updateAttendance")
    public Attendance updateAttendanceRecord(@RequestParam int attendance_id, @RequestBody Attendance newAttendance) {
        return attendanceService.updateAttendanceRecord(attendance_id, newAttendance);
    }

    //delete of CRUD
    @DeleteMapping("/deleteAttendance/{attendance_Id}")
    public String deleteAttendance(@PathVariable int attendance_Id){
        return attendanceService.deleteAttendance(attendance_Id);
    }
}
