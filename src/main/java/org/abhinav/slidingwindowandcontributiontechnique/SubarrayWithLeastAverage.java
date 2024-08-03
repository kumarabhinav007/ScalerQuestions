
/*Given an array A of size N, find the subarray of size B with the least average.



        Problem Constraints
        1 <= B <= N <= 10^5
        -105 <= A[i] <= 10^5*/


package org.abhinav.slidingwindowandcontributiontechnique;

import java.util.*;

public class SubarrayWithLeastAverage {
    public int solve(ArrayList<Integer> A, int B) {
        long sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A.get(i);
        }
        long min = sum;
        int index = 0;
        for (int i = B; i < A.size(); i++) {
            sum -= A.get(i - B);
            sum += A.get(i);
            if (sum < min) {
                min = sum;
                index = i - B + 1;
            }
        }
        return index;
    }
}
