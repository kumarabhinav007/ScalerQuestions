
/*Given a 2D integer array A, return the transpose of A.

        The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


        Problem Constraints
        1 <= A.size() <= 1000

        1 <= A[i].size() <= 1000

        1 <= A[i][j] <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class MatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (int j = 0; j < A.get(0).size(); j++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.size(); i++) {
                list.add(0);
            }
            B.add(list);
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(0).size(); j++) {
                B.get(j).set(i, A.get(i).get(j));
            }
        }
        return B;
    }
}
