import java.util.List;
import java.util.ArrayList;
//Time:O(n^2)
//Space:O(n^2)
public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> r=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    r.add(1);
                }
                else{
                    r.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
            }
            arr.add(r);
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        a=generate(n);
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
