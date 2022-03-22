// Time:O(n)
// Space:O(n)
public class DI_String_Match {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];
        int l = 0, h = n, a = 0;
        for(char c:s.toCharArray()){
            if(c == 'I'){
                arr[a++] = l++;
            }
            else{
                arr[a++] = h--;
            }
        }
        arr[n] = h;
        return arr;
    }
    public static void main(String[] args) {
        String s = "IDID";
        for(int c:diStringMatch(s)){
            System.out.print(c+" ");
        }
    }
}