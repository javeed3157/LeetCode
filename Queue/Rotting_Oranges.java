// Time:O(n*n)*4
// Space:O(n*n)
import java.util.Queue;
import java.util.LinkedList;
public class Rotting_Oranges {
    public static int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
                if(grid[i][j] != 0){
                    count += 1;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        int days = 0;
        int tot = 0;
        int[] dirX = {0, 1, -1, 0};
        int[] dirY = {1, 0, 0, -1};
        while(!q.isEmpty()){
            int len = q.size();
            tot += len;
            for(int i = 0; i < len; i++){
                int[] arr = q.poll();
                for(int j = 0; j < 4; j++){
                    int a = arr[0] + dirX[j];
                    int b = arr[1] + dirY[j];
                    if(a < 0 || b < 0 || a >= r || b >= c || grid[a][b] == 0 || grid[a][b] == 2){
                        continue;
                    }
                    grid[a][b] = 2;
                    q.offer(new int[]{a, b});
                }
            }
            if(!q.isEmpty()){
                days += 1;
            }
        }
        if(tot == count){
            return days;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(grid));
    }
}
