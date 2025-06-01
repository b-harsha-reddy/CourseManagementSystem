package com.app.models;

import com.app.models.Person;

public class Instructor extends Person {
    String assignedCourse;

    public Instructor(int personID, String personFullName, String personEmailID, int phoneNumber, String assignedCourse, String personRole) {
        super(personID, personFullName, personEmailID, phoneNumber, personRole);
        this.assignedCourse = assignedCourse;
    }

    public String getAssignedCourse() {
        return assignedCourse;
    }

    public void setAssignedCourse(String assignedCourse) {
        this.assignedCourse = assignedCourse;
    }
}
