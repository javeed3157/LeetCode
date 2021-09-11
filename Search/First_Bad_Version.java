// Time:O(log(n))
// Space;O(1)
public class First_Bad_Version{
    static int z= 4;
    private static boolean isBadVersion(int mid) {
        if(mid==z){
            return true;
        }
        return false;
    }
    public static int firstBadVersion(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            boolean ans=isBadVersion(mid);
            if(ans==false){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(firstBadVersion(n));
    }
}