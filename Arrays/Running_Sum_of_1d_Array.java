public class Running_Sum_of_1d_Array{
    public static int[] runningSum(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        runningSum(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    

}
