// Time:O(n)
// Space:O(1)
public class Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {
    public static int minPartitions(String n) {
        int ans = 0 ;
        for(int i = 0; i < n.length(); i++){
            ans = Math.max(ans, n.charAt(i) - '0');
            if(ans == 9){
                return 9;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String n = "82734";
        System.out.println(minPartitions(n));
    }
}
