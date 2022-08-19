// Time:O(n)
// Space:O(1)
public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        int total = 0;
        int minsorecent = prices[0];
        for(int i = 0; i < prices.length; i++){
            minsorecent = Math.min(prices[i], minsorecent);
            int curr = prices[i] - minsorecent;
            if(curr > 0){
                total += curr;
                minsorecent = prices[i];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
