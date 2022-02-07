package com.problemsolving.LeetCode.Easy;

/** 2022/01/25
 *  Runtime: 2ms, 34.71%
 *  Memory: 50.2MB, 6.89%
 * */
public class p1929 {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for (int i=0; i<newArray.length; i++) {
            if (i<nums.length) {
                newArray[i] = nums[i];
            } else {
                newArray[i] = nums[i - nums.length];
            }
        }
        return newArray;
    }
}
