// Time:O(n)
// Space:O(1)
public class Gas_Station {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_gas = 0;
        int sum_cost = 0;
        int total = 0;
        int ans = 0;
        for(int i = 0; i < gas.length; i++){
            sum_gas += gas[i];
            sum_cost += cost[i];
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                ans = i + 1;
            }
        }
        if(sum_gas < sum_cost){
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] count = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, count));
    }
}
