//Time:O(logn)
//Space:O(2)
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        if(nums.length==0){
            a[0]=a[1]=-1;
            return a;
        }
        int s=0;
        int e=nums.length-1;
        int ind=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                ind=mid;
                e=mid-1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        a[0]=ind;
        s=0;
        e=nums.length-1;
        ind=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                ind=mid;
                s=mid+1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        a[1]=ind;
        return a;
    }
    public static void main(String[] args) {
        int a[]={5,7,7,8,8,10};
        int tar=8;
        for(int i:searchRange(a, tar)){
            System.out.print(i+" ");
        }
    }
}
