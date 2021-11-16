/*
 * File Name:               FiveRowsTable_Observer.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise E
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    private Subject subject;
    private ArrayList<Double> temp;

    FiveRowsTable_Observer(Subject s) {
        this.subject = s;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
        this.temp = arr;
        this.display();
    }

    public void display() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < this.temp.size(); i = i+5) {
            sb.append(String.format("%.1f\t", this.temp.get(i)));
        }

        sb.append("\n");

        for (int i = 1; i < this.temp.size(); i = i+5) {
            sb.append(String.format("%.1f\t", this.temp.get(i)));
        }

        sb.append("\n");

        for (int i = 2; i < this.temp.size(); i = i+5) {
            sb.append(String.format("%.1f\t", this.temp.get(i)));
        }

        sb.append("\n");

        for (int i = 3; i < this.temp.size(); i = i+5) {
            sb.append(String.format("%.1f\t", this.temp.get(i)));
        }

        sb.append("\n");

        for (int i = 4; i < this.temp.size(); i = i+5) {
            sb.append(String.format("%.1f\t", this.temp.get(i)));
        }

        sb.append("\n");

        System.out.println(sb.toString());
    }
}
