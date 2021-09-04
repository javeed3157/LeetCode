//Time:O(n)
//Space:O(1)
public class Rotate_Array{
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
    }
    private static void reverse(int i,int j,int[] nums){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int r=3;
        rotate(a, r);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
