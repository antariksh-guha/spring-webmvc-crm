package com.spring.mini.project.DAO;

import com.spring.mini.project.DTO.StudentDTO;
import com.spring.mini.project.model.Student;

import java.util.List;

public interface DAOUtils {

    public List<Student> loadStudents();
    void saveStudent(StudentDTO studentDTO);
}
