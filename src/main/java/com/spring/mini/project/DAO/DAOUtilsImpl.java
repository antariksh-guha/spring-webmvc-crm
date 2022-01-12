package com.spring.mini.project.DAO;

import com.spring.mini.project.config.AppConfig;
import com.spring.mini.project.mapper.StudentRowMapper;
import com.spring.mini.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DAOUtilsImpl implements DAOUtils{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents() {

        List<Student> studentList = new ArrayList<Student>();
        String sql="select * from students";

        List<Student> query = jdbcTemplate.query(sql, new StudentRowMapper());

        return query;
    }
}
