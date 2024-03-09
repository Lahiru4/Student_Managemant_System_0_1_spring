package com.example.student_managemant_system_0_1.repo;

import com.example.student_managemant_system_0_1.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity, Integer> {

}
