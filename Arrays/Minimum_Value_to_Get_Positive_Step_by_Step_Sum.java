//Time:O(n)
//Space:O(1)
public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum{
    public static int minStartValue(int[] nums) {
        int mins=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            mins=Math.min(mins,sum);
        }
        return 1-mins;
    }
    public static void main(String[] args) {
        int arr[]={-3,2,-3,4,2};
        System.out.println(minStartValue(arr));
    }
}
