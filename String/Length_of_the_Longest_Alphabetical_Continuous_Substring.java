// Time:O(n)
// Space:O(1)
public class Length_of_the_Longest_Alphabetical_Continuous_Substring {
    public static int longestContinuousSubstring(String s) {
        int mc = 0;
        int c = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) - s.charAt(i - 1) == 1){
                c += 1;
            }
            else{
                mc = Math.max(mc, c);
                c = 1;
            }
        }
        mc = Math.max(mc, c);
        return mc;
    }
    public static void main(String[] args) {
        String s = "abcbabac";
        System.out.println(longestContinuousSubstring(s));
    }
}
