// Time:O(n)
// Space:O(1)
public class Increasing_Triplet_Subsequence {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i: nums){
            if(i <= first){
                first = i;
            }
            else if(i <= second){
                second = i;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, -1, 0, -2, 3};
        System.out.println(increasingTriplet(nums));
    }
}
