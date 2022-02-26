// Time:O(n)
// Space:O(1)
public class Reverse_Integer {
    public static int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int tmp = x % 10;
            x /= 10;
            // if value of ans exceeds range of int then return -1
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && tmp > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && tmp < -8)) return 0;
            ans = ans*10 + tmp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
