import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);
        for(int i = 0; i < s.length(); i++) {
            if (s_chars[i] != t_chars[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}