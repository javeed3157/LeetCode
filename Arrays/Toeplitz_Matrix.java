// Time:O(n)
// Space:O(1)
public class Toeplitz_Matrix{
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix[0].length==1  || matrix.length==1){
            return true;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==matrix[i-1][j-1]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.print(isToeplitzMatrix(arr));
    }
}