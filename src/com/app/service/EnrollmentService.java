package com.app.service;

import com.app.models.*;

import java.util.ArrayList;

public class EnrollmentService {

    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Instructor> instructors = new ArrayList<>();

    public void createStudent(String loggedInUser,int personID,String personFullName,String personEmailID,int phoneNumber,String enrolledCourse,char studentGrade,String personRole){
        if(!"Admin".equalsIgnoreCase(loggedInUser)){

            throw new RuntimeException("Logged in user is not Admin");
        }
        Student newStudent = new Student(personID,personFullName,personEmailID,phoneNumber,enrolledCourse,studentGrade,personRole);
        students.add(newStudent);
        System.out.println("Course created: " + newStudent.getPersonFullName());


    }
    public void createCourse(int courseId, String courseName, double courseFee) {
        Course newCourse = new Course(courseId, courseName, courseFee);
        courses.add(newCourse);
        System.out.println("Course created: " + newCourse.getCourseName());
    }
    public void createInstructor(String loggedInUser, int personID, String personFullName, String personEmailID,
                                 int phoneNumber, String assignedCourse, String personRole){

        if (!"Admin".equalsIgnoreCase(loggedInUser)) {
            throw new RuntimeException("Only Admin can create instructors.");
        }

        Instructor newInstructor = new Instructor(personID, personFullName, personEmailID, phoneNumber, assignedCourse, personRole);
        instructors.add(newInstructor);
        System.out.println("Instructor created: " + newInstructor.getPersonFullName());
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
