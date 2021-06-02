//Time:O(n^2)
//Space:O(n)
import java.util.ArrayList;
import java.util.List;
public class Lucky_Numbers_in_a_Matrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li=new ArrayList<Integer>();
        List<Integer> li1=new ArrayList<Integer>();
        List<Integer> li2=new ArrayList<Integer>();
        int rmin=Integer.MAX_VALUE;
        int rmax=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rmin>matrix[i][j]){
                    rmin=matrix[i][j];
                }
            }
            li1.add(rmin);
            rmin=Integer.MAX_VALUE;
        }
        int cmax=Integer.MIN_VALUE;
        int rowst=0,colst=0,rowen=matrix.length,colen=matrix[0].length;
        for(int i=0;i<colen;i++){
            for(int j=0;j<rowen;j++){
                if(matrix[j][i]>cmax){
                    cmax=matrix[j][i];
                }
            }
            li2.add(cmax);
            cmax=Integer.MIN_VALUE;
        }
        for(int i:li1){
            for(int j:li2){
                if(i==j){
                    li.add(i);
                    break;
                }
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int [][] arr={{3,7,8},{9,11,13},{15,16,17}};
        // int[][] arr={{36376,85652,21002,4510},{68246,64237,42962,9974},{32768,97721,47338,5841},{55103,18179,79062,46542}};
        System.out.println(luckyNumbers(arr));
    }
}