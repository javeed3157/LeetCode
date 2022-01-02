//Time:O(n*2^n)
//Space:O(n)
import java.util.ArrayList;
import java.util.List;

class Solutions {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        subsetcreate(nums,li,l,0);
        return li;
    }
    public void subsetcreate(int[] arr,List<List<Integer>> li,List<Integer> l,int start ){
        li.add(new ArrayList<>(l));
        for(int i=start;i<arr.length;i++){
            l.add(arr[i]);
            subsetcreate(arr,li,l,i+1);
            l.remove(l.size()-1);
        }
    }
}
public class Subsets {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Solutions s=new Solutions();
        for(List l:s.subsets(nums)){
            System.out.println(l);
        }
    }
}
