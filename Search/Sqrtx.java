//Time:O(log(n))
//Space:O(1)
public class Sqrtx {
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l=1,h=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        int num=8;
        System.out.println(mySqrt(num));
    }
}
