// Time:O(n)
// Space:O(n)
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i) - 'a'] -= 1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
