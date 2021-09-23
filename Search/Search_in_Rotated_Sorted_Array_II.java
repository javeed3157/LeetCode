//Time:O(log(n))
//Space:O(n)
public class Search_in_Rotated_Sorted_Array_II {
    public  static boolean search(int[] nums, int target) {
        int mount=-1;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid<h && nums[mid]>nums[mid+1]){
                mount=mid;
                break;
            }
            if(mid>l && nums[mid-1]>nums[mid]){
                mount=mid-1;
                break;
            }
            if(nums[mid]==nums[l] && nums[mid]==nums[h]){
                if(l<nums.length-1 && nums[l]>nums[l+1]){
                    mount=l;
                    break;
                }
                l+=1;
                if(h>0 && nums[h]<nums[h-1]){
                    mount=h-1;
                    break;
                }
                h-=1;
            }
            else if(nums[l]<nums[mid] || nums[l]==nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(mount==-1){
                return bs(nums,0,nums.length-1,target);
            }
            if(nums[mount]==target){
                return true;
            } 
            l=0;
            if(target>=nums[l]){
                return bs(nums,0,mount-1,target);
            }
            else{
                return bs(nums,mount+1,nums.length-1,target);
            }
        }
        public static boolean bs(int nums[],int s,int e,int target){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]==target){
                    return true;
                }
                else if(nums[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2};
        int tar=3;
        System.out.println(search(nums, tar));
    }
}
