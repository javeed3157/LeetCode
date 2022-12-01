// Time:O(n)
// Space:O(1)
public class Determine_if_String_Halves_Are_Alike {
    public static boolean halvesAreAlike(String s) {
        int c1 = 0;
        int c2 = 0;
        int n = s.length();
        for(int i = 0 ; i < n; i++){
            if(i < n/2){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    c1 += 1;
                }
            }
            else{
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    c2 += 1;
                }
            }
        }
        return c1 == c2;
    }
    public static void main(String[] args) {
        // String s = "book"
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
