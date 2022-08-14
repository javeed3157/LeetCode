public class Largest_Local_Values_in_a_Matrix{
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] mat = new int[n -2][n - 2];
        int row = 0;
        int col = 0;
        while(row < n && col < n){
            int max = 0;
            if(row + 3 > n){
                break;
            }
            if(row + 3 <= n){
                for(int i = row; i < row + 3; i++){
                    if(col + 3 > n){
                        break;
                    }
                    for(int j = col; j < col + 3; j++){
                        System.out.print(grid[i][j]+" ");
                        if(grid[i][j] > max){
                            max = grid[i][j];
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println(row+" "+col);
            mat[row][col] = max;
            System.out.println(mat[row][col]);
            if(col + 3 <= n){
                col += 1;
            }
            if(col + 3 > n){
                
                row += 1;
                col = 0;
            }
        }
        return mat;
    }
}