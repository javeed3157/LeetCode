// Time:O(n)
// Space:O(n)
import java.util.*;
public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < time.length; i++){
            if(time[i] % 60 == 0){
                count += map.getOrDefault(0, 0);
            }
            else{
                count += map.getOrDefault(60 - time[i] % 60, 0);
            }
            map.put(time[i] % 60, map.getOrDefault(time[i] % 60, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] time= {30,20,150,100,40};
        System.out.println(numPairsDivisibleBy60(time));
    }
}
