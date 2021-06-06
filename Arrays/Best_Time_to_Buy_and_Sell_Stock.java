//Time:O(n)
//Space:O(1)
public class Best_Time_to_Buy_and_Sell_Stock{
    public static int maxProfit(int[] prices) {
        int maxsofar=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(minsofar,prices[i]);
            int curr=prices[i]-minsofar;
            maxsofar=Math.max(maxsofar,curr);
        }
        return maxsofar;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}