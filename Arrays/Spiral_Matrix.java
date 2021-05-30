import java.util.ArrayList;
import java.util.List;
public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int row_start=0,col_start=0,row_end=matrix.length-1,col_end=matrix[0].length-1;
        while(row_start<=row_end && col_start<=col_end){
            for(int col=col_start;col<=col_end;col++){
                list.add(matrix[row_start][col]);
            }
            row_start+=1;
            for(int row=row_start;row<=row_end;row++){
                list.add(matrix[row][col_end]);
            }
            col_end-=1;
            if(row_start<=row_end){
                for(int col=col_end;col>=col_start;col--){
                    list.add(matrix[row_end][col]);
                }
            }
            row_end-=1;
            if(col_start<=col_end){
                for(int row=row_end;row>=row_start;row--){
                    list.add(matrix[row][col_start]);
                }
            }
            col_start+=1;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }
}
