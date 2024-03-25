package com.lambda.controllers;

import java.util.Map;
import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lambda.dao.UserDAO;
import com.lambda.models.User;

import at.favre.lib.crypto.bcrypt.BCrypt;
import at.favre.lib.crypto.bcrypt.BCrypt.Result;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserCtrl {
    @Autowired
    UserDAO dao;

    @PostMapping("/users/register")
    public @ResponseBody Map<String, Object> postMethodName(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        String[] resp = dao.addUser(user);
        JSONObject obj = new JSONObject();
        obj.put(resp[0], resp[1]);

        return obj.toMap();
    }

    @GetMapping("/users/login")
    public @ResponseBody Map<String, Object> getMethodName(@RequestBody Map<String, String> data) {
        User user = dao.getUser(data.get("identifier"));
        Result res = BCrypt.verifyer().verify(data.get("password").toCharArray(), user.getPassword());
        System.out.println("Password status: " + res.verified);
        return new JSONObject().put("resp", user).toMap();
    }

}
