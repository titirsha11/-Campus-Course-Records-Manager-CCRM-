package edu.ccrm.domain.enums;
public enum Grade {
    S(10), A(9), B(8), C(7), D(6), F(0);
    
    private int gradePoints;
    
    Grade(int gradePoints) {
        this.gradePoints = gradePoints;
    }
    
    public int getGradePoints() {
        return gradePoints;
    }
}  