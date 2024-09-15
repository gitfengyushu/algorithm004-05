package xyz.isok.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class No387FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        //各个字符的数量
        int[] stat = new int[58];
        for (int i = 0; i < s.length(); i++) {
            stat[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (stat[s.charAt(i) - 'A'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
