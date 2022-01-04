// Time:O(9^(n*n))
// Space:O(n*n)
public class Sudoku_Solver {
    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
    public static boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nextrow = 0;
        int nextcol = 0;
        if(col == board.length - 1){
            nextrow = row + 1;
            nextcol = 0;
        }
        else{
            nextrow = row;
            nextcol = col + 1;
        }
        if(board[row][col] != '.'){
            if(helper(board, nextrow, nextcol)){
                return true;
            }
        }
        else{
            for(int i = 1; i <= board.length; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nextrow, nextcol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, int number){
        // For horizontal and vertical checks
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
        }
        // For grid check
        int gridrow = (row/3) * 3;
        int gridcol = (col/3) * 3;
        for(int i = gridrow; i < gridrow + 3; i++){
            for(int j = gridcol; j< gridcol + 3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','.','5'},{'.','.','.','.','8','.','.','.','7','9'}};
        solveSudoku(board);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
