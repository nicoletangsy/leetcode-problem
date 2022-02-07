package com.problemsolving.LeetCode.Easy;

/** 2022/01/26
 *  Runtime: 0ms
 *  Memory: 39.9MB
 * */
public class p1480 {
    public int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
