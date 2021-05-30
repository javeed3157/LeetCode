//Time:O(n)
//Space:O(1)
//This problem can be solved in two ways by taking base(matrix.length-1,0) or base(0,matrix[0].length-1)
public class Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        boolean present=false;
        while(r<matrix.length && c>=0){
            if(target == matrix[r][c]){
                present=true;
                break;
            }
            else if(matrix[r][c] > target){
                c-=1;
            }
            else{
                r+=1;
            }
        }
        return present;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int tar=3;
        System.out.println(searchMatrix(arr,tar));
    }
}
// public boolean searchMatrix(int[][] matrix, int target) {
//     int r=matrix.length-1;
//     int c=0;
//     boolean present=false;
//     while(r>=0&& c<=matrix[0].length-1){
//         if(target == matrix[r][c]){
//             present=true;
//             break;
//         }
//         else if(matrix[r][c] > target){
//             r-=1;
//         }
//         else{
//             c+=1;
//         }
//     }
//     return present;
// }