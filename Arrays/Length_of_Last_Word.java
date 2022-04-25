// Time:O(n)
// Space:O(1)
public class Length_of_Last_Word{
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                count += 1;
            }
            else{
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}