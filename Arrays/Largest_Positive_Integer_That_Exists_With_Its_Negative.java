// Time:O(n^2)
// Space:O(1)
import java.util.*;
public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public static int findMaxK(int[] nums) {
        int ans = -1;
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0; i--){
            int val = nums[i] * -1;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == val){
                    ans = val;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        System.out.println(findMaxK(nums));
    }
}
