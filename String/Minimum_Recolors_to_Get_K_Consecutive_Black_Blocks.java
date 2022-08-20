// Time:O(n^2)
// Space:O(1)
public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static int minimumRecolors(String blocks, int k) {
        int bc = 0;
        int mc = 0;
        for(int i = 0; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'B'){
                bc += 1;
            }
            else{
                mc = Math.max(mc, bc);
                bc = 0;
            }
            if(bc == k){
                return 0;
            }
        }
        if(k == blocks.length()){
            int wc = 0;
            for(int i = 0; i < blocks.length(); i++){
                if(blocks.charAt(i) == 'W'){
                    wc += 1;
                }
            }
            return wc;
        }
        int count = 0;
        int minc = 101;
        int tot = 0;
        for(int i = 0; i < blocks.length(); i++){
            count = 0;
            bc = 0;
            tot = 0;
            if(blocks.charAt(i) == 'B'){
                bc += 1;
            }
            else{
                count += 1;
            }
            tot += 1;
            for(int j = i + 1; j < blocks.length(); j++){
                if(blocks.charAt(j) == 'B'){
                    bc += 1;
                    tot += 1;
                }
                else{
                    count += 1;
                    tot += 1;
                }
                if(tot == k){
                    minc = Math.min(minc, count);
                    
                    break;
                }
                
            }
        }
        return minc;
        
    }
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }
}
