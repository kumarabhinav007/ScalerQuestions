
/*Given a string A, you are asked to reverse the string and return the reversed string.



        Problem Constraints
        1 <= |A| <= 10^5

        String A consist only of lowercase characters.*/


package org.abhinav.stringsbasics;

public class SimpleReverse {
    public String solve(String A) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            strBuilder.append(A.charAt(i));
        }
        return strBuilder.toString();
    }
}
