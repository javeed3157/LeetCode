// Time:O(n^2)
// Space:O(1)
public class Sum_of_Number_and_Its_Reverse {
    public static int reverse(int rev){
        int ans = 0;
        int r;
        while(rev > 0){
            r = rev % 10;
            ans = ans * 10 + r;
            rev /= 10;
        }
        return ans;
    }
    public static boolean sumOfNumberAndReverse(int num) {
        if(num == 0){
            return true;
        }
        if(num == 1){
            return false;
        }
        for(int i = 1; i <= num; i++){
            if(i + reverse(i) == num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 443;
        System.out.println(sumOfNumberAndReverse(num));
    }
}
