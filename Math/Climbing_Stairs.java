// Time:O(n)
// Space:O(n)
public class Climbing_Stairs {
    public static int climbStairs(int n) {
        if (n <= 1) {
                return 1;
            }

            int prev1 = 1;
            int prev2 = 2;

            for (int i = 3; i <= n; i++) {
                int newValue = prev1 + prev2;
                prev1 = prev2;
                prev2 = newValue;
            }

            return prev2;    
    }
    public static void main(String[] args) {
        int climbing_Stairs = 40;
        System.out.println(climbStairs(climbing_Stairs));
    }
}
