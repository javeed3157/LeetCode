// Time:O(n^2)
// Space:O(n)
import java.util.*;
public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1, s2));
    }
}
