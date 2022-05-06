// Time:O(n)
// Space:O(n)
public class Remove_All_Adjacent_Duplicates_In_String{
    public static String removeDuplicates(String s) {
        int n = s.length(), j = 0;
        char[] arr = s.toCharArray(); 
        for(int i = 0; i < n; i++){
            arr[j] = arr[i];
            if(j > 0 && arr[j - 1] == arr[j]){
                j -= 2;
            }
            j += 1;
        }
        return new String(arr, 0, j);
    }
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}