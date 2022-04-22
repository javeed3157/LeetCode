// Time : O(logn)
// Space : O(1)
public class Happy_Number{
    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = sqrt(slow);
            fast = sqrt(sqrt(fast));
        }
        while(slow != fast);
        return slow == 1;
    }
    public static int sqrt(int n){
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}