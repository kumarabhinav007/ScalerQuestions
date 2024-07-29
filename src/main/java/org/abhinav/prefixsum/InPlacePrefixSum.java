
/*Given an array A of N integers. Construct prefix sum of the array in the given array itself.


        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 103*/


package org.abhinav.prefixsum;

import java.util.*;

public class InPlacePrefixSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i - 1) + A.get(i));
        }
        return A;
    }
}
