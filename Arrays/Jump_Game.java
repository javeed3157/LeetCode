//Time:O(n)
//Space:O(1)
public class Jump_Game {
    public static boolean canJump(int[] nums) {       
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(nums[i]+i,max);
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        // int a[]={3,2,1,0,4};
        System.out.println(canJump(a));
    }
}
