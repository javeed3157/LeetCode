//Time:O(n)
//Space:O(1)
public class Missing_Number{
    public static int missingNumber(int[] nums) {
        int sum=(nums.length)*(nums.length+1)/2;
        int numsum=0;
        for(int i:nums){
            numsum+=i;
        }
        return sum-numsum;
    }
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
