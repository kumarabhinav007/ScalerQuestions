
/*Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

        and at least one occurrence of the minimum value of the array.



        Problem Constraints
        1 <= |A| <= 2000*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;
public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }
        int ans = A.size();
        int minIndex = -1, maxIndex = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == min) {
                minIndex = i;
                if (maxIndex != -1) {
                    ans = Math.min(ans, minIndex - maxIndex + 1);
                }
            }
            if (A.get(i) == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    ans = Math.min(ans, maxIndex - minIndex + 1);
                }
            }
        }
        return ans;
    }
}
