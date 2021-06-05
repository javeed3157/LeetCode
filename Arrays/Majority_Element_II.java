//Time:O(n)
//Space:O(1)
//Here we considered 2 elements itself bcz max of 2 ele > n/3 will be present in arr
import java.util.ArrayList;
import java.util.List;
public class Majority_Element_II {
public static List<Integer> majorityElement(int[] nums) {
    List<Integer> list=new ArrayList<Integer>();
    int majorind1=0;
    int majorind2=0;
    int count1=0;
    int count2=0;
    for(int i=0;i<nums.length;i++){
        if(nums[majorind1]==nums[i]){
            count1+=1;
        }
        else if(nums[majorind2]==nums[i]){
            count2+=1;
        }
        else if(count1==0){
            majorind1=i;
            count1=1;
        }
        else if(count2==0){
            majorind2=i;
            count2=1;
        }
        else{
            count1-=1;
            count2-=1;
        }
    }
    count1=0;
    count2=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==nums[majorind1]){
            count1+=1;
        }
        else if(nums[i]==nums[majorind2]){
            count2+=1;
        }
    }
    if(count1>nums.length/3){
        list.add(nums[majorind1]);
    }
    if(count2>nums.length/3){
        list.add(nums[majorind2]);
    }
    return list;
}
    public static void main(String[] args) {
        int arr[]={3,2,3};
        System.out.println(majorityElement(arr));
    }
}
