//Time:O(n)
//Space:O(1)
public class Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int sum=0;
        int m=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            m=Math.max(sum,m);
        }
        return m;
    }
    public static void main(String[] args) {
        int a[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(a));
    }
}
