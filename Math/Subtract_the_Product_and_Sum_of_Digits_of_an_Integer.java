//Time:O(logn)
//Space:O(1)
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static int subtractProductAndSum(int n) {
        int a=0,b=1;
        while(n>0){
            a+=n%10;
            b*=n%10;
            n=n/10;
        }        
        return b-a;
    }
    public static void main(String[] args) {
        int num=234;
        System.out.println(subtractProductAndSum(num));
    }
}
