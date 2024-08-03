
/*You are given an integer array A of size N.

        You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

        Find and return the maximum possible sum of the B elements that were removed after the B operations.

        NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

        Remove 3 elements from front and 0 elements from the back, OR
        Remove 2 elements from front and 1 element from the back, OR
        Remove 1 element from front and 2 elements from the back, OR
        Remove 0 elements from front and 3 elements from the back.


        Problem Constraints
        1 <= N <= 105

        1 <= B <= N

        -103 <= A[i] <= 103*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;
public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int prefixSum[] = new int[A.size()];
        prefixSum[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        int ans = 0;
        if (B == A.size()) {
            ans = prefixSum[A.size() - 1];
        } else {
            ans = prefixSum[A.size() - 1] - prefixSum[A.size() - B - 1];
        }
        for (int i = 0; i < B; i++) {
            ans = Math.max(ans, prefixSum[i] + prefixSum[A.size() - 1] - prefixSum[A.size() - B + i]);
        }
        return ans;
    }
}
