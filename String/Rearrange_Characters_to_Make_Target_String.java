// Time:O(n)
// Space:O(n)
public class Rearrange_Characters_to_Make_Target_String{
    public static int rearrangeCharacters(String s, String target) {
        int[] str = new int[26];
        int[] tar = new int[26];
        for(int i = 0; i < s.length(); i++){
            str[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < target.length(); i++){
            tar[target.charAt(i) - 'a'] += 1;
        }
        int ans = s.length();
        for(int i = 0; i < 26; i++){
            if(tar[i] != 0){
                ans = Math.min(ans, str[i]/tar[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        System.out.println(rearrangeCharacters(s, target));
    }
}