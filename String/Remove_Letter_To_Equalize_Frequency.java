// Time:O(n^2)
// Space:(n)
import java.util.*;
public class Remove_Letter_To_Equalize_Frequency {
    public static boolean equalFrequency(String word) {
        for(int i = 0; i < word.length(); i++){
            String news = "";
            for(int j = 0; j < word.length(); j++){
                if(i != j){
                    news += word.charAt(j);
                }
            }
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = 0; j < news.length(); j++){
                map.put(news.charAt(j), map.getOrDefault(news.charAt(j),1) + 1);
            }
            int checker = 0;
            int k = 0;
            int test = 0;
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(k == 0){
                    checker = entry.getValue();
                    k += 1;
                }
                else{
                    if(checker != entry.getValue()){
                        test = 1;
                        break;
                    }
                }
            }
            if(test == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word = "aabc";
        System.out.println(equalFrequency(word));
    }
}
