//Time:O(n^n)
//Space:O(n)
class Solutions {
    int count = 0;
    public  int totalNQueens(int n) {
        char arr[][] = new char[n][n];
        helper(arr, 0);
        return count;
    }
    public  void helper(char[][] arr, int col){
        if(col == arr[0].length){
            count+=1;
            return;
        }
        for(int row = 0; row < arr.length; row++){
            if(isSafe(row, col, arr)){
                arr[row][col] = 'Q';
                helper(arr, col+1);
                arr[row][col] = '.';
            }
        }
    }
    public  boolean isSafe(int row, int col, char[][] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[row][i] == 'Q'){
                return false;
            }
        }
        for(int i = 0; i < arr[0].length; i++){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row, j=col; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j < arr[0].length; i--, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row, j = col; i < arr.length && j >= 0; i++, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row ,j = col ; i < arr.length && j < arr[0].length; i++, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
public class N_Queens_II {
    public static void main(String[] args) {
        int n=8;
        Solutions s=new Solutions();
        System.out.println(s.totalNQueens(n));
    }
}
