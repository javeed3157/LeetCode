//Time:O(n)
//Space:O(n)
public class Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int l=0,h=nums.length-1;
        int a[]=new int[nums.length];
        int maxi=nums.length-1;
        while(l<=h){
            if(Math.abs(nums[l])>Math.abs(nums[h])){
                a[maxi--]=Math.abs(nums[l])*Math.abs(nums[l]);
                l+=1;
            }
            else{
                a[maxi--]=Math.abs(nums[h])*Math.abs(nums[h]);
                h-=1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        for(int i:sortedSquares(arr)){
            System.out.print(i+" ");
        }
    }
}
