// Time:O(n)
// Space:O(1)
public class Find_Pivot_Index{
    public static int pivotIndex(int[] nums) {
        int total_sum = 0;
        for(int i: nums){
            total_sum += i;
        }
        int left_sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(left_sum == total_sum - left_sum - nums[i]){
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}