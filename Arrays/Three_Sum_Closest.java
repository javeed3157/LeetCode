// Time:O(n^2)
// Space:O(1)
import java.util.Arrays;
public class Three_Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int ans = nums[0] + nums[1] + nums[len - 1];
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            int start = i + 1, end = len - 1;
            while(start < end){
                int curr_sum = nums[i] + nums[start] + nums[end];
                if(curr_sum > target){
                    end -= 1;
                }
                else{
                    start += 1;
                }
                if(Math.abs(curr_sum - target) < Math.abs(ans - target)){
                    ans = curr_sum;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
