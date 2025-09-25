package edu.ccrm.domain;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person {
    private String regNo;
    private boolean isActive;
    private List<String> enrolledCourses;
    
    public Student(String id, String fullName, String email, String regNo) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.isActive = true;
        this.enrolledCourses = new ArrayList<>();
    }
    
    public void enrollCourse(String courseCode) {
        // Business rule check: maximum credit checks can be added here
        enrolledCourses.add(courseCode);
    }
    
    public void unenrollCourse(String courseCode) {
        enrolledCourses.remove(courseCode);
    }
    
    @Override
    public void printProfile() {
        System.out.println("--- Student Profile ---");
        System.out.println("ID: " + id);
        System.out.println("RegNo: " + regNo);
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Registered: " + registeredDate);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Enrolled Courses: " + (enrolledCourses.isEmpty() ? "None" : enrolledCourses));
    }
    
    // Getters and Setters
    public String getRegNo() {
        return regNo;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void deactivate() {
        this.isActive = false;
    }
    
    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }
}