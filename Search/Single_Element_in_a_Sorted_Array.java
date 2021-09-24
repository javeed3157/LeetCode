//Time:O(log(n))
//Space:O(1)
public class Single_Element_in_a_Sorted_Array {
    public static int singleNonDuplicate(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    l=mid+2;
                }
                else{
                    h=mid-1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4,8,8};
        // int a[] = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(a));
    }
}
