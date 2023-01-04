import java.util.*;
// Time:O(n)
// Space:O(n)
public class Minimum_Rounds_to_Complete_All_Tasks {
    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            int key = m.getKey();
            int value = m.getValue();
            if(value == 1){
                return -1;
            }
            ans += (value+2)/3;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,3,3,3,4,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));
    }
}
