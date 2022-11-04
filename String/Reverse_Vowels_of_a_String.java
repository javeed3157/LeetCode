// Time:O(n)
// Space:O(n)
import java.util.*;
public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int l = 0;
        int r = s.length() - 1;
        char[] ch = s.toCharArray();
        while(l < r){
            if(set.contains(ch[l]) && set.contains(ch[r])){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l += 1;
                r -= 1;
            }
            else if(set.contains(ch[l])){
                r -= 1;
            }
            else if(set.contains(ch[r])){
                l += 1;
            }
            else{
                l += 1;
                r -= 1;
            }
        }
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            ans += ch[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
