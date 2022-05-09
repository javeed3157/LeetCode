// Time:O(1)
// Space:O(1)
public class Power_of_Three{
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}