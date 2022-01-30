// Time:O(n)
// Space:O(1)
import java.util.Stack;
public class Basic_Calculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (int)(c - '0');
            }
            else if(c == '+'){
                ans += sign * num;
                num = 0;
                sign = 1;
            }
            else if(c == '-'){
                ans += sign * num;
                num = 0;
                sign = -1;
            }
            else if(c == '('){
                stack.push(ans);
                stack.push(sign);
                sign = 1;
                ans = 0;
            }
            else if(c == ')'){
                ans += sign * num;
                num = 0;
                ans *= stack.pop();
                ans += stack.pop();
            }
        }
        if(num != 0){
            ans += sign * num;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s0 = "1+1";
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s0));
        System.out.println(calculate(s));
    }
}
