import java.util.HashMap;

// Time:O(n)
// Space:O(1)
public class First_Unique_Character_in_a_String{
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            dic.put(ch, dic.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(dic.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}