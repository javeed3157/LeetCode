// Time:O(n)
// Space:O(1)
public class Single_Number {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i: nums){
            ans ^= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[] = {2, 2, 1};
        System.out.println(singleNumber(ans));
    }
}
