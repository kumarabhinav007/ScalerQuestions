
/*You are given a n x n 2D matrix A representing an image.

        Rotate the image by 90 degrees (clockwise).

        You need to do this in place.

        Note: If you end up using an additional array, you will only receive partial score.



        Problem Constraints
        1 <= n <= 1000*/


package org.abhinav.twodmatrices;

import java.util.*;

public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            int index1 = 0, index2 = A.size() - 1;
            while (index1 < index2) {
                int temp = A.get(i).get(index1);
                A.get(i).set(index1, A.get(i).get(index2));
                A.get(i).set(index2, temp);
                index1++;
                index2--;
            }
        }
    }
}
