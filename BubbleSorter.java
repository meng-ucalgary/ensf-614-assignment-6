/*
 * File Name:               BubbleSorter.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getItem().compareTo(list.get(j + 1).getItem()) > 0) {
                    Item<E> temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
