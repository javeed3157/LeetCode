//Time:O(log(n))
//Space:O(1)
public class Guess_Number_Higher_or_Lower{
    static int pick=6;
    public static int guess(int a){
        if(pick<a){
            return -1;
        }
        else if(pick>a){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int guessNumber(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            int ans=guess(mid);
            if(ans==0){
                return mid;
            }
            else if(ans<0){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(guessNumber(num));
    }
}
