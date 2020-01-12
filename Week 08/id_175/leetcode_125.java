package week8;

/**
 * @author shizeying
 * @date 2019/12/9 08:13
 * @description
 */
public class leetcode_125 {
  public boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
      while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
      while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
      i++;
      j--;
    }
    return true;
  }
}
