
/*Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



        Problem Constraints
        1 <= |A| <= 2*10^5
        -10^8 <= A[i] <= 10^8*/


package org.abhinav.sortingbasics;

import java.util.*;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, new MyComparator());
        if (A.get(0) == 0) {
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            if (i == A.get(i) && A.get(i) != A.get(i - 1)) {
                return 1;
            }
        }
        return -1;
    }

    private class MyComparator implements Comparator<Integer> {
        public int compare(Integer int1, Integer int2) {
            return -1 * Integer.compare(int1, int2);
        }
    }
}
