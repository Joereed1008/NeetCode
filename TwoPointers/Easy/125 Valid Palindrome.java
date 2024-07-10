import java.util.LinkedList;

class Solution {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
    
    public boolean isPalindromeOld(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int len = s.length();
        LinkedList<Integer> stack = new LinkedList<Integer>();

        for (int i = 0 ; i < len ; i++) {
                stack.add(s.charAt(i)-'0');
        }
    for (int i = 0 ; i < len/2 ; i++) {
        if (stack.pollFirst() != stack.pollLast()) {
            return false;
        }
    }
    return true;
}
//31%
}