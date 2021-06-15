package com.example.demospring.services;

import com.example.demospring.dto.StudentDto;
import com.example.demospring.models.Student;

import java.util.List;

public interface StudentService {
    public Student save(StudentDto dto) ;
    public List<Student> getAll();
}
