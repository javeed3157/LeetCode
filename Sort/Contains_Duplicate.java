//Time:O(nlog(n))
//Space:O(1)
import java.util.Arrays;
public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        System.out.println(containsDuplicate(a));
    }
}
