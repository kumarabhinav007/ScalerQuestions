
/*Given an array A of length N, return the subarray from B to C.


        Problem Constraints
        1 <= N <= 105

        1 <= A[i] <= 109

        0 <= B <= C < N*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;
public class SubarrayInGivenRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = B; i <= C; i++) {
            result.add(A.get(i));
        }
        return result;
    }
}
