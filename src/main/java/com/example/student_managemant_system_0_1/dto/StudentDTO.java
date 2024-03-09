package com.example.student_managemant_system_0_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements SuperDTO {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}
