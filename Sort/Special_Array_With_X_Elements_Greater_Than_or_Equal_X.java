import java.util.Arrays;
//Time:O(nlog(n))
//Space:O(1)
public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X{
    public static int specialArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }        
        Arrays.sort(nums);
        for (int x = 1; x <= nums.length; x++) {
            int candidate = nums.length - x;            
            if (nums[candidate] >= x && (candidate == 0 || nums[candidate-1] < x)) {
                return x;
            }
        }        
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,5};
        System.out.println(specialArray(a));
    }
}