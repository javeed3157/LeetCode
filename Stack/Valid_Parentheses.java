// Time:O(n)
// Space:O(1)
import java.util.Stack;

public class Valid_Parentheses{
    public static boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{'){
                st.push('}');
            }
            else if(c == '('){
                st.push(')');
            }
            else if(c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{}()[]";
        System.out.println(isValid(s));
    }
}