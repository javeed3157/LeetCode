// Time:O(n)
// Space:O(n)
public class Reverse_String {
    public static void reverseString(char[] s) {
        reverse(0, s); 
    }
    public static void reverse(int i, char[] s){
        if(i >= s.length / 2){
            return;
        }
        char temp = s[i];
        s[i] = s[s.length - i - 1];
        s[s.length - i - 1] = temp;
        reverse(i + 1, s);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
