package edu.ccrm.service;
import edu.ccrm.domain.Course;
import edu.ccrm.domain.enums.Semester;
import java.util.ArrayList;
import java.util.List;
public class CourseService {
    // Dummy list to store courses
    private List<Course> courses = new ArrayList<>();
    
    public void manageCourses() {
        // For demo: Create a course using the Builder pattern
        Course course = new Course.Builder()
                .code("CS101")
                .title("Introduction to Programming")
                .credits(4)
                .instructor("Dr. Smith")
                .semester(Semester.FALL)
                .department("Computer Science")
                .build();
        courses.add(course);
        System.out.println("Course Added: " + course);
    }
    
    // Additional methods such as search, update, deactivate, etc.
}