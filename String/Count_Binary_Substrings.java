// Time:O(n)
// Space:O(1)
public class Count_Binary_Substrings {
    public static int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, ans = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                curr += 1;
            }
            else{
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        ans += Math.min(prev, curr);
        return ans;
    }
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }
}
