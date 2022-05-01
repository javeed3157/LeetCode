// Time:O(n^2)
// Space:O(1)
public class Find_First_Palindromic_String_in_the_Array{
    public static String firstPalindrome(String[] words) {
        int ch = 1;
        for (String s : words) {
            ch = 1;
            for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
                if (s.charAt(i) != s.charAt(j)) {
                    ch = 0;
                }
            }
            if(ch != 0){
                return s;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}