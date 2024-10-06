package com.g3appdev.chickenproven.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3appdev.chickenproven.Entity.Attendance;




@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}
