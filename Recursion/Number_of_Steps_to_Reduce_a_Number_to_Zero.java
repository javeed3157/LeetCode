//Time:O(logn)
//Space:O(1)
public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static int numberOfSteps(int n) {
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return 1+numberOfSteps(n/2);
        }
        else{
            return 1+numberOfSteps(n-1);
        }
    }
    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
}
