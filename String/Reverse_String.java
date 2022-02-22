// Time:O(n)
// Space:O(n)
public class Reverse_String {
    public static void reverseString(char[] s) {
        int l = 0;
        int h = s.length - 1;
        while(l <= h){
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
            l += 1;
            h -= 1;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char i : s){
            System.out.print(i + " ");
        }
    }
}
