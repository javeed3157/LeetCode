// Time:O(n)
// Space:O(n)
import java.util.Arrays;
public class Candy{
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]){
                arr[i] = arr[i - 1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                arr[i] = Math.max(arr[i],arr[i + 1] + 1);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));
    }
}