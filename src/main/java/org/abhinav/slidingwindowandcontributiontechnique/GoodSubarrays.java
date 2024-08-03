
/*Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
        1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
        2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
        Your task is to find the count of good subarrays in A.


        Problem Constraints
        1 <= len(A) <= 5 x 10^3
        1 <= A[i] <= 10^3
        1 <= B <= 10^7*/


package org.abhinav.slidingwindowandcontributiontechnique;

import java.util.*;

public class GoodSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int prefixSum[] = new int[A.size()];
        prefixSum[0] = A.get(0);
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        int ans = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i; j < prefixSum.length; j++) {
                if (i == 0) {
                    if ((j - i + 1) % 2 == 0 && prefixSum[j] < B) {
                        ans ++;
                    } else if ((j - i + 1) % 2 == 1 && prefixSum[j] > B) {
                        ans++;
                    }
                } else {
                    if ((j - i + 1) % 2 == 0 && prefixSum[j] - prefixSum[i - 1] < B) {
                        ans ++;
                    } else if ((j - i + 1) % 2 == 1 && prefixSum[j] - prefixSum[i - 1] > B) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}