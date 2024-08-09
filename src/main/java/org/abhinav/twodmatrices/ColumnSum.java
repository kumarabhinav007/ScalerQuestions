
/*You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



        Problem Constraints
        1 <= A.size() <= 10^3

        1 <= A[i].size() <= 10^3

        1 <= A[i][j] <= 10^3*/


package org.abhinav.twodmatrices;

import java.util.*;

public class ColumnSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < A.get(0).size(); j++) {
            int columnSum = 0;
            for (int i = 0; i < A.size(); i++) {
                columnSum += A.get(i).get(j);
            }
            result.add(columnSum);
        }
        return result;
    }
}
