package com.lambda.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.lambda.dao.FacultyDAO;
import com.lambda.models.Faculty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class FacultyCtrl {
    @Autowired
    FacultyDAO dao;

    @GetMapping("/faculties")
    public @ResponseBody Map<String, Object> getMenu() {
        List<Faculty> faculties = dao.getFaculties();

        JSONObject resp = new JSONObject();
        if (faculties != null) {
            resp.put("msg", "Success");
            resp.put("faculties", faculties);
        } else {
            resp.put("err", "Couldn't fetch data");
        }
        return resp.toMap();
    }

    @GetMapping("/faculties/{id}")
    public @ResponseBody Map<String, Object> getFaculty(@PathVariable String id) {
        Faculty faculty = dao.getFaculty(id);

        JSONObject resp = new JSONObject();
        if (faculty != null) {
            resp.put("msg", "Success");
            resp.put("faculty", faculty);
        } else {
            resp.put("err", "Couldn't fetch data");
        }
        return resp.toMap();
    }

    @PostMapping("/faculties/add")
    public @ResponseBody Map<String, Object> postMethodName(@RequestBody Faculty faculty) {
        // TODO: process POST request
        faculty.setId(UUID.randomUUID().toString());
        String[] resp = dao.addInstructor(faculty);
        JSONObject jobject = new JSONObject();
        jobject.put(resp[0], resp[1]);
        return jobject.toMap();
    }

}
