//Time:O(n)
//Space:O(1)
public class Maximum_Sum_Circular_Subarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int nonwrapsum= kadanes(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count+=1;
            }
        }
        if(count==nums.length){
            return nonwrapsum;
        }
        else{
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
            nums[i]=-nums[i];
        }
        int wrapsum=totalsum+kadanes(nums);
        return Math.max(nonwrapsum,wrapsum);
        }
    }
    public static int kadanes(int[] arr){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum>max){
                max=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int li[]={5,-3,5};
        // int li[]={-2,-3,-5};
        System.out.println(maxSubarraySumCircular(li));
    }
}
