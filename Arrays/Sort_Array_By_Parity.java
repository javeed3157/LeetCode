//Time:O(n)
//Space:O(1)
public class Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int l=0,h=nums.length-1;
        while(l<h){
            if(nums[l]%2==0){
                l+=1;
            }
            else{
                if(nums[h]%2==0){
                    int temp=nums[l];
                    nums[l]=nums[h];
                    nums[h]=temp;
                    l+=1;
                }
                h-=1;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int a[]={3,2,1,4};
        for(int i:sortArrayByParity(a)){
            System.out.print(i+" ");
        }
    }
}
