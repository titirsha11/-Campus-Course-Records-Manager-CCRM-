package edu.ccrm.service;
import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;
public class StudentService {
    // Dummy list to store students
    private List<Student> students = new ArrayList<>();
    
    public void manageStudents() {
        // For demo purposes: Add a sample student and print profile
        Student s = new Student("001", "Alice Johnson", "alice@example.com", "REG2023001");
        students.add(s);
        s.printProfile();
        
        // Additional operations (update, deactivate, enrollment) can be added later.
    }
    
    // Additional methods such as addStudent, updateStudent, deactivateStudent, etc.
}