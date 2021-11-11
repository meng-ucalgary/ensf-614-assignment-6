/*
 * File Name:               Item.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

class Item<E extends Number & Comparable<E>> {
    private E item;

    public Item(E value) {
        item = value;
    }

    public void setItem(E value) {
        item = value;
    }

    public E getItem() {
        return item;
    }
}
