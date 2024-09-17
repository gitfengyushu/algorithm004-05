/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        // 两次遍历字符串求得唯一字符
        // 第一次遍历字符串s，求出来每个字符出现的次数
        // 第二次还是遍历s，取出来第一个出现次数为1的字符
        
        int[] letter = new int[26];// 存储各字符出现次数
        
        // for(int i = 0; i < s.length(); i++) { //第一次遍历
        //     letter[s.charAt(i) - 'a'] ++;
        // }
        for(char c : s.toCharArray()) { //第一次遍历
            letter[c-'a']++;
        }

        for(int j = 0; j < s.length();j++) { // 第二次遍历
            int temp = s.charAt(j) - 'a';
            if(letter[temp] == 1) {
                return j;
            }
        }
        return -1;// 无解
    }
}
// @lc code=end

