// Time:O(n)
// Space:O(1)
public class Remove_Duplicates_from_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(i<2 || nums[j]>nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
