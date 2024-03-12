package com.lambda.models;

public class RStudentCourse {
    private String guId;
    private String courseId;
    private String courseName;
    private short erdCredits;
    private short credits;

    public RStudentCourse(String guId, String courseName, String courseId, short erdCredits, short credits) {
        this.guId = guId;
        this.courseName = courseName;
        this.courseId = courseId;
        this.erdCredits = erdCredits;
        this.credits = credits;
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

    public String getGuId() {
        return guId;
    }

    public void setGuId(String guId) {
        this.guId = guId;
    }

    public short getCredits() {
        return credits;
    }

    public void setCredits(short credits) {
        this.credits = credits;
    }

    public short getErdCredits() {
        return erdCredits;
    }

    public void setErdCredits(short erdCredits) {
        this.erdCredits = erdCredits;
    }

}
