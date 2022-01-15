// Time:O(n)
// Space:O(1)
public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        String temp = "";
        String res = "";
        int l = 0;
        int h = s.length() - 1;
        while(l <= h){
            char c = s.charAt(l);
            if(c != ' '){
                temp += c;
            }
            else{
                if(res == ""){
                    res = temp;
                }
                else if (temp != ""){
                    res = temp + " "+ res;
                }
                temp = "";
            }
            l += 1;
        }
        if(temp != ""){
            if(res == ""){
                    res = temp;
                }
                else{
                    res = temp + " "+ res;
                }
        }
        return res;
    }
    public static void main(String[] args) {
        String s= "the sky is blue";
        System.out.println(reverseWords(s));
        String st = "  hello world  ";
        System.out.println(reverseWords(st));
    }
}
