
/*You are given an array A of integers of size N.

        Your task is to find the equilibrium index of the given array

        The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

        If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

        Note:

        Array indexing starts from 0.
        If there is no equilibrium index then return -1.
        If there are more than one equilibrium indexes then return the minimum index.


        Problem Constraints
        1 <= N <= 105
        -105 <= A[i] <= 105*/


package org.abhinav.prefixsum;

import java.util.*;

public class EquilibriumIndexOfAnArray {
    public int solve(ArrayList<Integer> A) {
        if (A.size() == 1) {
            return 0;
        }
        long prefixSum[] = new long[A.size()];
        prefixSum[0] = A.get(0);
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        if (prefixSum[prefixSum.length - 1] - prefixSum[0] == 0) {
            return 0;
        }
        for (int i = 1; i < prefixSum.length - 1; i++) {
            if (prefixSum[i - 1] == prefixSum[prefixSum.length - 1] - prefixSum[i]) {
                return i;
            }
        }
        if (prefixSum[prefixSum.length - 2] == 0) {
            return prefixSum.length - 1;
        }
        return -1;
    }
}
