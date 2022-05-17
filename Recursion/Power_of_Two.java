public class Power_of_Two {
    // Time:O(1)
    // Space:O(1)
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    // Time:O(logn)
    // Space:O(1)
    // public static boolean isPowerOfTwo(int n) {
    //     if(n == 1){
    //         return true;
    //     }
    //     if(n%2 != 0 || n < 1){
    //         return false;
    //     }
    //     return isPowerOfTwo(n/2);
    // }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
