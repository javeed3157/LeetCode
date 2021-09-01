public class Remove_Element {
    public static int removeDuplicates(int[] nums,int value) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=value){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        int a=removeDuplicates(arr,val);
        System.out.println(a);
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}