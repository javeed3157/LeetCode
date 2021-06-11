//Time:O(n)
//Space:O(n+m)
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int a[]=new int[101];
        int o[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]+=1;
        }
        for(int i=1;i<101;i++){
            a[i]+=a[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                o[i]=0;
            }
            else{
            o[i]=a[nums[i]-1];
            }
        }
        return o;
        //Bruteforce(Time:O(n^2);Space:O(1))
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]>nums[j] && i!=j){
        //             count+=1;
        //         }
        //     }
        //     a[i]=count;
        // }
    }
    public static void main(String[] args) {
        int arr[]={8,1,2,2,3};
        for(int i:smallerNumbersThanCurrent(arr)){
            System.out.print(i+" ");
        }
    }
}
