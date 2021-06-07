//Time:O(n)
//Space:O(1)
//Dutch National Flag (3 pointers approach)
public class Sort_Colors{
    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low+=1;
                mid+=1;
            }
            else if(nums[mid]==1){
                mid+=1;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high-=1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,2,2,2,1,0,1,1,1,0,2};
        sortColors(arr);
        for(int i:arr){

            System.out.print(i+" ");
        }
    }
}