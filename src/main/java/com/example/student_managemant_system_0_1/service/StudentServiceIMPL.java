package com.example.student_managemant_system_0_1.service;

import com.example.student_managemant_system_0_1.dto.StudentDTO;
import com.example.student_managemant_system_0_1.entity.StudentEntity;
import com.example.student_managemant_system_0_1.repo.StudentDao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceIMPL implements StudentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private StudentDao studentDao;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        StudentEntity save = studentDao.save(modelMapper.map(studentDTO, StudentEntity.class));
        return modelMapper.map(save, StudentDTO.class);
    }

    @Override
    public StudentDTO getSelectedStudent(String id) {
        /*System.out.println(id);
        Iterator<StudentDTO> iterator = students_List.iterator();
        while (iterator.hasNext()) {
            StudentDTO studentDTO = iterator.next();
            if (studentDTO.getId().equals(id)) {
                System.out.println(studentDTO);
                return studentDTO;
            }
        }*/
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return null;
    }

   /* @Override
    public List<StudentDTO> getAllStudent() {
        return students_List;
    }*/

}
