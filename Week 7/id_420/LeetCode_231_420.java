package geekbang.myleetcode.week07;

/**
 * @author: jimmy.wong
 * @date: 2019-12-21 12:22
 */
public class LeetCode_231_420 {
    public static void main(String[] args) {
        Solution solution = new LeetCode_231_420().new Solution();
        boolean powerOfTwo = solution.isPowerOfTwo(-2147483648);
        System.out.println(powerOfTwo);
    }
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return (n > 0) && (n & (n - 1)) == 0;
        }
    }
}
