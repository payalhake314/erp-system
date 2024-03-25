package com.lambda.controllers;

// import com.lambda.dao.StudentDAO;
// import com.lambda.models.Student;

import java.util.List;
import java.util.Map;
import java.util.UUID;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@RestController
public class StudentCtrl {
   /*  @Autowired
    StudentDAO stuDao;

    @GetMapping("/students")
    public @ResponseBody Map<String, Object> getMenu() {
        List<Student> students = stuDao.getAllStudents();

        JSONObject resp = new JSONObject();
        if (students != null) {
            resp.put("msg", "Success");
            resp.put("students", students);
        } else {
            resp.put("err", "Couldn't fetch data");
        }
        return resp.toMap();
    }

    @GetMapping("/students/{id}")
    public @ResponseBody Map<String, Object> getMethodName(@PathVariable String id) {
        JSONObject resp = new JSONObject();
        Student student = stuDao.getSudentById(id);
        if (student != null) {
            resp.put("msg", "Success");
            resp.put("student", student);
        } else {
            resp.put("err", "Couldn't fetch data");
        }
        return resp.toMap();
    }

    @PostMapping("/add-student")
    public @ResponseBody Map<String, Object> addStudent(@RequestBody Student student) {
        student.setId(UUID.randomUUID().toString());
        String[] resp = new String[2];
        resp = stuDao.createStudent(student);
        return new JSONObject().put(resp[0], resp[1]).toMap();
    } */

}
