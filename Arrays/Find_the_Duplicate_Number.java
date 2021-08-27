//Time:O(n)
//Space:O(1)
//Tortoise and hare cycle detection algorithm
public class Find_the_Duplicate_Number {
    public static int ftdn(int[]nums){
        int tor=nums[0];
        int har=nums[0];
        do{
            tor=nums[tor];
            har=nums[nums[har]];
        }
        while(tor!=har);
        tor=nums[0];
        while(tor!=har){
            tor=nums[tor];
            har=nums[har];
        }
        return tor;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(ftdn(arr));
    }
}
