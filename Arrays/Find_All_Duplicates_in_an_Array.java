//Time:O(n)
//Space:O(1)
import java.util.ArrayList;
import java.util.List;
public class Find_All_Duplicates_in_an_Array {
    // public static List<Integer> findDuplicates(int[] nums) {
        // This method takes O(n) time comp also O(n) space comp as well 
    //     List<Integer> li=new ArrayList<Integer>();
    //     int a[]=new int[(int) (2 * Math.pow(10,5))];
    //     for(int i=0;i<a.length;i++){
    //         a[i]=0;
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(a[nums[i]]==0){
    //             a[nums[i]]=1;
    //         }
    //         else{
    //             li.add(nums[i]);
    //         }
    //     }
    //     return li;
    // }
    public static List<Integer> findDuplicates(int[] nums){
        //This method is used because the contraint given is 1<=nums[i]<=n it uses contant extra space
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]>0){
                nums[ind]=-nums[ind];
            }
            else{
                li.add(Math.abs(nums[i]));
            }
        }
        return li;
    }
    
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
