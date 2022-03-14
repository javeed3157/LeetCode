// Time:O(n)
// Space:O(n)
public class  Sorting_the_Sentence{
    public static  String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans_arr = new String[arr.length];
        int i = 0;
        for(String str : arr){
            i = (int)(str.charAt(str.length() - 1) - '0');
            ans_arr[i - 1] = str.substring(0, str.length() - 1);
        }
        String ans = "";
        for(i = 0; i < ans_arr.length - 1; i++){
            ans += ans_arr[i] + " ";
        }
        ans += ans_arr[i];
        return ans;
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}