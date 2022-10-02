// Time:O(n*m)
// Space:O(1)
public class Maximum_Sum_of_an_Hourglass {
    public static int maxSum(int[][] grid) {
        int maxi = 0;
        for(int i = 0; i < grid.length - 2; i++){
            int sums = 0;
            int count = 1;
            for(int j = 0; j < grid[0].length; j++){
                if(count == 3){
                    sums += grid[i][j] + grid[i + 1][j - 1];
                    int down = 0;
                    for(int k = j - 2; k < j + 1; k++){
                        down += grid[i + 2][k];
                    }
                    maxi = Math.max(sums + down, maxi);
                    sums -= grid[i][j - 2];
                    sums -= grid[i + 1][j - 1];
                }
                else{
                    sums += grid[i][j];
                    count += 1;
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[][] grid = {{6,2,1,3}, {4,2,1,5}, {9,2,8,7}, {4,1,2,9}};
        System.out.println(maxSum(grid));
    }
}
