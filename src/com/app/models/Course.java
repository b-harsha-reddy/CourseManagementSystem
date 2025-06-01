package com.app.models;

public class Course {

    private int courseId;
    private String courseName;
    private double courseFee;
    public Course(int courseId,String courseName,double courseFee){
        this.courseId =courseId;
        this.courseName =courseName;
        this.courseFee =courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseFee(double courseFee) {
        if (courseFee < 0) {
            throw new IllegalArgumentException("Course fee must be positive.");
        }
        this.courseFee = courseFee;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString(){

        return "\n Course  Details:" +
                "\n ID           : " + courseId +
                "\n Name         : " + courseName +
                "\n Fees     : " + courseFee;
    }
}
