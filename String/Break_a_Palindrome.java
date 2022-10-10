// Time:O(n)
// Space:O(n)
public class Break_a_Palindrome {
    public static String breakPalindrome(String palindrome) {
        char[] arr = palindrome.toCharArray();
        int n = arr.length;
        if(n == 1){
            return "";
        }
        for(int i = 0; i < n/2; i++){
            if(arr[i] != 'a'){
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n - 1] = 'b';
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        String palindrome = "abccba";
        System.out.println(breakPalindrome(palindrome));
    }
}
