// Time:O(n)
// Space:O(1)
public class Split_a_String_in_Balanced_Strings{
    public static int balancedStringSplit(String s) {
        int ans = 0, count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                count += 1;
            }
            else{
                count -= 1;
            }
            if(count == 0){
                ans += 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}