// Time:O(n)
// Space:O(1)
public class Percentage_of_Letter_in_String {
    public static int percentageLetter(String s, char letter) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                count += 1;
            }
        }
        ans = (count * 100)/ s.length();
        return  ans;
    }
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s, letter));
    }
}
