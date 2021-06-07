//Time:O(n)
//Space:O(1)
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int miss=nums.length;
        for(int i=0;i<nums.length;i++){
            miss^=i^nums[i];
        }
        return miss;
    }
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
//Also can be done by total sum till n - arr sum