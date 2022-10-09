// Time:O(n)
// Space:O(1)
public class The_Employee_That_Worked_on_the_Longest_Task {
    public static int hardestWorker(int n, int[][] logs) {
        int maxId = logs[0][0];
        int maxLog = logs[0][1];
        if(logs.length == 1){
            return maxId;
        }
        for(int i = 1; i < logs.length; i++){
            if(logs[i][1] - logs[i - 1][1] > maxLog){
                maxLog = logs[i][1] - logs[i - 1][1];
                maxId = logs[i][0];
            }
            else if(logs[i][1] - logs[i - 1][1] == maxLog){
                if(logs[i][0] < maxId){
                    maxId = logs[i][0];
                }
            }
        }
        return maxId;
    }
    public static void main(String[] args) {
        int n = 10;
        int[][] logs = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.println(hardestWorker(n, logs));
    }
}
