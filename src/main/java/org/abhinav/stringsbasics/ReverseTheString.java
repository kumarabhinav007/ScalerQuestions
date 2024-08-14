
/*You are given a string A of size N.

        Return the string A after reversing the string word by word.

        NOTE:

        A sequence of non-space characters constitutes a word.
        Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
        If there are multiple spaces between words, reduce them to a single space in the reversed string.


        Problem Constraints
        1 <= N <= 3 * 10^5*/


package org.abhinav.stringsbasics;

import java.util.*;

public class ReverseTheString {
    public String solve(String A) {
        StringTokenizer st = new StringTokenizer(A);
        Stack<String> stack = new Stack<>();
        while (st.hasMoreTokens()) {
            stack.push(st.nextToken());
        }
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(stack.pop());
        while (stack.size() != 0) {
            strBuilder.append(" ");
            strBuilder.append(stack.pop());
        }
        return strBuilder.toString();
    }
}
