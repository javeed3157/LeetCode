//Time:O(n)
//Space:O(1)
public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int a=removeDuplicates(arr);
        System.out.println(a);
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
