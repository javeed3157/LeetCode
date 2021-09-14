//Time:O(log(n))
//Space:O(1)
public class Binary_Search {
    public static int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
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
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int targ=9;
        System.out.println(search(arr,targ));
    }
}
