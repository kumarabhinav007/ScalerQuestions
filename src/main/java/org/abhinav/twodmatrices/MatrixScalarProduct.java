
/*You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.


        Problem Constraints
        1 <= A.size() <= 1000

        1 <= A[i].size() <= 1000

        1 <= A[i][j] <= 1000

        1 <= B <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class MatrixScalarProduct {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                A.get(i).set(j, B * A.get(i).get(j));
            }
        }
        return A;
    }
}
