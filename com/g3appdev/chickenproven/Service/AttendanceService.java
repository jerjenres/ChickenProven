package com.g3appdev.chickenproven.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.g3appdev.chickenproven.Entity.Attendance;
import com.g3appdev.chickenproven.Repository.AttendanceRepository;
import java.util.List;


@Service
public class AttendanceService {

    @Autowired
    AttendanceRepository arepo;

    public AttendanceService() {
        super();
    }

    // Create or save a new attendance record
    public Attendance createAttendance(Attendance attendance) {
        return arepo.save(attendance);
    }

    // Read all attendance records
    public List<Attendance> getAllAttendance() {
        return arepo.findAll();
    }

    @SuppressWarnings("finally")
    public Attendance updateAttendanceRecord(int attendance_id, Attendance newAttendance) {
        Attendance attendanceEntity = new Attendance();
        
        try {
            attendanceEntity = arepo.findById(attendance_id).get();
            attendanceEntity.setPassword(newAttendance.getPassword());
            attendanceEntity.setStatus(newAttendance.getStatus());
            attendanceEntity.setSignInTime(newAttendance.getSignInTime());
            attendanceEntity.setSignOutTime(newAttendance.getSignOutTime());
            attendanceEntity.setStudentID(newAttendance.getStudentID());
            
         } catch(Exception e) {
                throw new Exception("Attendance record " + attendance_id + " not found");
        }finally{
            return arepo.save(attendanceEntity);
        }
}
    

    //delete of CRUD
    @SuppressWarnings("unused")
    public String deleteAttendance(int attendance_id){
        String msg = "";
        if(arepo.findById(attendance_id) != null){
            arepo.deleteById(attendance_id);
            msg = "Attendance successfully deleted";
        }else{
            msg = attendance_id + "NOT Found!";
        }
        return msg;
    }
}
