// Time:O(n)
// Space:O(n)
public class Shortest_Distance_to_a_Character {
    public static int[] shortestToChar(String s, char c) {
        int pos = -s.length();
        int a[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == c){
                    pos = i;
                }
            a[i] = i - pos;
        } 
        for (int i = pos - 1; i >= 0; --i) {
            if (s.charAt(i) == c){
                pos = i;
            }
            a[i] = Math.min(a[i], pos - i);
        }
        return a;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        for (int i : shortestToChar(s, c)) {
            System.out.print(i+" ");
        }
    }
}
