//Time:O(n)
//Space:O(1)
public class Sort_Array_By_Parity_II{
    public static int[] sortArrayByParityII(int[] nums) {
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2==0){
                i+=2;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j+=2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,7};
        for(int i:sortArrayByParityII(arr)){
            System.out.print(i+" ");
        }

    }
}