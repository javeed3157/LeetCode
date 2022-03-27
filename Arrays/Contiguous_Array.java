import java.util.HashMap;

// Time:O(n)
// Space:O(n)
public class Contiguous_Array {
    public static int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        int max = 0, curr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(map.containsKey(curr)){
                max = Math.max(max, i - map.get(curr));
            }
            else{
                map.put(curr, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,1};
        System.out.println(findMaxLength(nums));
    }
}
