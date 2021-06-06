public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            if(cur>max){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
