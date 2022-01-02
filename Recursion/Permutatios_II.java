//Time:O(n*n!)
//Space:O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutatios_II {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean checked[]=new boolean[nums.length];
        Arrays.sort(nums);
        permutate(nums,li,l,checked);
        return li;
    }
    public static void permutate(int[] arr,List<List<Integer>> li,List<Integer> l,boolean checked[]){
        if(l.size()==arr.length){
            li.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(checked[i]){
                continue;
            }
            if(i>=1 && arr[i]==arr[i-1] && !checked[i-1]){
                continue;
            }
            checked[i]=true;
            l.add(arr[i]);
            permutate(arr,li,l,checked);
            checked[i]=false;
            l.remove(l.size()-1);  
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        for(List l:permuteUnique(nums)){
            System.out.println(l);
        }
    }
}
