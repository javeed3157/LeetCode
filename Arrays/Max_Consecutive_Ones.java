// Time:O(n)
// Space:O(1)
public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int mc = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count += 1;
            }
            else{
                mc = Math.max(mc,count);
                count = 0;
            }
        }
        mc = Math.max(mc,count);
        return mc;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
