// Time:O(n)
// Space:O(26)
import java.util.HashSet;
public class Determine_if_String_Halves_Are_Alike {
    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        String g = "aeiouAEIOU";
        for(int i = 0; i < g.length(); i++){
            set.add(g.charAt(i));
        }
        int l = 0;
        int r = 0;
        int h = s.length() - 1;
        for(int i = 0; i < s.length()/2; i++){
            if(set.contains(s.charAt(i))){
                l += 1;
            }
            if(set.contains(s.charAt(h))){
                r += 1;
            }
            h -= 1;
        }
        return l == r;
    }
    public static void main(String[] args) {
        // String s = "book"
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
