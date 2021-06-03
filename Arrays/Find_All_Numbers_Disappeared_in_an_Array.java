//Time:O(n)
//Space:O(1)
import java.util.ArrayList;
import java.util.List;
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]>0){
                nums[ind]=-nums[ind];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(i+1);
            }
        }
        return li;
        // int a[]=new int[nums.length+1];
        // for(int i=0;i<a.length;i++){
        //     a[i]=0;
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(a[nums[i]]==0){
        //         a[nums[i]]=1;
        //     }
        // }
        // for(int i=1;i<a.length;i++){
        //     if(a[i]==0){
        //         li.add(i);
        //     }
        // }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
