import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solutions {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        subsetcreate(nums,li,l,0,false);
        return li;
    }
    //Time:O(2^n)
    //Space:O(n)
    public void subsetcreate(int[] arr,List<List<Integer>> li,List<Integer> l,int start,boolean chosenAlready ){
        if(start==arr.length){
            li.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[start]);
        subsetcreate(arr,li,l,start+1,true);
        l.remove(l.size()-1);
        if(start>=1 && arr[start]==arr[start-1] && chosenAlready){
            return;
        }
        subsetcreate(arr,li,l,start+1,false);
    }
}
public class Subsets_II {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Solutions s=new Solutions();
        for(List l:s.subsets(nums)){
            System.out.println(l);
        }
    }
}
