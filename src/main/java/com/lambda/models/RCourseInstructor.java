package com.lambda.models;

public class RCourseInstructor {
    private String instId;
    private String courseId;
    private String courseName;
    private short lecPerWeek;

    public RCourseInstructor(String instId, String courseId, String courseName, short lecPerWeek) {
        this.instId = instId;
        this.courseId = courseId;
        this.courseName = courseName;
        this.lecPerWeek = lecPerWeek;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public short getLecPerWeek() {
        return lecPerWeek;
    }

    public void setLecPerWeek(short lecPerWeek) {
        this.lecPerWeek = lecPerWeek;
    }
}
