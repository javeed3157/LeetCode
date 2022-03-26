// Time:O(n)
// Space:O(n)
import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        int count  = 0;
        int curr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr == k){
                count += 1;
            }
            if(map.containsKey(curr - k)){
                count += map.get(curr - k);
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k =3;
        System.out.println(subarraySum(nums, k));
    }
}
