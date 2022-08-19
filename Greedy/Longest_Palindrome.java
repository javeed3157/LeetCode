// Time:O(n)
// Space:O(n)
import java.util.*;
public class Longest_Palindrome {
    public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count += 1;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(set.isEmpty()){
            return count * 2;
        }
        else{
            return count * 2 + 1;
        }
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
