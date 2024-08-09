
/*Find the Bth smallest element in given array A .

        NOTE: Users should try to solve it in less than equal to B swaps.



        Problem Constraints
        1 <= |A| <= 100000

        1 <= B <= min(|A|, 500)

        1 <= A[i] <= 10^9*/


package org.abhinav.sortingbasics;

import java.util.*;

public class KthSmallestElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        int arr[] = new int[A.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = A.get(i);
        }
        for (int i = 0; i < B; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[B - 1];
    }
}
