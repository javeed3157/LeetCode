//Time:O(100+100)
//Space:O(101)
public class Maximum_Number_of_Pairs_in_Array {
    public static int[] numberOfPairs(int[] nums) {
        int count = 0;
        int left = 0;
        int n = nums.length;
        int[] freq = new int[101];
        for(int i = 0; i < n; i++){
            freq[nums[i]] += 1;
        }
        for(int i = 0; i < 101; i++){
            count += freq[i]/2;
            left += freq[i]%2;
        }
        return new int[]{count,left};
//Time:O(n^2)
//Space:O(1)
        // int count = 0;
//         int left = 0;
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){\
//                 if (nums[i] == nums[j] && nums[i] != -1 && nums[j] != -1){
//                     nums[i] = -1;
//                     nums[j] = -1;
//                     count += 1;
                    
//                     break;
//                 }
//             }
//         }
//         for(int i = 0; i < n; i++){
            
//             if(nums[i] != -1){
//                 left += 1;
//             }
//         }
//         return new int[]{count,left};
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        for(int i: numberOfPairs(nums)){
            System.out.print(i+" ");
        }
    }
}
