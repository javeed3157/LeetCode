// Time:O(n)
// Space:O(n)
import java.util.HashMap;

public class Sum_of_Unique_Elements {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) == 1){
                sum += i;
            }
            else if(map.get(i) == 2){
                sum -= i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}
