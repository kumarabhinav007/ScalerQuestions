
/*You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
        Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

        The Following will give you an idea of matrix addition:



        Problem Constraints

        1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class AddTheMatrices {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); j++) {
                list.add(0);
            }
            result.add(list);
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                result.get(i).set(j, A.get(i).get(j) + B.get(i).get(j));
            }
        }
        return result;
    }
}
