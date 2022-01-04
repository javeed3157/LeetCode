import java.util.List;
import java.util.ArrayList;
//Time:O(n^n)
//Space:O(n)
public class N_Queens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> l = new ArrayList<>();
        char[][] arr = new char[n][n];
        helper(l, arr, 0);
        return l;
    }
    public static void helper(List<List<String>> l,char[][] arr,int col){
        if(col==arr.length){
            safe(l,arr);
            return;
        }
        for(int row = 0; row < arr.length; row++){
            if(isSafe(row,col,arr)){
                arr[row][col]='Q';
                helper(l,arr,col+1);
                arr[row][col]='.';
            }
        }
    }
    public static boolean isSafe(int row, int col,char[][] arr){
        //Horizontal check
        for(int i=0;i<arr.length;i++){  
            if(arr[row][i]=='Q'){
                return false;
            }
        }
        //Vertical check
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        //Upper-Left Diagonal check
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        // Upper-Right Diagonal check
        for(int i=row,j=col;i>=0 && j<arr[0].length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        // Lower-Left Diagonal check
        for(int i=row,j=col;i<arr.length && j>=0;i++,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        // Lower-Right Diagonal check
        for(int i=row,j=col;i<arr.length && j<arr[0].length;i++,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void safe(List<List<String>> l,char[][] arr){
        String row="";
        List<String> saver=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            row="";
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            saver.add(row);
        }
        l.add(saver);
    }
    public static void main(String[] args) {
        int n=4;
        for(List l:solveNQueens(n)){
            System.out.println(l);
        }
    }
}
