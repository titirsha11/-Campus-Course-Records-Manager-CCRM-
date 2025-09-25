package edu.ccrm.exception;

/**
 * Custom checked exception for when a student attempts to enroll 
 * in more credits than allowed for the semester.
 */
public class MaxCreditLimitExceededException extends CCRMException {
    private final int maxLimit;
    private final int attemptedCredits;

    public MaxCreditLimitExceededException(String message, int maxLimit, int attemptedCredits) {
        super(message);
        this.maxLimit = maxLimit;
        this.attemptedCredits = attemptedCredits;
    }

    public int getMaxLimit() { return maxLimit; }
    public int getAttemptedCredits() { return attemptedCredits; }
}