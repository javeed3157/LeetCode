// Time:O(n)
// Space:O(1)
public class Move_Zeroes{
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos += 1;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}