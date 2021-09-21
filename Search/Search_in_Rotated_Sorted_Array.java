//Time:O(log(n))
//Space:O(1)
public class Search_in_Rotated_Sorted_Array {
    //This method is easy
    public static int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(target >=nums[l] && target < nums[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target <=nums[h] && target > nums[mid]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
    // public  static int search(int[] nums, int target) {
    //     int mount=-1;
    //     int l=0;
    //     int h=nums.length-1;
    //     while(l<=h){
    //         int mid=l+(h-l)/2;
    //         if(mid<h && nums[mid]>nums[mid+1]){
    //             mount=mid;
    //             break;
    //         }
    //         if(mid>l && nums[mid-1]>nums[mid]){
    //             mount=mid-1;
    //             break;
    //         }
    //         if(nums[mid]<nums[l]){
    //             h=mid-1;
    //         }
    //         else{
    //             l=mid+1;
    //         }
    //     } 
    //     if(mount==-1){
    //         return bs(nums,0,nums.length-1,target);
    //     }
    //     if(nums[mount]==target){
    //         return mount;
    //     } 
    //     l=0;
    //     if(target>=nums[l]){
    //         return bs(nums,0,mount-1,target);
    //     }
    //     else{
    //         return bs(nums,mount+1,nums.length-1,target);
    //     }
    // }
    // public static int bs(int nums[],int s,int e,int target){
    //     while(s<=e){
    //         int mid=s+(e-s)/2;
    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             s=mid+1;
    //         }
    //         else{
    //             e=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(search(arr, tar));
    }
}
