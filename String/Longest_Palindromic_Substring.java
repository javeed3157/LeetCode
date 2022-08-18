// Time:O(n^2)
// Space:O(1)
public class Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        String max = "";
        for(int i = 0; i < s.length(); i++){
            String s1 = count(s, i, i);
            if(s1.length() > max.length()){
                max = s1;
            }
            String s2 = count(s, i, i + 1);
            if(s2.length() > max.length()){
                max = s2;
            }
            
        }
        return max;
    }
    public static String count(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start -= 1;
            end += 1;
        }
        return s.substring(start + 1, end);
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
