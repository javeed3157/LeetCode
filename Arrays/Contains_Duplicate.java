// Time:O(n)
// Space:O(n)
import java.util.*;
public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
