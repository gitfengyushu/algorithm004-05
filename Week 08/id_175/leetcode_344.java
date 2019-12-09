package week8;

/**
 * @author shizeying
 * @date 2019/12/9 08:15
 * @description
 */
public class leetcode_344 {
  public void reverseString(char[] s) {
    int sLength = s.length;
    char temp;
    for (int i = 0, j = sLength - 1; i < j; i++, j--) {
      temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }
  }
}
