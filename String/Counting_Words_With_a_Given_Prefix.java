// Time:O(n)
// Space:O(1)
public class Counting_Words_With_a_Given_Prefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words,pref));
    }
}
