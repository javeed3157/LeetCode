import java.util.Arrays;
//Time:O(n^2)
//Space:O(1)
public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static boolean findRotation(int[][] matrix, int[][] target) {
        for(int k=0;k<4;k++){
            if(Arrays.deepEquals(matrix,target)){
                return true;
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=i;j<matrix[0].length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length/2;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][matrix.length-1-j];
                    matrix[i][matrix.length-1-j]=temp;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0},{0,1,0},{1,1,1}};
        int tar[][]={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(arr, tar));
    }
}
