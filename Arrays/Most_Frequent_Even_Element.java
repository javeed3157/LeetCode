// Time:O(n)
// Space:O(n)
import java.util.*;
public class Most_Frequent_Even_Element {
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int maxiV = -1;
        int maxiK = -1;
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            int k = m.getKey();
            int v = m.getValue();
            System.out.println(k+" "+v);
            if(v > maxiV){
                maxiV = v;
                maxiK = k;
            }
            if(v == maxiV){
                maxiK = Math.min(maxiK, k);
            }
        }
        return maxiK;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,4,9,2,4};
        System.out.println(mostFrequentEven(nums));
    }
}
