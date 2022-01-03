import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence {
    //Approach-1 : Using math concept of factorial most optimized
    //Time:O(n^2)
    //Space:O(n)
    public static String getPermutation(int n, int k) {
        List<Integer> l = new ArrayList<>();
        String s = "";
        int fact = 1;
        for(int i = 1; i < n; i++){
            l.add(i);
            fact *= i;
        }
        l.add(n);
        k -= 1;
        while(true){
            int idx = k / fact;
            s += l.get(idx);
            l.remove(idx);
            if(l.size() == 0){
                break;
            }
            k %= fact;
            fact /= l.size();
        }
        return s;
    }
    //Approach-2 : TLE more time complexity
    //Time:O(n*n!)
    //Space:o(n)

    // public static String getPermutation(int n, int k) {
    //     String a="";
    //     ArrayList<String> l=new ArrayList<>();
    //     permutate(n,a,0,l,new boolean[n+1]);
    //     return l.get(k-1);
    // }
    // public static void permutate(int n,String a,int idx,ArrayList<String> l,boolean[] check){
    //     if(a.length()==n){
    //         l.add(new String(a));
    //         return;
    //     }
    //     for(int i=1;i<=n;i++){
    //         if(!check[i]){
    //             check[i]=true;
    //             permutate(n,a+i,i,l,check);
    //             check[i]=false;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int n=4;
        int k=4;
        System.out.println(getPermutation(n, k));
    }
}
