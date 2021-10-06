import java.util.Arrays;
//Time:O(nlog(n))
//Space:O(1)
public class Kth_Largest_Element_in_an_Array {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a=1;
        for(int i=nums.length-1;i>=0;i--){
            if(a==k){
                return nums[i];
            }
            a+=1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(a, k));
    }
}
