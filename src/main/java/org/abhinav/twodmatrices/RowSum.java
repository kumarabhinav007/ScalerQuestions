
/*Return an array containing row-wise sums of original matrix.

        Problem Constraints
        1 <= A.size() <= 10^3

        1 <= A[i].size() <= 10^3

        1 <= A[i][j] <= 10^3*/


package org.abhinav.twodmatrices;

import java.util.*;

public class RowSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = 0; j < A.get(i).size(); j++) {
                sum += A.get(i).get(j);
            }
            result.add(sum);
        }
        return result;
    }
}
