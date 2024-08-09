
/*Given an integer array A of size N. You can remove any element from the array in one operation.
        The cost of this operation is the sum of all elements in the array present before this operation.

        Find the minimum cost to remove all elements from the array.



        Problem Constraints
        0 <= N <= 1000
        1 <= A[i] <= 10^3*/


package org.abhinav.sortingbasics;

import java.util.*;

public class ElementsRemoval {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, new MyComparator());
        int ans = 0;
        for (int i = 0; i < A.size(); i++) {
            ans += (i + 1) * A.get(i);
        }
        return ans;
    }

    public class MyComparator implements Comparator<Integer> {
        public int compare(Integer int1, Integer int2) {
            return -1 * Integer.compare(int1, int2);
        }
    }
}
