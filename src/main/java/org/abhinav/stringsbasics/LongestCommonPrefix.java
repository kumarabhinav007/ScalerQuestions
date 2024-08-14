
/*Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

        The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

        Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



        Problem Constraints
        0 <= sum of length of all strings <= 1000000*/


package org.abhinav.stringsbasics;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder strBuilder = new StringBuilder();
        int index = 0;
        while (true) {
            Character ch = null;
            for (int i = 0; i < A.size(); i++) {
                if (index == A.get(i).length()) {
                    ch = null;
                    break;
                }
                if (ch == null) {
                    ch = A.get(i).charAt(index);
                } else {
                    if (ch != A.get(i).charAt(index)) {
                        ch = null;
                        break;
                    }
                }
            }
            if (ch == null) {
                break;
            }
            strBuilder.append(ch);
            index++;
        }
        return strBuilder.toString();
    }
}

