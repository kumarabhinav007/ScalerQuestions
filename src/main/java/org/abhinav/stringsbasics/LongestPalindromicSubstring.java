
/*Given a string A of size N, find and return the longest palindromic substring in A.

        Substring of string A is A[i...j] where 0 <= i <= j < len(A)

        Palindrome string:
        A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

        Incase of conflict, return the substring which occurs first ( with the least starting index).



        Problem Constraints
        1 <= N <= 6000*/


package org.abhinav.stringsbasics;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        int maxLength = 0;
        String ans = null;
        for (int i = 0; i < A.length(); i++) {
            String palindrome = expand(A, i, i);
            if (palindrome.length() > maxLength) {
                maxLength = palindrome.length();
                ans = palindrome;
            }
        }
        for (int i = 0; i < A.length() - 1; i++) {
            String palindrome = expand(A, i, i + 1);
            if (palindrome.length() > maxLength) {
                maxLength = palindrome.length();
                ans = palindrome;
            }
        }
        return ans;
    }

    private String expand(String str, int c1, int c2) {
        while (c1 >= 0 && c2 < str.length() && str.charAt(c1) == str.charAt(c2)) {
            c1--;
            c2++;
        }
        return str.substring(c1 + 1, c2);
    }
}
