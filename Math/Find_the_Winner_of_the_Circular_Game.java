// Time:O(n)
// Space:O(1)
public class Find_the_Winner_of_the_Circular_Game {
    public static int findTheWinner(int n, int k) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            res = (res + k) % i;
        }
        return res + 1;
    }
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
