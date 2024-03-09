package com.example.student_managemant_system_0_1.service;

import com.example.student_managemant_system_0_1.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    public StudentDTO saveStudent(StudentDTO studentDTO);

    StudentDTO getSelectedStudent(String id);

    List<StudentDTO> getAllStudent();
}
