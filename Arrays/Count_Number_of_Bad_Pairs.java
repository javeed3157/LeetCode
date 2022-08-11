import java.util.*;
// Time:O(n)
// Space:O(n)
public class Count_Number_of_Bad_Pairs{
    public static long countBadPairs(int[] nums) {
        Long c = 0L;
        int n = nums.length;
        Long ways = (long)n * (n - 1)/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i, 0)+1);
        }
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            Long value = (long)mapElement.getValue();
            if(value >= 2){
                c += value * (value - 1)/2;
            }
        }
        c = ways - c;
        return c;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3};
        System.out.println(countBadPairs(nums));
    }
}