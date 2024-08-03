
/*You have given a string A having Uppercase English letters.

        You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.



        Problem Constraints
        1 <= length(A) <= 105*/


package org.abhinav.carryforwardandsubarrays;

public class SpecialSubsequences {
    public Long solve(String A) {
        long ans = 0, aCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                aCount++;
            } else if (A.charAt(i) == 'G') {
                ans += aCount;
            }
        }
        return ans;
    }
}
