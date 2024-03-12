package com.lambda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lambda.models.Faculty;


import jakarta.annotation.PostConstruct;

@Repository
public class FacultyDAO {
    @Autowired
    JdbcTemplate jdbcTmp;

    public FacultyDAO() {
    }

    @PostConstruct
    public void createTables() {
        int code = jdbcTmp.update(
                "create table if not exists faculties( id varchar(36) primary key, full_name varchar(127), gender enum(\"MALE\", \"FEMALE\"), contact varchar(10), address varchar(127), email varchar(50) unique, status enum(\"ACTIVE\", \"INACTIVE\"), doj date, dol date, salary decimal(9, 3) );");
        if (code != 0) {
            System.out.println("Instructor table created");
        } else {
            System.out.println("Instructor table already exists code: " + code);
        }
    }

    public String[] addInstructor(Faculty instr) {
        String[] resp = new String[2];
        try {
            String query = "insert into faculties (id, full_name, gender, contact, address, email, status, doj, dol, salary) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTmp.update(query, instr.getId(), instr.getFullName(), instr.getGender().name(), instr.getContact(),
                    instr.getAddress(), instr.getEmail(), instr.getStatus().name(), instr.getDoj(), instr.getDol(),
                    instr.getSalary());
            resp[0] = "msg";
            resp[1] = "New Faculty Registered!";
        } catch (DataAccessException exp) {
            System.out.println("Error: " + exp.getMessage());
            resp[0] = "err";
            resp[1] = exp.getMessage();
        }
        return resp;
    }

    public List<Faculty> getFaculties() {
        List<Faculty> faculties = null;
        try {
            faculties = jdbcTmp.query("select * from faculties", new BeanPropertyRowMapper<Faculty>(Faculty.class));
        } catch (DataAccessException exp) {
            System.out.println("Error: " + exp.getMessage());
        }
        return faculties;
    }

    public Faculty getFaculty(String id) {
        Faculty faculty = null;
        try {
            faculty = jdbcTmp.queryForObject("select * from faculties where id = ?",
                    new BeanPropertyRowMapper<>(Faculty.class), id);
        } catch (DataAccessException exp) {
            System.out.println("Error: " + exp.getMessage());
        }
        return faculty;
    }
}
