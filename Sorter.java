/*
 * File Name:               Sorter.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public interface Sorter<E extends Number & Comparable<E>> {
    abstract void sort(ArrayList<Item<E>> list);
}
