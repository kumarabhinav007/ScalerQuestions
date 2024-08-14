
/*You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

        You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



        Problem Constraints
        1 <= N <= 10^5

        A[i] ∈ ['a'-'z', 'A'-'Z']*/


package org.abhinav.stringsbasics;

public class ToggleCase {
    public String solve(String A) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
                strBuilder.append((char)(A.charAt(i) + 'a' - 'A'));
            } else {
                strBuilder.append((char)(A.charAt(i) + 'A' - 'a'));
            }
        }
        return strBuilder.toString();
    }
}
