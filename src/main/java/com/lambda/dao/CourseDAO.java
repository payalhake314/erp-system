package com.lambda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class CourseDAO {
    @Autowired
    JdbcTemplate jdbcTmp;

    @PostConstruct
    public void createTables() {
        int code = jdbcTmp.update(
                "create table if not exists courses( id varchar(36) primary key, faculty_id varchar(36), course_name varchar(40), credits tinyint, description varchar(255), foreign key (faculty_id) references users(userid) );");
        if (code != 0) {
            System.out.println("Course table created");
        } else {
            System.out.println("Course table already exists code: " + code);
        }

    }
}
