package com.problemsolving.LeetCode.Medium;

/** 2022/02/07
*  Runtime: 0ms, 100%
*  Memory: 41MB, 8.07%
* */
public class p1641 {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        for (int i=0;i<dp.length;i++) {
            dp[i] = 1;
        }
        while (n>1) {
            dp[0] += dp[1] + dp[2] + dp[3] + dp[4];
            dp[1] += dp[2] + dp[3] + dp[4];
            dp[2] += dp[3] + dp[4];
            dp[3] += dp[4];
            n--;
        }
        return dp[0] + dp[1] + dp[2] + dp[3] + dp[4];
    }
}
