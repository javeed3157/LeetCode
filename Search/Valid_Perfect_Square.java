//Time:O(log(n))
//Space:O(1)
public class Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            int rem=num%mid;
            if(mid==num/mid && rem==0){
                return true;
            }
            else if(mid<num/mid){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPerfectSquare(n));
    }
}
