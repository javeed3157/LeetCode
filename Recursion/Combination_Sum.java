//Time:O(2^t * k)
//Space:O(k*x)
import java.util.ArrayList;
import java.util.List;

public class Combination_Sum{
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combinate(candidates,li,l,target,0);
        return li;
    }
    public static void combinate(int[] arr,List<List<Integer>> li,List<Integer> l,int target,int idx){
        if(idx==arr.length){
            if(target==0){
                li.add(new ArrayList<>(l));
            }
            return;
        }
        if(arr[idx]<=target){
            l.add(arr[idx]);
            combinate(arr,li,l,target-arr[idx],idx);
            l.remove(l.size()-1);
        }
        combinate(arr,li,l,target,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int tar=7;
        for(List l:combinationSum(arr,tar)){
            System.out.println(l);
        }
    }
}