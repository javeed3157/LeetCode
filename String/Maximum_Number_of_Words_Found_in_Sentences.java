// Time:O(n^m)
// Space:O(1)
public class Maximum_Number_of_Words_Found_in_Sentences {
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        int n = sentences.length;
        for(int i = 0; i < n; i++){
            int temp = 0;
            String s = sentences[i];
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ' '){
                    temp += 1;
                }
            }
            temp += 1;
            count = Math.max(count, temp);
        }
        return count;
    }
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }
}
