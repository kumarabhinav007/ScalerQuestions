
/*You are given an integer array A of length N.
        You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
        For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
        More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



        Problem Constraints
        1 <= N, M <= 105
        1 <= A[i] <= 109
        0 <= L <= R < N*/


package org.abhinav.prefixsum;

import java.util.*;
public class RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        long prefixSum[] = new long[A.size()];
        prefixSum[0] = A.get(0);
        for (int i = 1 ; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            int l = B.get(i).get(0);
            int r = B.get(i).get(1);
            if (l == 0) {
                result.add(prefixSum[r]);
            } else {
                result.add(prefixSum[r] - prefixSum[l - 1]);
            }
        }
        return result;
    }
}
