package com.app.main;

import com.app.models.*;
import com.app.service.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnrollmentService enrollmentService = new EnrollmentService();
        PaymentService paymentService = new PaymentService();

        while (true) {
            System.out.println("\n--- Course Management System ---");
            System.out.println("1. Create Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Register Instructor");
            System.out.println("4. Make Payment");
            System.out.println("5. Check Payment");
            System.out.println("6. Exit");
            System.out.println("7. View All Courses");
            System.out.println("8. View All Students");

            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Create Course
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Course Fee: ");
                    double courseFee = scanner.nextDouble();
                    enrollmentService.createCourse(courseId, courseName, courseFee);
                    break;

                case 2: // Enroll Student
                    try {
                        System.out.print("Enter Logged-in User (Admin only): ");
                        String user = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Phone: ");
                        int phone = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Enrolled Course: ");
                        String course = scanner.nextLine();
                        System.out.print("Enter Grade: ");
                        char grade = scanner.next().charAt(0);
                        scanner.nextLine();
                        enrollmentService.createStudent(user, studentId, name, email, phone, course, grade, "Student");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3: // Register Instructor
                    try {
                        System.out.print("Enter Logged-in User (Admin only): ");
                        String admin = scanner.nextLine();
                        System.out.print("Enter Instructor ID: ");
                        int instrId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String instrName = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String instrEmail = scanner.nextLine();
                        System.out.print("Enter Phone: ");
                        int instrPhone = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Assigned Course: ");
                        String assignedCourse = scanner.nextLine();
                        enrollmentService.createInstructor(admin, instrId, instrName, instrEmail, instrPhone, assignedCourse, "Instructor");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4: // Make Payment
                    System.out.print("Enter Student ID: ");
                    int sId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name (for lookup): ");
                    String sName = scanner.nextLine();

                    // Dummy student creation (in real case, fetch from list)
                    Student dummyStudent = new Student(sId, sName, "email@domain.com", 12345, "Java", 'A', "Student");

                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    paymentService.newPayment(dummyStudent, amount);
                    break;

                case 5: // Check Payment
                    System.out.print("Enter Student ID to check payment: ");
                    int checkId = scanner.nextInt();
                    scanner.nextLine();
                    String result = paymentService.checkPayment(checkId);
                    System.out.println(result);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                case 7: // View all courses
                    List<Course> allCourses = enrollmentService.getCourses();
                    if (allCourses.isEmpty()) {
                        System.out.println("No courses available.");
                    } else {
                        System.out.println("--- Available Courses ---");
                        for (Course c : allCourses) {
                            System.out.println("ID: " + c.getCourseId() +
                                    ", Name: " + c.getCourseName() +
                                    ", Fee: ₹" + c.getCourseFee());
                        }
                    }
                    break;
                case 8:
                    List<Student> allStudents = enrollmentService.getStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No Students avaialable");

                    } else {
                        System.out.println("--- Available Courses ---");
                        for (Student student : allStudents) {

                            System.out.println(student.toString());

                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
