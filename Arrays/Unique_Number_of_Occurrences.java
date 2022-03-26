//Time:O(n)
//Space:O(n)
import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
