import java.util.HashMap;

// Time:O(n)
// Space:O(n)
public class Max_Number_of_K_Sum_Pairs{
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i]) > 0){
                count += 1;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }
            else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
}