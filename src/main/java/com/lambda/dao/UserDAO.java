package com.lambda.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lambda.models.User;

import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.annotation.PostConstruct;

@Repository
public class UserDAO {
    @Autowired
    JdbcTemplate jdbcTmp;

    @PostConstruct
    public void createTable() {
        try {
            String query = "create table if not exists users( username varchar(63) unique, userid varchar(36) primary key, fullname varchar(123), contact varchar(10) unique, email varchar(123) unique, address varchar(255), password varchar(255), dob date, doj date, dol date, salary decimal, role enum('STUDENT','FACULTY','ADMIN'), gender enum('MALE','FEMALE'), status enum('ACTIVE','INACTIVE') );";
            int code = jdbcTmp.update(query);
            if (code != 0) {
                System.out.println("Student table created");
            } else {
                System.out.println("Student table already exists code: " + code);
            }

        } catch (DataAccessException e) {
            System.out.println("Failed to create users table: " + e.getMessage());
        }
    }

    public String[] addUser(User user) {
        String[] resp = new String[2];
        try {
            user.setPassword(BCrypt.withDefaults().hashToString(5, user.getPassword().toCharArray()));
            jdbcTmp.update(
                    "insert into users(userid, username, email, password, contact, address, role, dob, doj, dol, gender, fullname, salary, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    user.getUserId(), user.getUserName(), user.getEmail(), user.getPassword(), user.getContact(),
                    user.getAddress(), user.getRole().name(), user.getDob(), user.getDoj(), user.getDol(),
                    user.getGender().name(), user.getFullName(), user.getSalary(), user.getStatus().name());
            resp[0] = "msg";
            resp[1] = "Added user with username: " + user.getUserName();
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            resp[0] = "msg";
            resp[1] = "Failed to register user";
        }
        return resp;
    }

    public User getUser(String identif) {
        User user = null;
        try {
            String query = "select username, password from users where username = :identif or email = :identif";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("identif", identif);
            user = new NamedParameterJdbcTemplate(jdbcTmp).queryForObject(query, params, new BeanPropertyRowMapper<User>(User.class));
        } catch (DataAccessException exp) {
            // TODO: handle exception
            System.out.println(exp.getMessage());
        }
        return user;
    }
}
