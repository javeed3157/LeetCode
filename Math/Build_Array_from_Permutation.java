// Time:O(n)
// Space:O(1)
// Euclids division algorithm is used here a=bq+r
public class Build_Array_from_Permutation {
    public static int[] buildArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+n*(nums[nums[i]]%n);
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        return nums;
    }
    public static void main(String[] args) {
        int a[]={0,2,1,5,3,4};
        for(int i:buildArray(a)){
            System.out.print(i+" ");
        }
    }
}
