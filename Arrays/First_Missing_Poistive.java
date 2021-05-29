//Time,Space:O(n)
public class First_Missing_Poistive{
    //Using extra constant space
    public static  int firstMissingPositive(int[] nums) {
        boolean check[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                check[nums[i]]=true;
            }
        }
        for(int i=1;i<check.length;i++){
            if(!check[i]){
                return i;
            }
        }
        return nums.length+1;
    }
    
    //Direclty updating in the given array
    // public static int firstMissingPositive(int[] nums) {
    //         int n=nums.length;
    //         for(int i=0;i<n;i++){
    //             if(nums[i]<=0){
    //                 nums[i]=n+1;
    //             }
    //         }
    //         for(int i=0;i<n;i++){
    //             int num = Math.abs(nums[i]);
    //             if(num>0 && num<=n){
    //                 nums[num-1]=-1*Math.abs(nums[num-1]);
    //             }
    //         }
    //         for(int i=0;i<n;i++){
    //             if(nums[i]>0){
    //                 return i+1;
    //             }
    //         }
    //         return nums.length+1;
    //     }
    public static void main(String[] args) {
        int a[]={1,2,-1,0,4};
        System.out.println(firstMissingPositive(a));
    }
}