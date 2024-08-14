
/*Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



        Problem Constraints
        1 <= |A| <= 1000*/


package org.abhinav.stringsbasics;

public class CountOccurrences {
    public int solve(String A) {
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            String subStr = A.substring(i);
            if (subStr.startsWith("bob")) {
                ans++;
            }
        }
        return ans;
    }
}
