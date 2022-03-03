// Time:O(3n)
// Space:O(n)

import java.util.HashSet;
import java.util.Set;
public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        int maxcount = 0;
        for(int i: nums){
            if(!s.contains(i - 1)){
                int count = 1;
                int curr = i;
                while(s.contains(curr + 1)){
                    curr += 1;
                    count += 1;
                }
                maxcount = Math.max(maxcount, count);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
