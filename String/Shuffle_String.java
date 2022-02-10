// Time:O(n)
// Space:O(n)
public class Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            arr[indices[i]]= s.charAt(i);
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }
}
