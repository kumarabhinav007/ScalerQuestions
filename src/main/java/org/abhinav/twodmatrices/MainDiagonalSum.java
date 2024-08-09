
/*You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

        Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.


        Problem Constraints
        1 <= N <= 10^3

        -1000 <= A[i][j] <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class MainDiagonalSum {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i).get(i);
        }
        return sum;
    }
}
