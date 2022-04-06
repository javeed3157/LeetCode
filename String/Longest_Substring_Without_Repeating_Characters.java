import java.util.HashSet;
import java.util.Set;
// Time:O(n)
// Space:O(n)
public class Longest_Substring_Without_Repeating_Characters{
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcabc";
        // String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}