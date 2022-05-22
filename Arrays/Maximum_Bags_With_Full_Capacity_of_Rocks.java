import java.util.*;
// Time:O(nlogn)
// Space:O(1)
// Greedy Solution
public class Maximum_Bags_With_Full_Capacity_of_Rocks {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        for(int i = 0; i < capacity.length; i++){
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        for(int i = 0; i < capacity.length; i++){
            if(capacity[i] == 0){
                count += 1;
            }
            else{
                if(additionalRocks >= capacity[i]){
                    additionalRocks -= capacity[i];
                    count += 1;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] capacity = {2, 3, 4, 5};
        int[] rocks = {1, 2, 4, 4};
        int additionalRocks = 2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }
}
