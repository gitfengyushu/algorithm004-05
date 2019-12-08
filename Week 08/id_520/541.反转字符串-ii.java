/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            // What is the logic behind: Math.min(start + k - 1, a.length - 1)? Thanks!

            // suppose we are near the end of the char array a[]，and 
            //we need do once more reverse. If there are exact k or 
            //more than k chars left, boundary start + k - 1 works 
            //just fine, we can just do the reverse. however if less 
            //than k characters left, and according to the problem 
            //description, we need to reverse all of them, the boundary
            // should be length - 1 then, otherwise, index will be out 
            //of range. Hope I make it clear to you.
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            swap(a, i, j);
        }
        return new String(a);
    }

    private void swap(char[] a, int i, int j) {
        for(; i < j; i++,j--) {
            char temp = a[i]; a[i] = a[j]; a[j] = temp;
        }
    }
}
// @lc code=end

