// Time:O(klogn)
// Space:O(n)
import java.util.*;
public class Top_K_Frequent_Elements{
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            heap.add(entry);
        }
        int[] ret = new int[k];
        for(int i = 0; i < k; i++){
            ret[i]=heap.poll().getKey();
            
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k = 2;
        for(int i:topKFrequent(nums, k)){
            System.out.print(i+" ");
        }
        
    }
}