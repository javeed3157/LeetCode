// Time:O(n)
// Space:O(1)
public class Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three {
    public static int averageValue(int[] nums) {
        int sums = 0;
        int count  = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                if(nums[i] % 3 == 0){
                    sums += nums[i];
                    count += 1;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        return sums/count;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,6,10,12,15};
        System.out.println(averageValue(nums));
    }
}
