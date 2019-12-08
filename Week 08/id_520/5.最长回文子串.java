/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {

    // 方法一，优化之后的暴力穷举
    // private int lo,maxLen;

    // public String longestPalindrome(String s) {
    //     int len = s.length();
    //     if (len < 2) 
    //         return s;

    //     for(int i = 0; i < len-1; i++) {
    //         extendPalindrome(s, i, i); // odd length
    //         extendPalindrome(s, i, i+1); // even length
    //     }
    //     //摘取出来s的最长回文
    //     return s.substring(lo, lo + maxLen);
    // }

    // public void extendPalindrome(String s, int j, int k) {
    //     // j是向左扩散，k是向右扩散。只要j和k上面的字符相同，就不断地走
    //     while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
    //         j--; k++;
    //     }
    //     // 走完之后，判断当前遍历到的是不是最长的子串，如果是，就更新max长度，同时记录
    //     //当前遍历的最左边的位置，也就是起点
    //     if(maxLen < k - j - 1) {
    //         lo = j + 1;
    //         maxLen = k - j - 1;
    //     }
    // }

    // 方法二，DP
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];

        // 第一层循环，枚举起点
        for (int i = n - 1; i >= 0; i--) {
            // 第二层循环，枚举回文子串的终点，就是后面那个位置
            for (int j = i; j < n; j++) {
                // 两者相等才能继续扩散；并且dp[i+1][j-1]，表示上一个字符串
                //就是回文子串，才能继续扩张；或者j-i<2，代表长度为1或者空串这种特殊情况
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || 
                dp[i+1][j-1]);

                // 往下更新结果，只要当前回文子串的长度大于了res的长度，就更新
                //最长的回文串
                if(dp[i][j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
// @lc code=end

