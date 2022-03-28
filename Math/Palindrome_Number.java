// Time:O(n)
// Space:O(1)
public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x!=0 && x%10==0)){
            return false;
        }
        int ans = 0;
        while (x > ans){
            ans = ans*10 + x%10;
            x = x/10;
        }
        return x == ans || x == ans/10;
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
