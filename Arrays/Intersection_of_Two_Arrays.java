//Time:O(n)
//Space:O(n)
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums1){
            s1.add(i);
        }
        for(int i: nums2){
            s2.add(i);
        }
        s1.retainAll(s2);
        int j = 0;
        int[] arr = new int[s1.size()];
        for(int i: s1){
            arr[j++] = i;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        for(int i: intersection(nums1, nums2)){
            System.out.println(i + " ");
        }
    }
}
