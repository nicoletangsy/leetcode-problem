package com.problemsolving.LeetCode.Easy;

/** 2022/01/25
 *  Runtime: 3ms, 97.91%
 *  Memory: 51MB, 9.52%
 * */
public class p1920 {
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }
}
