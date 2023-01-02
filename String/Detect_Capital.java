// Time:O(n)
// Space:O(1)
public class Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int lo = 0;
        int up = 0;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(c >= 'A' && c <= 'Z' && lo == 0){
                up += 1;
            }
            else if(c >= 'a' && c <= 'z' && (up == 1 || up == 0)){
                lo += 1;
            }
        }
        if(up == word.length() || lo == word.length()){
            return true;
        }
        else if(up == 1 && lo == word.length() - 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "Abc";
        System.out.println(detectCapitalUse(s3));
    }
}
