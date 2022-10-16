// Time:O(n^2)
// Space:O(n)
import java.util.*;
public class Count_Number_of_Distinct_Integers_After_Reverse_Operations {
    public static int reverse(int rev){
        int ans = 0;
        int r;
        while(rev > 0){
            r = rev % 10;
            ans = ans * 10 + r;
            rev /= 10;
        }
        return ans;
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
}
