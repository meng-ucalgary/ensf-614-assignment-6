/*
 * File Name:               MyVector.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class MyVector<E extends Number & Comparable<E>> {
    private ArrayList<Item<E>> storageM;
    private Sorter<E> sorter;

    MyVector(int n) {
        this.storageM = new ArrayList<>(n);
    }

    MyVector(ArrayList<Item<E>> arr) {
        this.storageM = new ArrayList<>(arr.size());

        for (Item<E> i : arr) {
            this.storageM.add(i);
        }
    }

    public void add(Item<E> value) {
        this.storageM.add(value);
    }

    public void setSortStrategy(Sorter<E> s) {
        this.sorter = s;
    }

    public void performSort() {
        this.sorter.sort((this.storageM));
    }

    public void display() {
        for(Item<E> i : this.storageM) {
            if(i.getItem() instanceof Integer) {
                System.out.printf("%d ", i.getItem());
            }

            else {
                System.out.printf("%.2f ", i.getItem());
            }
        }
    }
}
