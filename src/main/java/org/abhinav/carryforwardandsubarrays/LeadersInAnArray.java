
/*Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

        NOTE: The rightmost element is always a leader.


        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 108*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;

public class LeadersInAnArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = A.get(A.size() - 1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(max);
        for (int i = A.size() - 2; i >= 0; i--) {
            if (A.get(i) > max) {
                result.add(A.get(i));
            }
            max = Math.max(max, A.get(i));
        }
        return result;
    }
}