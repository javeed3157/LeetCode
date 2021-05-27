//Time:O(n)
//Space:O(1)
public class Fibonacci_Number{
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        // return fib(n-1)+fib(n-2);
        int a=0,b=1,c=0;
        while(n>1){
            c=a+b;
            a=b;
            b=c;
            n-=1;
        }
        return c;
    }
    public static void main(String[] args) {
        int k=4;
        System.out.println(fib(k));
    }
}