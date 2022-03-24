// Time:O(n^2)
// Space:O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Three_Sum {
    public static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            int a = nums[i];
            int tar = -a;
            int s = i + 1;
            int e = n - 1;
            while(s < e){
                if(tar == nums[s] + nums[e]){
                    List<Integer> lin = new ArrayList<Integer>();
                    lin.add(a);
                    lin.add(nums[s]);
                    lin.add(nums[e]);
                    l.add(lin);
                    while(s < e && nums[s] == nums[s + 1]){
                        s += 1;
                    }
                    while(s < e && nums[s] == nums[e - 1]){
                        e -= 1;
                    }
                    s += 1;
                    e -= 1;
                }
                else if(nums[e] + nums[s] > tar){
                    e -= 1;
                }
                else{
                    s += 1;
                }
            }
            while(i + 1 < n && nums[i + 1] == nums[i]){
                i += 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> it= threeSum(nums);
        for(int i = 0; i < it.size(); i++){
            for(int j = 0; j < it.get(i).size() ; j++){
                System.out.print(it.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
