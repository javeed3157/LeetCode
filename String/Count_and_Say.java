// Time:O(n)
// Space:O(n)
public class Count_and_Say {
    public static String countAndSay(int n) {
        String ans = "1";
        for(int i = 1; i < n; i++){
            ans = helper(ans);
        }
        return ans;
    }
    public static String helper(String ans){
        StringBuilder s = new StringBuilder();
        char c = ans.charAt(0);
        int count = 1;
        for(int i = 1; i < ans.length(); i++){
            if(ans.charAt(i) == c){
                count += 1;
            }
            else{
                s.append(count);
                s.append(c);
                count = 1;
                c = ans.charAt(i);
            }
        }
        s.append(count);
        s.append(c);
        return s.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}
