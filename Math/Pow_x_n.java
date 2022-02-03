//Time:O(logn)
//Space:O(1)
public class Pow_x_n{
    public static double myPow(double x, int n) {
        long nVal = n;
        double ans = 1;
        if(n < 0){
            nVal *= -1;
        }
        while(nVal > 0){
            if(nVal % 2 == 0){
                x *= x;
                nVal /= 2;
            }
            else{
                ans *= x;
                nVal -= 1;
            }
        }
        if(n < 0){
            ans = 1 / ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 200000;
        int n = 10;
        System.out.println((myPow(x, n)));
    }
}