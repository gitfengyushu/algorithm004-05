package geekbang.myleetcode.week07;

/**
 * @author: jimmy.wong
 * @date: 2019-12-21 12:18
 */
public class LeetCode_190_420 {
    public static void main(String[] args) {

        Integer n = Integer.valueOf("00000010100101000001111010011100", 2);
        Solution solution = new LeetCode_190_420().new Solution();
        int result = solution.reverseBits(n);
        Integer out = Integer.valueOf("00111001011110000010100101000000", 2);
        System.out.println(out.equals(result));
    }

    public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                result = (result << 1) + (n & 1);
                n >>= 1;
            }
            return result;
        }
    }
}
