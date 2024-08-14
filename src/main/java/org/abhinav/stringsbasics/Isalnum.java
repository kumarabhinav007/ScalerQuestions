
/*You are given a function isalpha() consisting of a character array A.

        Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



        Problem Constraints
        1 <= |A| <= 10^5*/


package org.abhinav.stringsbasics;

import java.util.*;

public class Isalnum {
    public int solve(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i) >= 'a' && A.get(i) <= 'z') || (A.get(i) >= 'A' && A.get(i) <= 'Z') || (A.get(i) >= '0' && A.get(i) <= '9')) {
                continue;
            }
            return 0;
        }
        return 1;
    }
}

