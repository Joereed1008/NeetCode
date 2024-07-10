class Solution {
    public boolean isAnagram(String s, String t) {

        int[] stuff = new int[128];

        for (char x : s.toCharArray()) {
            stuff[x]++;
        }
        for (char x : t.toCharArray()) {
            stuff[x]--;
        }

        for (var i : stuff){
            if (i !=0) {
                return false;
            }
        }

        return true;

    }
    
    public boolean isAnagramOld(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] alph = new int[26];

        for (int i=0;  i < s.length(); i++) {
            alph[s.charAt(i)-'a']++;
            alph[t.charAt(i)-'a']--;
        }

        for (int i : alph) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }
    //Beats 42.64%
}
