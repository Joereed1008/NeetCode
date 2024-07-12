package Stack;

import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        if (s.length() % 2 != 0) return false;
        for (int i = 0 ; i < s.length() ; i++) {
             char currentChar = s.charAt(i);

            switch (currentChar) {
                case '(': 
                case '{': 
                case '[':
                    stack.add(currentChar);
                    break;
             case ')':
                    if (!stack.isEmpty() && stack.get(stack.size() - 1) == '(') {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;

                case '}':
                    if (!stack.isEmpty() && stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;

                case ']':
                    if (!stack.isEmpty() && stack.get(stack.size() - 1) == '[') {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                
            }

        

        }

    if (stack.isEmpty()) return true; return false;
    }
}
