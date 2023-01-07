// Time:O(nlogn)
// Space:O(logn)
import java.util.Arrays;
public class Maximum_Ice_Cream_Bars {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for(int i = 0; i < costs.length; i++){
            if(costs[i] <= coins){
                ans += 1;
                coins -= costs[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
}
