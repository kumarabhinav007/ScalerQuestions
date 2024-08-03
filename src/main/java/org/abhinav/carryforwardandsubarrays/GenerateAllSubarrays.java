
/*You are given an array A of N integers.
        Return a 2D array consisting of all the subarrays of the array

        Note : The order of the subarrays in the resulting 2D array does not matter.


        Problem Constraints
        1 <= N <= 100
        1 <= A[i] <= 105*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;
public class GenerateAllSubarrays {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    arr.add(A.get(k));
                }
                result.add(arr);
            }
        }
        return result;
    }
}
