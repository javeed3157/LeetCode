//Time:O(n)
//Space:O(1)
public class Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        int left=1;
        int right=1;    
        for(int i=0;i<nums.length;i++){
            if(i>0){
                left*=nums[i-1];
            }
            out[i]=left;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i<nums.length-1){
                right*=nums[i+1];
            }
            out[i]*=right;
        }
        return out;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for(int i:productExceptSelf(arr)){
            System.out.print(i+" ");
        }
    }
}
