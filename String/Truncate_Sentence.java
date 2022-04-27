// Time:O(n)
// Space:O(1)
public class Truncate_Sentence{
    public static String truncateSentence(String s, int k) {
        int idx = 0;
        int count = 0;
        while(idx < s.length() && count < k){
            if(s.charAt(idx) == ' '){
                count += 1;
            }
            idx += 1;
        }
        if(k == count){
            return s.substring(0, idx - 1);
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }
}