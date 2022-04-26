// Time:O(max(m,n))
// Space:O(max(m,n))
public class Add_Binary {
    public static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0, sum = 0;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0){
                sum += a.charAt(i--) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j--) - '0';
            }
            if(sum > 1){
                carry = 1;
            }
            else{
                carry = 0;
            }
            s.append(sum % 2);
        }
        if(carry != 0){
            s.append(carry);
        }
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
