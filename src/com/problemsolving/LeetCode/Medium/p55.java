package com.problemsolving.LeetCode.Medium;

public class p55 {
    /** 2022/02/08
     *  method 1
     *  Runtime: 3ms, 63.93%
     *  Memory: 68MB, 10.41%
     * */

    public boolean m1canJump(int[] nums) {
        int requiredJump = 0;

        for (int i = nums.length - 1; i > 0; i--)
            requiredJump = nums[i] >= requiredJump ? 1 : requiredJump + 1;

        return nums[0] >= requiredJump;
    }
}
