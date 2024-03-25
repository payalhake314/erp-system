package com.lambda.models;

import java.util.Date;

import com.lambda.models.options.Gender;
import com.lambda.models.options.Role;
import com.lambda.models.options.Status;

public class User {
    private String userName;
    private String fullName;
    private String userId;
    private String email;
    private String password;
    private String address;
    private String contact;
    private Role role;
    private Date doj;
    private Date dol;
    private float Salary; 
    private Date dob;
    private Status status;
    private Gender gender;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Date getDob() {
        return dob;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDol(Date dol) {
        this.dol = dol;
    }
    public Date getDol() {
        return dol;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    public void setSalary(float salary) {
        Salary = salary;
    }
    public float getSalary() {
        return Salary;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullname) {
        this.fullName = fullname;
    }
}
