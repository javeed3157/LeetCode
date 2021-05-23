//Time:O(n)
//Space:O(1)
public class Majority_Element {
    public static int majorityele(int nums[]){
        int majind=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[majind]==nums[i]){
                count+=1;
            }
            else{
                count-=1;
            }
            if(count==0){
                majind=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[majind]){
                count+=1;
            }
        }
        if(count>nums.length/2){
            return nums[majind];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityele(arr));
    }
}
