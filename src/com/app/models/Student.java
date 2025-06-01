package com.app.models;

public class Student extends Person {

    String enrolledCourse;
    char studentGrade;

    public Student(int personID, String personFullName, String personEmailID, int phoneNumber, String enrolledCourse, char studentGrade, String personRole) {
        super(personID, personFullName, personEmailID, phoneNumber, personRole);
        this.enrolledCourse = enrolledCourse;
        this.studentGrade = studentGrade;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }
}
