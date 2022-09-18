// Time:O(n)
// Space:O(1)
public class Smallest_Even_Multiple {
    public static int smallestEvenMultiple(int n) {
        int t = n;
        while(true){
            if(t % 2 == 0 && t % n == 0){
                return t;
            }
            t += 1;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }    
}
