// Time:O(n)
// Space:O(n)
public class Move_Zeroes{
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count += 1;
            }
        }
        int[] new_arr = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                new_arr[j] = nums[i];
                j += 1;
            }
        }
        while(j < nums.length){
            new_arr[j] = 0;
            j += 1;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = new_arr[i];
            System.out.print(nums[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,1,2};
        moveZeroes(nums);
    }
}