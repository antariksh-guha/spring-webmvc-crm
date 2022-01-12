package com.spring.mini.project.controller;

import com.spring.mini.project.DAO.DAOUtils;
import com.spring.mini.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CRMController {

    @Autowired
    private DAOUtils daoUtils;

    @GetMapping("/showstudent")
    public String getStudentList(Model model)
    {
        List<Student> studentList=daoUtils.loadStudents();
        model.addAttribute("students", studentList);
        return "student-list";
    }
}
