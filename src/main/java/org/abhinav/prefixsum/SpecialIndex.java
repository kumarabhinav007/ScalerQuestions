
/*Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



        Problem Constraints
        1 <= N <= 105
        -105 <= A[i] <= 105
        Sum of all elements of A <= 109*/


package org.abhinav.prefixsum;

import java.util.*;

public class SpecialIndex {
    public int solve(ArrayList<Integer> A) {
        int pfe[] = new int[A.size()];
        pfe[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (i % 2 == 0) {
                pfe[i] = pfe[i - 1] + A.get(i);
            } else {
                pfe[i] = pfe[i - 1];
            }
        }
        int pfo[] = new int[A.size()];
        for (int i = 1; i < A.size(); i++) {
            if (i % 2 != 0) {
                pfo[i] = pfo[i - 1] + A.get(i);
            } else {
                pfo[i] = pfo[i - 1];
            }
        }
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            int sumEven = 0, sumOdd = 0;
            if (i == 0) {
                sumEven = pfo[A.size() - 1] - pfo[0];
                sumOdd = pfe[A.size() - 1] - pfe[0];
            } else {
                sumEven = pfe[i - 1] + pfo[A.size() - 1] - pfo[i];
                sumOdd = pfo[i - 1] + pfe[A.size() - 1] - pfe[i];
            }
            if (sumEven == sumOdd) {
                count++;
            }
        }
        return count;
    }
}
