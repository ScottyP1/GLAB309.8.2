package com.glab309_8_2.service;

import com.glab309_8_2.model.DTO.StudentDTO;
import com.glab309_8_2.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

