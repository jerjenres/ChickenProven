package com.g3appdev.chickenproven.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3appdev.chickenproven.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
