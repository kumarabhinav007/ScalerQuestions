
/*You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

        Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).



        Problem Constraints
        1 <= N <= 10^3

        -1000 <= A[i][j] <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class MinorDiagonalSum {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int r = 0, c = A.get(0).size() - 1, sum = 0;
        while (r < A.size() && c >= 0) {
            sum += A.get(r).get(c);
            r++;
            c--;
        }
        return sum;
    }
}
