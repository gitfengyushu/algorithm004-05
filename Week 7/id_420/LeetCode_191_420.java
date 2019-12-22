package geekbang.myleetcode.week07;

/**
 * @author: jimmy.wong
 * @date: 2019-12-19 10:46
 */
public class LeetCode_191_420 {
    public static void main(String[] args) {
        Integer n = Integer.valueOf("00000000000000000000000000001011", 2);
        Solution_1 solution_1 = new LeetCode_191_420().new Solution_1();
        Solution_2 solution_2 = new LeetCode_191_420().new Solution_2();
        System.out.println("solution_1:" + solution_1.hammingWeight(n));
        System.out.println("solution_2:" + solution_2.hammingWeight(n));
    }

    public class Solution_1 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int bits = 0;
            int mask = 1;
            for (int i = 0; i < 32; i++) {
                if ((n & mask) != 0) {
                    bits++;
                }
                mask <<= 1;
            }
            return bits;
        }
    }

    public class Solution_2 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int bits = 0;
            while (n != 0) {
                bits++;
                n = n & (n - 1);
            }
            return bits;
        }
    }
}
