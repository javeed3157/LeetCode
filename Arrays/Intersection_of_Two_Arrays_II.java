import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II{
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i: nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i: nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                l.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int j = 0;
        int[] arr = new int[l.size()];
        for(Integer i: l){
            arr[j++] = i;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        for(int i: intersect(nums1, nums2)){
            System.out.print(i + " ");
        }
    }
}