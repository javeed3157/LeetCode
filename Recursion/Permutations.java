//Time:O(n*n!)
//Space:O(n)
import java.util.ArrayList;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        // permutate(nums,li,l,new HashSet<>());
        permutate(nums,li,l,new boolean[nums.length]);
        return li;
    }
    // public static void permutate(int[] arr,List<List<Integer>> li,List<Integer> l,Set<Integer> ls){
    //     if(l.size()==arr.length){
    //         li.add(new ArrayList<>(l));
    //         return;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(ls.contains(arr[i])){
    //             continue;
    //         }
    //         ls.add(arr[i]);
    //         l.add(arr[i]);
    //         permutate(arr,li,l,ls);
    //         ls.remove(l.get(l.size()-1));
    //         l.remove(l.size()-1);  
    //     }
    // }
    public static void permutate(int[] arr,List<List<Integer>> li,List<Integer> l,boolean[] check){
        if(l.size()==arr.length){
            li.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!check[i]){
                check[i]=true;
                l.add(arr[i]);
                permutate(arr,li,l,check);
                l.remove(l.size()-1); 
                check[i]=false;
            }
            
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        for(List l:permute(nums)){
            System.out.println(l);
        }
    }
}
