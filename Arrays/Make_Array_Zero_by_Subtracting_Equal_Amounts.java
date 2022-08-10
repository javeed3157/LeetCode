// TIme:O(n^2)
// Space:O(1)
public class Make Array_Zero_by_Subtracting_Equal_Amounts{
    int checker(int[] nums){
        int checks = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                checks = 1;
            }
        }
        return checks;
    }
    void deduct(int[] nums, int min){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[i] -= min;
            }
        }
    }
    public int minimumOperations(int[] nums) {
        int opr = 0;
        int n = nums.length;
        
        while(true){
            if(checker(nums) == 0){
                break;
            }
            int notZero = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                if(nums[i] != 0){
                    notZero = 1;
                    if(min > nums[i]){
                        min = nums[i];
                    }
                }
            }
            deduct(nums, min);
            opr += 1;
            if(notZero == 0){
                break;
            }
        }
        return opr;
        
    }
    public static void main(String[] args) {
        
    }
}