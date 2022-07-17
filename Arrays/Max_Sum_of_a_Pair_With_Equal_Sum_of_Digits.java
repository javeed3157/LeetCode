import java.util.HashMap;
import java.util.Map;

// Time:O(n)
// Space:O(n)
public class Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static int check(int val){
        int temp = val;
        int sum = 0;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
    public static int maximumSum(int[] nums) {
        int maximum = -1;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int sum = check(nums[i]);
            if(map.containsKey(sum)){
                if(map.get(sum) + nums[i] > maximum){
                    maximum = map.get(sum) + nums[i];
                }
                map.put(sum, Math.max(map.get(sum), nums[i]));
            }
            else{
                map.put(sum, nums[i]);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] nums = {18,43,36,13,7};
        System.out.println(maximumSum(nums));
    }
}
