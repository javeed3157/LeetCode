import java.util.Arrays;
//Time:O(nlog(n))
//Space:O(1)
public class Largest_Perimeter_Triangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2]){
                return (nums[i]+nums[i+1]+nums[i+2]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[]={2,1,2};
        System.out.println(largestPerimeter(a));
    }
}
