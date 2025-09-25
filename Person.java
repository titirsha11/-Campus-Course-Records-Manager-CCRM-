package edu.ccrm.domain;
import java.time.LocalDate;
public abstract class Person {
    protected String id;
    protected String fullName;
    protected String email;
    protected LocalDate registeredDate;
    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.registeredDate = LocalDate.now();
    }
    
    // Abstract method to print profile
    public abstract void printProfile();
    // Getters and setters (demonstrates encapsulation)
    public String getId() {
        return id;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public LocalDate getRegisteredDate() {
        return registeredDate;
    }
}