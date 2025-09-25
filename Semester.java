package edu.ccrm.domain;

public enum Semester {
    SPRING(1, 16),
    SUMMER(2, 6), // Shorter semester
    FALL(3, 16);

    private final int code;
    private final int weeks;

    // Enum Constructor
    Semester(int code, int weeks) {
        this.code = code;
        this.weeks = weeks;
    }

    public int getCode() { return code; }
    public int getWeeks() { return weeks; }
    
    // Method to get max credits (Example business rule)
    public int getMaxCredits() {
        return this.equals(SUMMER) ? 9 : 18;
    }

    @Override
    public String toString() {
        return name() + " (" + code + ")";
    }
}