package com.problemsolving.LeetCode.Easy;

/** 2022/02/07
 *  Runtime: 0ms, 100%
 *  Memory: 42.1MB, 5.21%
 * */

public class p509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i=2; i<=n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }
}
