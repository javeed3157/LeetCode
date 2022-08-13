//Time: O(n)
//Space: O(n)
public class Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        for(int i=0;i<arr.length;i++){
            count+=(arr[i]*(arr[i]-1))/2;
        }
        return count;
        //Time:O(n^2)
        //Space:O(1)
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && i<j){
        //             count+=1;
        //         }
        //     }
        // }
        // return count;
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(a));
    }
}
