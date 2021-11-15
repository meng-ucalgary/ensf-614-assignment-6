/*
 * File Name:               SelectionSorter.java
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise C and D
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

import java.util.ArrayList;

public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getItem().compareTo(list.get(min_idx).getItem()) < 0) {
                    min_idx = j;
                }
            }

            Item<E> temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        }
    }
}
