//Time:O(n)
//Space:O(1)
public class Nth_TribonacciNumber{
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        // return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        else{
            int a=0,b=1,c=1,d=0;
            while(n>2){
                d=a+b+c;
                a=b;
                b=c;
                c=d;
                n-=1;
            }
            return d;
        }
    }
    public static void main(String[] args) {
        int k=4;
        System.out.println(tribonacci(k));
    }
}