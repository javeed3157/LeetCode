// Time:O(n)
// Space:O(1)
public class Teemo_Attacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if(n == 0){
            return 0;
        }
        int tot = 0;
        for(int i = 0; i < n - 1; i++){
            tot += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return tot + duration;
    }
    public static void main(String[] args) {
        int[] timeSeries = {1, 4};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}
