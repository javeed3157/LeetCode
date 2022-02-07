// Time:O(m + n)
// Space:O(m)
import java.util.HashSet;
import java.util.Set;
public class Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> s = new HashSet<Character>();
        for(char c: jewels.toCharArray()){
            s.add(c);
        }
        for(char c: stones.toCharArray()){
            if(s.contains(c)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
