// Time:O(1)
// Space:O(1)
public class Add_Digits {
    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        if(num % 9 == 0){
            return 9;
        }
        return num % 9;
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
