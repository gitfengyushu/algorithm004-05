package xyz.isok.algorithm.leetcode.easy;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class No771JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        boolean[] jewels = new boolean[58];
        char[] js = J.toCharArray();
        for (char j : js) {
            jewels[j - 'A'] = true;
        }
        char[] ss = S.toCharArray();
        int total = 0;
        for (char s : ss) {
            if (jewels[s - 'A']) {
                total++;
            }
        }
        return total;
    }
}