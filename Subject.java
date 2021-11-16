/*
 * File Name:               Subject.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise E
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

public interface Subject {
    public void registerObserver(Observer o);

    public void remove(Observer o);

    public void notifyAllObservers();
}
