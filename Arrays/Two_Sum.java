import java.util.Arrays;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int l=0;
        int h=nums.length-1;
        while(l<h){
            if(arr[l]+arr[h]==target){
                break;
            }
            else if(arr[l]+arr[h]>target){
                h-=1;
            }
            else{
                l+=1;
            }
        }
        int ans[]=new int[2];
        if(arr[l]!=arr[h]){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==arr[l]){
                    ans[0]=i;
                }
                if(nums[i]==arr[h]){
                    ans[1]=i;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==arr[l]){
                    ans[0]=i;
                    break;
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==arr[h] && i!=ans[0]){
                    ans[1]=i;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={3,2,4};
        // int nums[]={3,3};
        int target=6;
        for(int i:twoSum(nums,target)){
            System.out.print(i+" ");
        }
    }
}
