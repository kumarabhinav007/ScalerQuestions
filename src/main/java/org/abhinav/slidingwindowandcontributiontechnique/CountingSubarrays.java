
/*Given an array A of N non-negative numbers and a non-negative number B,
        you need to find the number of subarrays in A with a sum less than B.
        We may assume that there is no overflow.



        Problem Constraints
        1 <= N <= 5 x 10^3

        1 <= A[i] <= 1000

        1 <= B <= 10^7*/


package org.abhinav.slidingwindowandcontributiontechnique;

import java.util.*;

public class CountingSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int prefixSum[] = new int[A.size()];
        prefixSum[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        int ans = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i; j < prefixSum.length; j++) {
                if (i == 0) {
                    if (prefixSum[j] < B) {
                        ans++;
                    }
                } else {
                    if (prefixSum[j] - prefixSum[i - 1] < B) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
