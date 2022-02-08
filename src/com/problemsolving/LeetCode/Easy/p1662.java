package com.problemsolving.LeetCode.Easy;

/** 2022/02/07
 *  Runtime: 1ms, 85.3%
 *  Memory: 42.4MB, 5.16%
 * */
public class p1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        for (int i=0;i<word1.length;i++) {
            sb1.append(word1[i]);
        }
        StringBuffer sb2 = new StringBuffer();
        for (int i=0;i<word2.length;i++) {
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
