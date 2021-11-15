/*
 * File Name:               InsertionSorter.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        for (int i = 0; i < list.size(); i++) {
            Item<E> key = list.get(i);
            int j = i - 1;

            while (j >= 0 && (list.get(j).getItem().compareTo(key.getItem()) > 0)) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }

            list.set(j + 1, key);
        }
    }
}
