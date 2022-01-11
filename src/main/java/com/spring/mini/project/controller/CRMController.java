package com.spring.mini.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CRMController {

    @GetMapping("/showstudent")
    public String getStudentList()
    {
        return "student-list";
    }
}
