public int longestValidParentheses(String s) {
     if (s.length() == 0 && s == null) {
       return 0;
     }
     int max = 0;
     Stack<Integer> stack = new Stack<>();
     stack.push(-1);
     for (int i = 0; i < s.length(); i++) {
       if (s.charAt(i) == '(') {
         stack.push(i);
       } else {
         stack.pop();
         if (stack.isEmpty()) {
           stack.push(i);
         } else {
           max = Math.max(max, i - stack.peek());
         }
       }
     }
     return max;
   }
