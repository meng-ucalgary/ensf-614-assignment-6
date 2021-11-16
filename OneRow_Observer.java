/*
 * File Name:               OneRow_Observer.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise E
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class OneRow_Observer implements Observer {
    private Subject subject;
    private ArrayList<Double> temp;

    OneRow_Observer(Subject s) {
        this.subject = s;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        System.out.println("\nNotification to One-Row Table Observer: Data Changed:");
        this.temp = arr;
        this.display();
    }

    public void display() {
        for (int i = 0; i < this.temp.size(); i++) {
            System.out.printf("%.1f ", this.temp.get(i));
        }

        System.out.println("\n");
    }
}
