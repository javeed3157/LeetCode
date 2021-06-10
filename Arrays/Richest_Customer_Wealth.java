//Time:O(mn)
//Space:O(1)
public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int temp=0;
            for(int j=0;j<accounts[0].length;j++){
                temp+=accounts[i][j];
            }
            max=Math.max(max,temp);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][]={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));
    }
}
