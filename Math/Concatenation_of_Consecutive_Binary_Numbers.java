// Time:O(n)
// Space:O(1)
public class Concatenation_of_Consecutive_Binary_Numbers {
    public static int concatenatedBinary(int n) {
        long ans = 0;
        long modulo = (long) (1e9 + 7);
        int binDig = 0;
        for(int i = 1; i <= n; i++){
            if((i & (i - 1)) == 0){
                binDig += 1;
            }
            ans = ((ans << binDig) + i) % modulo;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(concatenatedBinary(n));
    }
}
