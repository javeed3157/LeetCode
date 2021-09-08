import java.util.ArrayList;
import java.util.List;
//Time:O(n)
//Space:O(n)
//Binomial expansion of nCr for that specific row where r is column number
public class Pascals_Triangle_II {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> li=new ArrayList<Integer>();
        long res=1;
        li.add(1);
        if(rowIndex==0){
            return li;
        }
        int n=rowIndex;
        for(int i=0;i<rowIndex;i++){
            res=(res*(n-i)/(i+1));
            li.add((int)res);
        }
        return li;
    }
    public static void main(String[] args) {
        Integer num=4;
        for(Integer i:getRow(num)){
            System.out.print(i+" ");
        }
    }
}
