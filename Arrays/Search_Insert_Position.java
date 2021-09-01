//Time;O(log(n))
//Space:O(1)
public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        int i;
        if(nums[0]>target){
            return 0;
        }
        for(i=0;i<e;i++){
            if(nums[i]>target){
                break;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int targ=5;
        // int targ=2;
        System.out.println(searchInsert(arr, targ));
    }
}
