//Time:O(n)
//Space:O(1)
public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        int profitsofar=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profitsofar+=prices[i]-prices[i-1];
            }
        }
        return profitsofar;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
//Other approach is using local maxima and minima