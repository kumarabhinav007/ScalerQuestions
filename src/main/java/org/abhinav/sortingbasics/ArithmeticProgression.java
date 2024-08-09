
/*Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

        A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.



        Problem Constraints
        2 <= N <= 105

        -10^9 <= A[i] <= 10^9*/


package org.abhinav.sortingbasics;

import java.util.*;

public class ArithmeticProgression {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int d = A.get(0) - A.get(1);
        for (int i = 1; i < A.size() - 1; i++) {
            if (d != A.get(i) - A.get(i + 1)) {
                return 0;
            }
        }
        return 1;
    }
}
