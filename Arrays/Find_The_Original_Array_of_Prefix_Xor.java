// Time:O(n)
// Space:O(1)
public class Find_The_Original_Array_of_Prefix_Xor {
    public static int[] findArray(int[] pref) {
        if(pref.length == 1){
            return pref;
        }
        int xor = pref[0];
        for(int i = 1; i < pref.length; i++){
            int temp = pref[i];
            pref[i] = pref[i] ^ xor;
            xor = temp;
        }
        return pref;
    }
    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        for(int i: findArray(pref)){
            System.out.print(i + " ");
        }
    }
}
