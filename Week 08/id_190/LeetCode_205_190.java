package com.week08;

/**
 * 205
 */
public class IsIsomorphic {


    class Solution {

        public boolean isIsomorphic(String s, String t) {
            char[] arrS = s.toCharArray();
            char[] arrT = t.toCharArray();


            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(arrS[i]) != t.indexOf(arrT[i])) {
                    return false;
                }
            }
            return true;
        }
    }


}
