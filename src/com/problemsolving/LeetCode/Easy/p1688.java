package com.problemsolving.LeetCode.Easy;

/** 2022/02/07
 *  Runtime: 0ms, 100%
 *  Memory: 41.3MB, 6.11%
 * */
public class p1688 {
    public int numberOfMatches(int n) {
        int sum = 0;
        while (n>1) {
            int tmp = 0;
            if (n%2 == 0) {
                tmp = n / 2;
                n = tmp;
            } else {
                tmp = (n - 1) / 2;
                n = tmp + 1;
            }
            sum += tmp;
        }
        return sum;
    }
}
