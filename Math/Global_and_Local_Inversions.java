// Time:O(n)
// Space:O(1)
public class Global_and_Local_Inversions {
    public static boolean isIdealPermutation(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int x = nums[i] - i;
            if(Math.abs(x) > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2};
        System.out.println(isIdealPermutation(nums));
    }
}
