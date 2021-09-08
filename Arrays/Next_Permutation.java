//Time:O(n)
//Space:O(1)
public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        //Finding the index 
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0){
                if(nums[j]>nums[i]){
                    j-=1;
                    break;
                }
                j-=1;        
            }
            //Swapping with next greater integer
            int temp=nums[i];
            nums[i]=nums[j+1];
            nums[j+1]=temp;
        }
        //Reversing the values from ind+1
        int j=nums.length-1;
        for(int k=i+1;k<j;k++){
            int temp=nums[k];
            nums[k]=nums[j];
            nums[j--]=temp;
        }

    }
    public static void main(String[] args) {
        int a[]={1,3,2};
        nextPermutation(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
