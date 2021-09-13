//Time:O(log(n))
//Space:O(1)
public class Arranging_Coins {
    public static int arrangeCoins(int n) {
        long l=0;
        long h=n;
        long j=0,s=0;
        while(l<=h){
            j=l+(h-l)/2;
            s=j*(j+1)/2;
            if(s==n){
                return (int)j;
            }
            else if(s<n){
                l=j+1;
            }
            else{
                h=j-1;
            }
        }
        return (int)h;
    }
    public static void main(String[] args) {
        int num=7;
        System.out.println(arrangeCoins(num));
    }
}
