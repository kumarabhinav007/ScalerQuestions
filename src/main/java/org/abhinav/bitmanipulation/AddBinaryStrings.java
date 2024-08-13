
/*Given two binary strings A and B. Return their sum (also a binary string).


        Problem Constraints
        1 <= length of A <= 105

        1 <= length of B <= 105

        A and B are binary strings*/


package org.abhinav.bitmanipulation;

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        if (A.length() < B.length()) {
            String temp = A;
            A = B;
            B = temp;
        }
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < A.length() - B.length(); i++) {
            strBuilder.append('0');
        }
        B = strBuilder.toString() + B;
        strBuilder = new StringBuilder();
        boolean carry = false;
        for (int i = A.length() - 1; i >= 0; i--) {
            if (!carry) {
                if (A.charAt(i) == '0' && B.charAt(i) == '0') {
                    strBuilder.append('0');
                } else if (A.charAt(i) == '0' && B.charAt(i) == '1') {
                    strBuilder.append('1');
                } else if (A.charAt(i) == '1' && B.charAt(i) == '0') {
                    strBuilder.append('1');
                } else if (A.charAt(i) == '1' && B.charAt(i) == '1') {
                    strBuilder.append('0');
                    carry = true;
                }
            } else {
                if (A.charAt(i) == '0' && B.charAt(i) == '0') {
                    strBuilder.append('1');
                    carry = false;
                } else if (A.charAt(i) == '0' && B.charAt(i) == '1') {
                    strBuilder.append('0');
                } else if (A.charAt(i) == '1' && B.charAt(i) == '0') {
                    strBuilder.append('0');
                } else if (A.charAt(i) == '1' && B.charAt(i) == '1') {
                    strBuilder.append('1');
                }
            }
        }
        if (carry) {
            strBuilder.append('1');
        }
        return strBuilder.reverse().toString();
    }
}
