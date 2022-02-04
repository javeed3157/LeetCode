//Time:O(m - 1) or O(n - 1)
//Space:O(1)
public class Unique_Paths{
    public static int uniquePaths(int m, int n) {
        int L = m + n - 2;
        double ans = 1;
        int R = m - 1;
        for(int i = 1; i <= R; i++){
            ans = ans * (L - R + i)/i;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(uniquePaths(m, n));
    }
}