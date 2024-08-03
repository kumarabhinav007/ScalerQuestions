
/*Given an array A of length N. Also given are integers B and C.

        Return 1 if there exists a subarray with length B having sum C and 0 otherwise



        Problem Constraints
        1 <= N <= 10^5

        1 <= A[i] <= 10^4

        1 <= B <= N

        1 <= C <= 10^9*/


package org.abhinav.slidingwindowandcontributiontechnique;

import java.util.*;

public class SubarrayWithGivenSumAndLength {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A.get(i);
        }
        if (sum == C) {
            return 1;
        }
        for (int i = B; i < A.size(); i++) {
            sum -= A.get(i - B);
            sum += A.get(i);
            if (sum == C) {
                return 1;
            }
        }
        return 0;
    }
}
