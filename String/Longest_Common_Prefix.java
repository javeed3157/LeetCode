// Time:O(nlogn)
// Space:O(1)
public class Longest_Common_Prefix{
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int min_Len = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            min_Len = Math.min(min_Len, strs[i].length());
        }
        int l = 1;
        int h = min_Len;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(yes(strs, mid)){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return strs[0].substring(0 , (l + h) / 2);
    }
    public static boolean yes(String[] str, int n){
        String s = str[0].substring(0, n);
        for(int i = 1; i < str.length; i++){
            if(!str[i].startsWith(s)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}