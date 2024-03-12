package com.lambda.models;

public class Course {
    private String courseName;
    private String id;
    private short credits;
    private String description;
    private String facultyId;

    public Course() {
    }

    public Course(String courseName, String id, short credits, String description, String facultyId) {
        this.courseName = courseName;
        this.id = id;
        this.credits = credits;
        this.description = description;
        this.facultyId = facultyId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String courseId) {
        this.id = courseId;
    }

    public short getCredits() {
        return credits;
    }

    public void setCredits(short credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
}
