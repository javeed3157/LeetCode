//Time:O(n^2)
//Space:O(n)
public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        if(matrix.length==matrix[0].length){
            for(int i=0;i<matrix.length;i++){
                for(int j=i;j<matrix[0].length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            return matrix;
        }
        else{
            int mat[][]=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    mat[j][i]=matrix[i][j];
                }
            }
            return mat;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // int arr[][]={{1,2,3},{4,5,6}};
        // int arr[][]{{3}};
        int c[][]=transpose(arr);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
