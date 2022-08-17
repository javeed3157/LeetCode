// Time:O(n^2)
// Space:O(1)
public class Palindromic_Substrings {
    public static int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += eachStr(s, i, i);
            count += eachStr(s, i, i + 1);
        }
        return count;
    }
    public static int eachStr(String s, int start, int end){
        int temp = 0;
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            temp += 1;
            start -= 1;
            end += 1;
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(countSubstrings(s));
    }
}
