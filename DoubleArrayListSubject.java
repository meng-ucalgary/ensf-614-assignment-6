/*
 * File Name:               DoubleArrayListSubject.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise E
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    private ArrayList<Observer> observers;
    public ArrayList<Double> data;

    DoubleArrayListSubject() {
        this.data = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
        o.update(this.data);
    }

    @Override
    public void remove(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : this.observers) {
            o.update(this.data);
        }
    }

    public void addData(Double element) {
        this.data.add(element);
        this.notifyAllObservers();
    }

    public void setData(Double value, int index) {
        this.data.set(index, value);
        this.notifyAllObservers();
    }

    public void populate(double[] arr) {
        for(int i=0; i<arr.length; i++) {
            this.data.add(arr[i]);
        }

        this.notifyAllObservers();
    }

    public void display() {
        if(this.data.size() == 0) {
            System.out.printf("Empty list...");
        }

        for(int i=0; i<this.data.size(); i++) {
            System.out.printf("%.2f ", this.data.get(i));
        }

        System.out.println();
    }
}
