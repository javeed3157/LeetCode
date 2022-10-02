// Time:O(n)
// Space:O(1)
public class Number_of_Common_Factors {
    public static int commonFactors(int a, int b) {
        int maxi = Math.max(a, b);
        int count = 0;
        for(int i = 1; i <= maxi; i++){
            if(a % i == 0 && b % i == 0){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(commonFactors(a, b));
    }
}
