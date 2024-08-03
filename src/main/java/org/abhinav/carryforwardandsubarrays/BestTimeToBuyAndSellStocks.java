
/*Say you have an array, A, for which the ith element is the price of a given stock on day i.
        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

        Return the maximum possible profit.



        Problem Constraints
        0 <= A.size() <= 700000
        1 <= A[i] <= 107*/


package org.abhinav.carryforwardandsubarrays;

import java.util.*;

public class BestTimeToBuyAndSellStocks {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if (A.size() == 0 || A.size() == 1) {
            return 0;
        }
        int min = A.get(0), ans = 0;
        for (int i = 1; i < A.size(); i++) {
            ans = Math.max(ans, A.get(i) - min);
            min = Math.min(min, A.get(i));
        }
        return ans;
    }
}
