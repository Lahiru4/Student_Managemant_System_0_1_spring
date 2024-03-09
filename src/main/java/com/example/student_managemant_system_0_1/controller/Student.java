package com.example.student_managemant_system_0_1.controller;

import com.example.student_managemant_system_0_1.dto.StudentDTO;
import com.example.student_managemant_system_0_1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class Student {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public ResponseEntity getStudent(){
        return new ResponseEntity(studentService.getAllStudent(), HttpStatus.OK);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveStudent(@RequestBody StudentDTO studentDTO){
        StudentDTO saveStudent = studentService.saveStudent(studentDTO);
        System.out.println(saveStudent);
        return new ResponseEntity(saveStudent, HttpStatus.OK);
    }
    @GetMapping("/selected/{id}")
    public ResponseEntity getSelectedStudent(@PathVariable("id") String id){
        System.out.println(id);
        return new ResponseEntity(studentService.getSelectedStudent(id),HttpStatus.OK);
    }
}
