//Time:O(2^n)
//Space:O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II{
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        combinates(candidates,li,new ArrayList<>(),target,0);
        return li;
    }
    public static void combinates(int[] arr,List<List<Integer>> li,List<Integer> l,int target,int idx){
        if(target==0){
            li.add(new ArrayList<>(l));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            l.add(arr[i]);
            combinates(arr,li,l,target-arr[i],i+1);
            l.remove(l.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int tar=8;
        for(List l:combinationSum2(arr,tar)){
            System.out.println(l);
        }
    }
}
