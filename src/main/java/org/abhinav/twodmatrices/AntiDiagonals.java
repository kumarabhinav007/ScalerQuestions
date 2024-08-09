
/*Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


        Problem Constraints
        1<= N <= 1000
        1<= A[i][j] <= 1e9*/


package org.abhinav.twodmatrices;

import java.util.*;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < A.size() * 2 - 1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                list.add(0);
            }
            result.add(list);
        }
        int diagonalCount = 0;
        for (int i = 0; i < A.size(); i++) {
            int r = 0, c = i;
            int index = 0;
            while (r < A.size() && c >= 0) {
                result.get(diagonalCount).set(index, A.get(r).get(c));
                r++;
                c--;
                index++;
            }
            diagonalCount++;
        }
        for (int i = 1; i < A.size(); i++) {
            int r = i, c = A.size() - 1;
            int index = 0;
            while (r < A.size() && c >= 0) {
                result.get(diagonalCount).set(index, A.get(r).get(c));
                r++;
                c--;
                index++;
            }
            diagonalCount++;
        }
        return result;
    }
}
