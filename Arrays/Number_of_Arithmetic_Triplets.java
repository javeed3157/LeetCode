import java.util.Set;

// Time:O(n)
// Space:O(n)
public class Number_of_Arithmetic_Triplets{
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i - diff) && set.contains(i - diff * 2)){
                count += 1;
            }
            set.add(i);
        }
        // Time:O(2n)
        // for(int i = 0; i < n; i++){
        //     set.add(nums[i]);
        // }
        // for(int i = 0; i < n; i++){
        //     if(set.contains(nums[i] - diff)){
        //         if(set.contains(nums[i] + diff)){
        //             count += 1;
        //         }
        //     }
        // }
        //Time:O(n^3)
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         for(int k = j + 1; k < n; k++){
        //             if(nums[k] - nums[j] == diff && nums[j] - nums[i] == diff){
        //                 count += 1;
        //             }
        //         }
        //     }
        // }
        return count;
    }
    public static void main(String[] args) {
        
    }
}