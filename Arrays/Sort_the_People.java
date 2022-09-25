// Time:O(n)
// Space:O(n)
import java.lang.*;
import java.util.*;
public class Sort_the_People {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i],names[i]);
        }
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.putAll(map);
        String[] arr = new String[names.length];
        int i = 0;
        for (Map.Entry<Integer, String> entry : tmap.entrySet()){
            arr[i++] = entry.getValue();
        }
        for(int j = 0; j < arr.length/2; j++){
            String temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        for(String i: sortPeople(names, heights)){
            System.out.println(i);
        }
    }
}
