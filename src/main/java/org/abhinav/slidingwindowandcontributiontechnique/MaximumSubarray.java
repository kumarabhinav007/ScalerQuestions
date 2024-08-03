
/*You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
        But the sum must not exceed B.


        Problem Constraints
        1 <= A <= 10^3
        1 <= B <= 10^9
        1 <= C[i] <= 10^6*/


package org.abhinav.slidingwindowandcontributiontechnique;

import java.util.*;

public class MaximumSubarray {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int prefixSum[] = new int[C.size()];
        prefixSum[0] = C.get(0);
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + C.get(i);
        }
        int ans = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i; j < prefixSum.length; j++) {
                if (i == 0) {
                    if (prefixSum[j] <= B) {
                        ans = Math.max(ans, prefixSum[j]);
                    }
                } else {
                    if (prefixSum[j] - prefixSum[i - 1] <= B) {
                        ans = Math.max(ans, prefixSum[j] - prefixSum[i - 1]);
                    }
                }
            }
        }
        return ans;
    }
}
