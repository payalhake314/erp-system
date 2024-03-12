package com.lambda.models;

import java.util.Date;

import com.lambda.models.options.Gender;
import com.lambda.models.options.Status;

public class Faculty {

    private String id;
    private String fullName;
    private Float salary;
    private Status status;
    private String address;
    private String email;
    private String contact;
    private Gender gender;
    private Date doj;
    private Date dol;

    // public Faculty(String id, String email, String contact, String email, String
    // address, Status status, Date doj, Date dol, Float salary, Gender gender) {

    // }

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

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Date getDol() {
        return dol;
    }

    public void setDol(Date dol) {
        this.dol = dol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
