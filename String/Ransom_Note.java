// Time;O(n)
// Space:O(n)
import java.util.*;
public class Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0)+1);
            // System.out.println(magazine.charAt(i) + " "+ map.get(magazine.charAt(i)));
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){
                if(map.get(ransomNote.charAt(i)) > 0){
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
