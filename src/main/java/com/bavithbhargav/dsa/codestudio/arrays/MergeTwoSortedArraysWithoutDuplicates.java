package com.bavithbhargav.dsa.codestudio.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArraysWithoutDuplicates {

    // https://www.naukri.com/code360/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> ansList = new ArrayList<>();

        int firstListPointer = 0;
        int secondListPointer = 0;

        while (firstListPointer < a.length && secondListPointer < b.length) {
            if (a[firstListPointer] < b[secondListPointer]) {
                if (ansList.size() > 0 && ansList.get(ansList.size() - 1) == a[firstListPointer]) {
                    firstListPointer++;
                } else {
                    ansList.add(a[firstListPointer]);
                    firstListPointer++;
                }
            } else if (a[firstListPointer] > b[secondListPointer]) {
                if (ansList.size() > 0 && ansList.get(ansList.size() - 1) == b[secondListPointer]) {
                    secondListPointer++;
                } else {
                    ansList.add(b[secondListPointer]);
                    secondListPointer++;
                }
            } else {
                if (ansList.size() > 0 && ansList.get(ansList.size() - 1) == b[secondListPointer]) {
                    firstListPointer++;
                    secondListPointer++;
                } else {
                    ansList.add(a[firstListPointer]);
                    firstListPointer++;
                    secondListPointer++;
                }
            }
        }

        while (firstListPointer < a.length) {
            if (ansList.size() > 0 && a[firstListPointer] == ansList.get(ansList.size() - 1)) {
                firstListPointer++;
                continue;
            }
            ansList.add(a[firstListPointer]);
            firstListPointer++;
        }

        while (secondListPointer < b.length) {
            if (ansList.size() > 0 && b[secondListPointer] == ansList.get(ansList.size() - 1)) {
                secondListPointer++;
                continue;
            }
            ansList.add(b[secondListPointer]);
            secondListPointer++;
        }

        return ansList;
    }

}
