// Time:O(2^(2n))
// Space:O(n)
import java.util.*;
public class Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        helper(l, "", 0, 0, n);
        return l;
    }
    public static void helper(List<String> l, String ans, int op, int clo, int maxi){
        if(ans.length() == maxi * 2){
            l.add(ans);
            return;
        }
        if(op < maxi){
            helper(l, ans + "(", op + 1, clo, maxi);
        }
        if(clo < op){
            helper(l, ans + ")", op, clo + 1, maxi);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generateParenthesis(n));
    }
}
