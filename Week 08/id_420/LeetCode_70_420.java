package geekbang.myleetcode.week08;

/**
 * @author: jimmy.wong
 * @date: 2019-12-22 22:30
 */
public class LeetCode_70_420 {

    class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
