
/*You are given a string S, and you have to find all the amazing substrings of S.

        An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

        Input

        Only argument given is string S.
        Output

        Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
        Constraints

        1 <= length(S) <= 1e6
        S can have special characters*/


package org.abhinav.stringsbasics;

public class AmazingSubarrays {
    public int solve(String A) {
        int mod = 10003;
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
                ans = (ans + A.length() - i) % mod;
            }
        }
        return ans;
    }
}

