package com.lambda.models;

import java.util.Date;

import com.lambda.models.options.Gender;
import com.lambda.models.options.Status;

public class Student {

    private String fullName;
    private String id;
    private String email;
    private Gender gender;
    private String contact;
    private Status status;
    private String address;
    private Date dob;
    private Date dol;
    private Date doj;

    public Student(String fullName, String email ,Gender gender, Date dob, String id, String contact, Status status, Date doj,
            Date dol,
            String address) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.contact = contact;
        this.status = status;
        this.dob = dob;
        this.doj = doj;
        this.dol = dol;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

}
