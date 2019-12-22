package geekbang.myleetcode.week08;

/**
 * @author: jimmy.wong
 * @date: 2019-12-22 23:10
 */
public class LeetCode_709_420 {
    class Solution {
        public String toLowerCase(String str) {
            char[] a = str.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if ('A' <= a[i] && a[i] <= 'Z') {
                    a[i] = (char) (a[i] - 'A' + 'a');
                }
            }
            return new String(a);
        }
    }
}
