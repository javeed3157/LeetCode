// Time:O(n)
// Space:O(n)
import java.util.*;
public class Find_K_Closest_Elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int h = arr.length - 1;
        while(h - l >= k){
            if(Math.abs(arr[l] - x) > Math.abs(arr[h] - x)){
                l += 1;
            }
            else{
                h -= 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= h; i++){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        List<Integer> list = findClosestElements(arr, k, x); 
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
